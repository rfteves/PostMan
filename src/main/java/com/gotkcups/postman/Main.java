/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gotkcups.postman;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gotkcups.data.Constants;
import com.gotkcups.io.GateWay;
import com.gotkcups.io.RestHttpClient;
import com.gotkcups.io.Utilities;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.apache.commons.lang.StringEscapeUtils;
import org.bson.Document;

/**
 *
 * @author ricardo
 */
public class Main extends javax.swing.JFrame {

  /**
   * Creates new form Main
   */
  public Main() {
    UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("Arial", Font.PLAIN, 20));
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    JFrame parent = this;
    parent.setSize(screenSize);
    parent.setExtendedState(Frame.MAXIMIZED_BOTH);
    parent.setState(Frame.MAXIMIZED_BOTH);
    this.setSize(screenSize);
    this.setPreferredSize(screenSize);
    this.setSize(screenSize);
    this.setLocationRelativeTo(parent);
    //registerDialog(dlg);

    initComponents();
    afterInit();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    httpGroup = new javax.swing.ButtonGroup();
    configureGroup = new javax.swing.ButtonGroup();
    getRadio = new javax.swing.JRadioButton();
    postRadio = new javax.swing.JRadioButton();
    putRadio = new javax.swing.JRadioButton();
    url = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jTabbedPane1 = new javax.swing.JTabbedPane();
    jScrollPane2 = new javax.swing.JScrollPane();
    outputText = new javax.swing.JTextArea();
    jScrollPane1 = new javax.swing.JScrollPane();
    inputText = new javax.swing.JTextArea();
    jScrollPane3 = new javax.swing.JScrollPane();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    namespace = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    key = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    taxable = new javax.swing.JCheckBox();
    jLabel5 = new javax.swing.JLabel();
    urlText = new javax.swing.JTextField();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    defaultshipping = new javax.swing.JTextField();
    jScrollPane4 = new javax.swing.JScrollPane();
    costcoText = new javax.swing.JTextArea();
    jScrollPane5 = new javax.swing.JScrollPane();
    jPanel2 = new javax.swing.JPanel();
    jButton6 = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    productid = new javax.swing.JTextField();
    jButton7 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    restButton = new javax.swing.JButton();
    costcoButton = new javax.swing.JButton();
    jLabel7 = new javax.swing.JLabel();
    pid = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    vid = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    mid = new javax.swing.JTextField();
    configure = new javax.swing.JButton();
    pidRadio = new javax.swing.JRadioButton();
    vidRadio = new javax.swing.JRadioButton();
    midRadio = new javax.swing.JRadioButton();
    metaRadio = new javax.swing.JRadioButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    getRadio.setSelected(true);
    getRadio.setLabel("Get");

    postRadio.setLabel("Post");

    putRadio.setLabel("Put");

    jLabel1.setText("Enter URL");

    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    outputText.setColumns(20);
    outputText.setRows(5);
    outputText.setWrapStyleWord(true);
    jScrollPane2.setViewportView(outputText);

    jTabbedPane1.addTab("Output", jScrollPane2);

    inputText.setColumns(20);
    inputText.setRows(5);
    inputText.setWrapStyleWord(true);
    jScrollPane1.setViewportView(inputText);

    jTabbedPane1.addTab("Input", jScrollPane1);

    jLabel2.setText("Namespace");

    namespace.setText("inventory");

    jLabel3.setText("Key");

    key.setText("vendor");

    jLabel4.setText("Taxable");

    jLabel5.setText("URL");

    jButton3.setText("MetaIt");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setText("Publish");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jLabel6.setText("Default Shipping");

