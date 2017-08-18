/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.postman;

import com.gotkcups.data.Constants;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringEscapeUtils;
import org.bson.Document;

/**
 *
 * @author Ricardo
 */
public class CostcoPage {

    public static void explain(Document vendor, String html) {
        if (html.contains("var products = ")) {
            int start = html.indexOf("var products = ") + 15;
            int end = html.indexOf("];", start) + 1;
            StringBuilder products = new StringBuilder(html.substring(start, end).replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " "));
            products.insert(0, "{\"products\":");
            products.append("}");
            vendor.put(Constants.Costco_Products, Document.parse(products.toString()));
        } else {
            vendor.put(Constants.Status, Constants.Product_Not_Found);
            return;
        }
        if (html.contains("var options = ")) {
            int start = html.indexOf("var options = ") + 14;
            int end = html.indexOf("];", start) + 1;
            StringBuilder options = new StringBuilder(html.substring(start, end).replaceAll("[\n\r\t]", "").replaceAll("[ ]{2,}", " "));
            options.insert(0, "{\"options\":");
            options.append("}");
            vendor.put(Constants.Costco_Options, Document.parse(options.toString()));
        }
        Document products = (Document) vendor.get(Constants.Costco_Products);
        List<Document> prods = (List) ((List) products.get("products")).get(0);
        Document options = (Document) vendor.get(Constants.Costco_Options);
        List<Document> opts = (List) ((List) options.get("options")).get(0);
        for (Document product : prods) {
            describeOptions(product, options);
            Document copy = new Document();
            copy.putAll(product);
            copy.entrySet().stream().map(obj -> obj.getKey()).forEach(key -> {
                boolean delete = true;
                for (String field : FIELDS) {
                    if (field.equals(key)) {
                        delete = false;
                        break;
                    }
                }
                if (delete) {
                    product.remove(key);
                }
            });
        }
    }

    static String[] FIELDS = {"partNumber",
        "productName",
        "productUrl",
        "inventory",
        "ordinal",
        "choices"};

    private static void describeOptions(Document product, Document options) {
        List<Document> opts = (List) ((List) options.get("options")).get(0);
        List<Document> choices = new ArrayList<>();
        product.put("choices", choices);
        for (Document option : opts) {
            String key = StringEscapeUtils.unescapeHtml(option.getString("n"));
            String value = null;
            Document v = (Document) option.get("v");
            List<String> productOptions = (List) product.get("options");
            for (String productOption : productOptions) {
                if (v.containsKey(productOption)) {
                    value = StringEscapeUtils.unescapeHtml(v.getString(productOption));
                    break;
                }
            }
            Document choice = new Document();
            choice.put(key, value);
            choices.add(choice);
        }
    }
}