    defaultshipping.setText("1.50");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(18, 18, 18)
            .addComponent(urlText, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jButton3)
            .addGap(18, 18, 18)
            .addComponent(jButton4))
          .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
              .addComponent(jLabel6)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(defaultshipping))
            .addGroup(jPanel1Layout.createSequentialGroup()
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4))
              .addGap(52, 52, 52)
              .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(taxable)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(namespace)
                  .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        .addContainerGap(1000, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(namespace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(taxable))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(defaultshipping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(urlText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(27, 27, 27)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton3)
          .addComponent(jButton4))
        .addContainerGap(150, Short.MAX_VALUE))
    );

    jScrollPane3.setViewportView(jPanel1);

    jTabbedPane1.addTab("MetaIt", jScrollPane3);

    costcoText.setColumns(20);
    costcoText.setRows(5);
    jScrollPane4.setViewportView(costcoText);

    jTabbedPane1.addTab("Costco", jScrollPane4);

    jButton6.setText("Create Variants");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    jLabel10.setText("Product ID");

    jButton7.setText("Publish");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton7ActionPerformed(evt);
      }
    });

    jButton8.setText("Fix Images / Barcode");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton8ActionPerformed(evt);
      }
    });

    jButton9.setText("Submit Images / Barcode");
    jButton9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton9ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        .addContainerGap(1110, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(25, 25, 25)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10)
          .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton6)
          .addComponent(jButton7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton8)
          .addComponent(jButton9))
        .addContainerGap(276, Short.MAX_VALUE))
    );

    jScrollPane5.setViewportView(jPanel2);

    jTabbedPane1.addTab("VariantIt", jScrollPane5);

    restButton.setText("Rest");
    restButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        restButtonActionPerformed(evt);
      }
    });

    costcoButton.setText("Costco");
    costcoButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        costcoButtonActionPerformed(evt);
      }
    });

    jLabel7.setText("PID");

    jLabel8.setText("VID");

    jLabel9.setText("MID");

    configure.setText("Configure");
    configure.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        configureActionPerformed(evt);
      }
    });

    pidRadio.setSelected(true);
    pidRadio.setText("Pid");

    vidRadio.setText("Vid");

    midRadio.setText("Mid");

    metaRadio.setText("Meta");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jTabbedPane1))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel1)
              .addComponent(getRadio))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(url)
              .addGroup(layout.createSequentialGroup()
                .addComponent(postRadio)
                .addGap(2, 2, 2)
                .addComponent(putRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(restButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costcoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(configure)
                .addGap(18, 18, 18)
                .addComponent(pidRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vidRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(midRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metaRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(getRadio)
          .addComponent(postRadio)
          .addComponent(putRadio)
          .addComponent(restButton)
          .addComponent(costcoButton)
          .addComponent(jLabel7)
          .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8)
          .addComponent(vid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9)
          .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(configure)
          .addComponent(pidRadio)
          .addComponent(vidRadio)
          .addComponent(midRadio)
          .addComponent(metaRadio))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTabbedPane1)
        .addContainerGap())
    );

    jLabel9.getAccessibleContext().setAccessibleDescription("");

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void restButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restButtonActionPerformed
    String json = null;
    if (getRadio.isSelected()) {
      json = RestHttpClient.processGet(url.getText());
    } else if (postRadio.isSelected()) {
      json = RestHttpClient.processPost(url.getText(), inputText.getText());
    } else if (putRadio.isSelected()) {
      json = RestHttpClient.processPut(url.getText(), inputText.getText());
    }
    if (json != null) {
      Document output = Document.parse(json);
      ObjectMapper mapper = new ObjectMapper();
      try {
        outputText.setText(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output));
      } catch (JsonProcessingException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }//GEN-LAST:event_restButtonActionPerformed

    private void costcoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costcoButtonActionPerformed
      String html = RestHttpClient.processGet(url.getText());
      Document vendor = new Document();
      CostcoPage.explain(vendor, html);
      Document products = (Document) vendor.get(Constants.Costco_Products);
      ObjectMapper mapper = new ObjectMapper();
      try {
        costcoText.setText(StringEscapeUtils.unescapeHtml(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(products)));
      } catch (JsonProcessingException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_costcoButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Document output = Document.parse(outputText.getText());
      Document product = (Document) output.get(Constants.Product);
      List<Document> variants = (List) product.get(Constants.Variants);
      Document metafields = new Document();
      List<Document> metas = new ArrayList<>();
      metafields.put(Constants.Metafields, metas);
      for (Document variant : variants) {
        Document meta = new Document();
        metas.add(meta);
        meta.put(Constants.Namespace, namespace.getText());
        meta.put(Constants.Key, key.getText());
        meta.put(Constants.Value_Type, "string");
        Document vendors = new Document();
        List<Document> values = new ArrayList<>();
        vendors.put(Constants.Vendors, values);
        Document vendor = new Document();
        vendor.put(Constants.Variantid, variant.getLong("id"));
        vendor.put(Constants.Product_Id, variant.getLong(Constants.Product_Id));
        vendor.put(Constants.Taxable, taxable.isSelected());
        vendor.put(Constants.URL, urlText.getText());
        vendor.put(Constants.Sku, variant.getString(Constants.Sku));
        vendor.put(Constants.Pageid, variant.getString(Constants.Sku));
        vendor.put(Constants.DefaultShipping, Double.parseDouble(defaultshipping.getText()));
        values.add(vendor);
        meta.put(Constants.Value, vendors.toJson());
      }
      output = Document.parse(metafields.toJson());
      ObjectMapper mapper = new ObjectMapper();
      try {
        inputText.setText(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output));
      } catch (JsonProcessingException ex) {
        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      Document output = Document.parse(inputText.getText());
      List<Document> metafields = (List) output.get(Constants.Metafields);
      for (Document metafield : metafields) {
        String val = metafield.getString(Constants.Value);
        Document vendors = Document.parse(val);
        List<Document> vends = (List) vendors.get(Constants.Vendors);
        System.out.println();
        System.out.println(metafield.toJson());
        Document meta = new Document();
        meta.put(Constants.Metafield, metafield);
        GateWay.createVariantMetaField("prod", vends.get(0).getLong(Constants.Product_Id), vends.get(0).getLong("variantid"), meta.toJson());
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void configureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureActionPerformed
      String keya = null;
      String urle = null;
      if (metaRadio.isSelected() && pid.getText().trim().length() != 0 && vid.getText().trim().length() != 0) {
        keya = Utilities.getApplicationProperty("url.key.password.meta");
        urle = String.format(keya, pid.getText().trim(), vid.getText().trim());
      } else if (pidRadio.isSelected() && pid.getText().trim().length() != 0) {
        keya = Utilities.getApplicationProperty("url.key.password.pid");
        urle = String.format(keya, pid.getText().trim());
      } else if (vidRadio.isSelected() && pid.getText().trim().length() != 0 && vid.getText().trim().length() != 0) {
        keya = Utilities.getApplicationProperty("url.key.password.vid");
        urle = String.format(keya, pid.getText().trim(), vid.getText().trim());
      } else if (midRadio.isSelected() && mid.getText().trim().length() != 0 && vid.getText().trim().length() != 0 && mid.getText().trim().length() != 0) {
        keya = Utilities.getApplicationProperty("url.key.password.mid");
        urle = String.format(keya, pid.getText().trim(), vid.getText().trim(), mid.getText().trim());
      }
      if (urle != null) {
        url.setText(urle);
      } else {
        url.setText("No viable URL evaluated.");
      }


    }//GEN-LAST:event_configureActionPerformed

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Document products = Document.parse(costcoText.getText());
    List<Document> prods = (List) ((List) products.get("products")).get(0);
    List<Document> variants = new ArrayList<>();
    Document options = new Document();
    for (Document product : prods) {
      Document variant = new Document();
      variants.add(variant);
      variant.put(Constants.Sku, String.format("%sC", product.getString("partNumber")));
      List<Document> choices = (List) product.get("choices");
      int[] index = new int[1];
      for (Document choice : choices) {
        Set<Entry<String, Object>> entry = choice.entrySet();
        entry.stream().forEach(kv -> {
          variant.put(String.format("option%d", ++index[0]), kv.getValue().toString());
          boolean exists = false;
          Document opt = (Document)options.get(kv.getKey());
          if (opt == null) {
            opt = new Document();
            opt.put("name", kv.getKey());
            opt.put("values", new LinkedHashSet<String>());
            options.put(kv.getKey(), opt);
          }
          Set<String> values = (Set) opt.get("values");
          values.add(kv.getValue().toString());
        });
      }
    }
    // Update product options
    List<Document> changes = new ArrayList<>();
    Set<Entry<String, Object>> entry = options.entrySet();
    entry.stream().forEach(kv->{
      changes.add((Document)kv.getValue());
    });
    Document output = new Document();
    Document change = new Document();
    change.put(Constants.Id, Long.parseLong(productid.getText().trim()));
    change.put("options", changes);
    output.put(Constants.Product, change);
    output.put(Constants.Product, change);
    //GateWay.updateProduct(Constants.Production, Long.parseLong(productid.getText().trim()), output.toJson());
    
    
    output.put(Constants.Variants, variants);
    ObjectMapper mapper = new ObjectMapper();
    try {
      inputText.setText(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(output));
    } catch (JsonProcessingException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
    int debug = 0;
  }//GEN-LAST:event_jButton6ActionPerformed

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    Document products = Document.parse(inputText.getText());
    List<Document> variants = (List) products.get(Constants.Variants);
    for (Document variant : variants) {
      Document var = new Document();
      var.put(Constants.Variant, variant);
      variant.put("inventory_policy", "deny");
      variant.put("inventory_management", "shopify");
      variant.put("fulfillment_service", "manual");
      variant.put("inventory_quantity", 0);
      variant.put("weight", 0.01);
      variant.put("weight_unit", "lb");
      GateWay.createProductVariant(Constants.Production, Long.parseLong(productid.getText().trim()), var.toJson());
      System.out.println(variant);
    }
  }//GEN-LAST:event_jButton7ActionPerformed

  private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    Document products = Document.parse(outputText.getText());
    Document product = (Document)products.get(Constants.Product);
    List<Document> variants = (List) product.get(Constants.Variants);
    Document colorImage = new Document();
    for (Document variant : variants) {
      if (variant.get("image_id") != null) {
        colorImage.put(variant.getString("option1"), variant.get("image_id"));
      }
      if (variant.get("barcode") != null && variant.getString("barcode").length() > 0) {
        colorImage.put("barcode", variant.get("barcode"));
      }
    }
    for (Document variant : variants) {
      if (colorImage.get(variant.getString("option1")) != null) {
        variant.put("image_id", colorImage.get(variant.getString("option1")));
      }
      if (colorImage.get("barcode") != null && colorImage.getString("barcode").length() > 0) {
        variant.put("barcode", colorImage.get("barcode"));
      }
    }
    ObjectMapper mapper = new ObjectMapper();
    try {
      inputText.setText(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(product));
    } catch (JsonProcessingException ex) {
      Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_jButton8ActionPerformed

  private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    Document products = Document.parse(inputText.getText());
    List<Document> variants = (List) products.get(Constants.Variants);
    Document change = new Document();
    for (Document variant: variants) {
      change.put(Constants.Id, variant.getLong(Constants.Id));
      change.put("barcode", variant.getString("barcode"));
      change.put("image_id", variant.get("image_id"));
      GateWay.updateVariant(Constants.Production, variant.getLong(Constants.Id), new Document("variant", change).toJson());
      int y = 0;
    }
  }//GEN-LAST:event_jButton9ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Main dialog = new Main();
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton configure;
  private javax.swing.ButtonGroup configureGroup;
  private javax.swing.JButton costcoButton;
  private javax.swing.JTextArea costcoText;
  private javax.swing.JTextField defaultshipping;
  private javax.swing.JRadioButton getRadio;
  private javax.swing.ButtonGroup httpGroup;
  private javax.swing.JTextArea inputText;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JButton jButton9;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JScrollPane jScrollPane5;
  private javax.swing.JTabbedPane jTabbedPane1;
  private javax.swing.JTextField key;
  private javax.swing.JRadioButton metaRadio;
  private javax.swing.JTextField mid;
  private javax.swing.JRadioButton midRadio;
  private javax.swing.JTextField namespace;
  private javax.swing.JTextArea outputText;
  private javax.swing.JTextField pid;
  private javax.swing.JRadioButton pidRadio;
  private javax.swing.JRadioButton postRadio;
  private javax.swing.JTextField productid;
  private javax.swing.JRadioButton putRadio;
  private javax.swing.JButton restButton;
  private javax.swing.JCheckBox taxable;
  private javax.swing.JTextField url;
  private javax.swing.JTextField urlText;
  private javax.swing.JTextField vid;
  private javax.swing.JRadioButton vidRadio;
  // End of variables declaration//GEN-END:variables

  private void afterInit() {

    javax.swing.plaf.FontUIResource dialog = new javax.swing.plaf.FontUIResource("Arial", Font.PLAIN, 18);
    UIManager.put("TextField.font", dialog);
    UIManager.put("TextArea.font", dialog);
    UIManager.put("Label.font", dialog);
    UIManager.put("Button.font", dialog);
    // Table
    UIManager.put("Table.font", dialog);

    UIManager.put("CheckBox.font", dialog);
    UIManager.put("TableHeader.font", dialog);
    UIManager.put("List.font", dialog);

    this.httpGroup.add(getRadio);
    this.httpGroup.add(postRadio);
    this.httpGroup.add(putRadio);
    this.configureGroup.add(pidRadio);
    this.configureGroup.add(vidRadio);
    this.configureGroup.add(midRadio);
    this.configureGroup.add(metaRadio);
    this.url.setText(Utilities.getApplicationProperty("url.key.password"));

  }
}
