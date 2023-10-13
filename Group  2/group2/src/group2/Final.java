/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package group2;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Admin
 */
public class Final extends javax.swing.JFrame {
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;
    Connection con = null;
    /**
     * Creates new form Final
     * 
     * 
     */
     public Final() {
        initComponents();
        con = DBConnect.connect();
        txtid.setVisible(false);
        cmdimage.setVisible(false);
    }
     
     public ImageIcon resizeImage(String imagePath,byte[] pic){
        
        ImageIcon myImage = null;
        if(imagePath != null){
        
            myImage = new ImageIcon(imagePath);
        
        }else{
        
            myImage = new ImageIcon(pic);
        }
        
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(lblImage.getHeight(),lblImage.getWidth(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
        
    }
    
   
    
    public void fetch(){
        txtid.setEnabled(false);
        deldate.setEnabled(false);
        txtqty.setEnabled(false);
        cmdadd.setEnabled(true);
        cmdsave.setEnabled(false);
        cmdedit.setEnabled(true);
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(true);
        cmdexit.setText("Exit");
        tbl1.setEnabled(true);
        try {
            
            PreparedStatement ps = con.prepareStatement("select * from inventory order by id asc");

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String product = rs.getString("product");
                String qty = rs.getString("qty");
                String category = rs.getString("category");
                String supplier = String.valueOf(rs.getInt("supplier"));
                String deliverydate = rs.getString("deliveredate");
                String expirydate = rs.getString("expirydate");
                byte [] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(lblImage.getWidth(),
                        lblImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                String user = rs.getString("user");
                
                txtid.setText(""+id);
                txtproduct.setText(product);
                txtqty.setText(""+qty);
                cmbcategory.addItem(category);
                txtsupplier.setText(supplier);
                ((JTextField)deldate.getDateEditor().getUiComponent()).setText(deliverydate);
                ((JTextField)expdate.getDateEditor().getUiComponent()).setText(expirydate);
                lblImage.setIcon(newImage);
                
               
               
                
                
                String tbData[] = {product,qty,category,supplier,deliverydate,expirydate,user};
                    DefaultTableModel tblModel = (DefaultTableModel)tbl1.getModel();
                    tblModel.addRow(tbData);

            
            }

        } catch (Exception ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public void fetch2(){
        txtid.setEnabled(false);
        deldate.setEnabled(false);
        txtqty.setEnabled(false);
        cmdadd.setEnabled(true);
        cmdsave.setEnabled(false);
        cmdedit.setEnabled(true);
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(true);
        cmdexit.setText("Exit");
        tbl1.setEnabled(true);
        try {
            
            PreparedStatement ps = con.prepareStatement("select * from inventory order by id asc");

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String product = rs.getString("product");
                String qty = rs.getString("qty");
                String category = rs.getString("category");
                String supplier = String.valueOf(rs.getInt("supplier"));
                String deliverydate = rs.getString("deliveredate");
                String expirydate = rs.getString("expirydate");
                byte [] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(lblImage.getWidth(),
                        lblImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                String user = rs.getString("user");
                
                txtid.setText(""+id);
                txtproduct.setText(product);
                txtqty.setText(""+qty);
                cmbcategory.addItem(category);
                txtsupplier.setText(supplier);
                ((JTextField)deldate.getDateEditor().getUiComponent()).setText(deliverydate);
                ((JTextField)expdate.getDateEditor().getUiComponent()).setText(expirydate);
                lblImage.setIcon(newImage);
                
               
               
                
                
                String tbData[] = {product,qty,category,supplier,deliverydate,expirydate,user};
                    DefaultTableModel tblModel = (DefaultTableModel)tbl1.getModel();
                    tblModel.addRow(tbData);

            
            }

        } catch (Exception ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        cmdadd = new javax.swing.JButton();
        cmdedit = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        cmddelete = new javax.swing.JButton();
        cmdsearch = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdsave = new javax.swing.JButton();
        cmdupdate = new javax.swing.JButton();
        txtsupplier = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtproduct = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        cmdimage = new javax.swing.JButton();
        deldate = new com.toedter.calendar.JDateChooser();
        expdate = new com.toedter.calendar.JDateChooser();
        cmbcategory = new javax.swing.JComboBox<>();
        txtuser = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product");

        Category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.setText("Supplier");

        cmdadd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdadd.setForeground(new java.awt.Color(0, 102, 102));
        cmdadd.setText("ADD");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdedit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdedit.setForeground(new java.awt.Color(0, 102, 102));
        cmdedit.setText("EDIT");
        cmdedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditActionPerformed(evt);
            }
        });

        cmdexit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdexit.setForeground(new java.awt.Color(0, 102, 102));
        cmdexit.setText("EXIT");
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTS", "CATEGORY", "SUPPLIER", "QTY", "EXPIRY DATE", "USER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl1);

        cmddelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmddelete.setForeground(new java.awt.Color(0, 102, 102));
        cmddelete.setText("DELETE");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });

        cmdsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdsearch.setForeground(new java.awt.Color(0, 102, 102));
        cmdsearch.setText("Search");
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search");

        cmdsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdsave.setForeground(new java.awt.Color(0, 102, 102));
        cmdsave.setText("SAVE");
        cmdsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsaveActionPerformed(evt);
            }
        });

        cmdupdate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmdupdate.setForeground(new java.awt.Color(0, 102, 102));
        cmdupdate.setText("UPDATE");
        cmdupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdupdateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qty");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Delivered Date");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Expiry Date");

        lblImage.setBackground(new java.awt.Color(204, 204, 255));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setText("          IMAGE");
        lblImage.setOpaque(true);

        cmdimage.setText("Select img");
        cmdimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdimageActionPerformed(evt);
            }
        });

        deldate.setMinimumSize(new java.awt.Dimension(82, 2));
        deldate.setPreferredSize(new java.awt.Dimension(88, 28));

        expdate.setPreferredSize(new java.awt.Dimension(88, 28));

        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Import", "Local" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmddelete, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(cmdexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdupdate, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(cmdedit, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(cmdadd, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(cmdsave, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(Category)
                                        .addGap(45, 45, 45))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel2))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deldate, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(expdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(cmdimage, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtuser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(cmbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Category)
                                .addComponent(jLabel4))
                            .addComponent(deldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(expdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cmdimage)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdsave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmddelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cmdexit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
        cmdimage.setVisible(true);
        txtid.setText("");
        txtqty.setText("");
        cmdexit.setText("CANCEL");
        cmdedit.setEnabled(false);
        cmdsave.setEnabled(true);
        cmdadd.setEnabled(false);
        cmdupdate.setEnabled(false);
        cmdsearch.setEnabled(false);
        cmddelete.setEnabled(false);
        tbl1.setEnabled(false);
        txtid.setEnabled(false);
        deldate.setEnabled(true);
        txtqty.setEnabled(true);
        
        

    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditActionPerformed
        cmdimage.setVisible(true);
        cmdexit.setText("CANCEL");
        cmdadd.setEnabled(false);
        cmdsearch.setEnabled(false);
        cmddelete.setEnabled(false);
        cmdsave.setEnabled(false);
        cmdupdate.setEnabled(true);
        cmdedit.setEnabled(false);
        tbl1.setEnabled(false);
        txtid.setEnabled(true);
        deldate.setEnabled(true);
        txtqty.setEnabled(true);
        
        
    }//GEN-LAST:event_cmdeditActionPerformed

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        if(cmdexit.getText().equals("CANCEL")){
            cmdexit.setText("EXIT");
            cmdsave.setEnabled(false);
            cmdupdate.setEnabled(false);
            cmdadd.setEnabled(true);
            cmdedit.setEnabled(true);
            tbl1.setEnabled(true);
            txtid.setEnabled(false);
            deldate.setEnabled(false);
            txtqty.setEnabled(false);
        }else{
            Menu MenuFrame = new Menu();
           // FinalFrame.setVisible(true);
            MenuFrame.pack();
            MenuFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
        String id = txtid.getText();
        int result = JOptionPane.showConfirmDialog(this,"Do you want to delete this record","Confirmation",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            try {
                    PreparedStatement ps = con.prepareStatement("delete from inventory where id = ?");
                    ps.setString(1,id);
                    ps.executeUpdate();


                } catch (Exception ex) {
                    Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
                }
            JOptionPane.showMessageDialog(this,"Deleted Successfully");
            fetch2();
            fetch();
            
        }
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        int row = tbl1.getSelectedRow();
        String tc = tbl1.getModel().getValueAt(row, 0).toString();
        try {
            
            PreparedStatement ps = con.prepareStatement("select * from inventory where id="+tc+" ");

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String product = rs.getString("product");
                String qty = rs.getString("qty");
                String category = rs.getString("category");
                String supplier = String.valueOf(rs.getInt("supplier"));
                String deliverydate = rs.getString("deliveredate");
                String expirydate = rs.getString("expirydate");
                byte [] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(lblImage.getWidth(),
                        lblImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                String user = rs.getString("user");
                
                txtid.setText(""+id);
                txtproduct.setText(product);
                txtqty.setText(""+qty);
                cmbcategory.addItem(category);
                txtsupplier.setText(supplier);
                ((JTextField)deldate.getDateEditor().getUiComponent()).setText(deliverydate);
                ((JTextField)expdate.getDateEditor().getUiComponent()).setText(expirydate);
                lblImage.setIcon(newImage);
                
             
            
            }

        } catch (Exception ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl1MouseClicked

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
       
        txtid.setEnabled(false);
        deldate.setEnabled(false);
        txtqty.setEnabled(false);
        cmdadd.setEnabled(true);
        cmdsave.setEnabled(false);
        cmdedit.setEnabled(true);
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(true);
        cmdexit.setText("Exit");
        tbl1.setEnabled(true);
        String products = txtsearch.getText();
        try {
            
            PreparedStatement ps = con.prepareStatement("select * from inventory where product = ? order by id asc");
            ps.setString(1,products);

            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String id = String.valueOf(rs.getInt("id"));
                String product = rs.getString("product");
                String qty = rs.getString("qty");
                String category = rs.getString("category");
                String supplier = String.valueOf(rs.getInt("supplier"));
                String deliverydate = rs.getString("deliveredate");
                String expirydate = rs.getString("expirydate");
                byte [] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myimg = im.getScaledInstance(lblImage.getWidth(),
                        lblImage.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                String user = rs.getString("user");
                
                txtid.setText(""+id);
                txtproduct.setText(product);
                txtqty.setText(""+qty);
                cmbcategory.addItem(category);
                txtsupplier.setText(supplier);
                ((JTextField)deldate.getDateEditor().getUiComponent()).setText(deliverydate);
                ((JTextField)expdate.getDateEditor().getUiComponent()).setText(expirydate);
                lblImage.setIcon(newImage);
                
               
               
                
                
                String tbData[] = {product,qty,category,supplier,deliverydate,expirydate,user};
                    DefaultTableModel tblModel = (DefaultTableModel)tbl1.getModel();
                    tblModel.addRow(tbData);

            
            }

        } catch (Exception ex) {
            Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
        }
        fetch2();
        
        
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
       
            int result = JOptionPane.showConfirmDialog(this,"Do you want to add this record?","Confirmation",JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                try {
                    SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-DD");
                    String date1 = dFormat.format(deldate.getDate());
                    String date2 = dFormat.format(deldate.getDate());
                    
                    
                    String product = txtproduct.getText();
                    String qty = txtqty.getText();
                    String category = cmbcategory.getItemAt(0);
                    String supplier = txtsupplier.getText();
                    String deliverydate = date1;
                    String expirydate = date2;
                    String user = txtuser.getText();

                    PreparedStatement ps = con.prepareStatement("insert into inventory"
                            + "(product,qty,category,supplier,deliveredate,expirydate,image,user) "
                            + "values(?,?,?,?,?,?,?,?)");
                    ps.setString(1,product);
                    ps.setString(2,qty);
                    ps.setString(3,category);
                    ps.setString(4,supplier);
                    ps.setString(5,deliverydate);
                    ps.setString(6,expirydate);
                    ps.setBytes(7,pimage);
                    ps.setString(8,user);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Insert Successful");
                    fetch();

                } catch (Exception ex) {
                    Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        fetch2();
        fetch();
    }//GEN-LAST:event_cmdsaveActionPerformed

    private void cmdupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdupdateActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"Do you want to update this record","Confirmation",JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            try {
                SimpleDateFormat dFormat = new SimpleDateFormat("DD-MM-yyyy");
                String date1 = dFormat.format(deldate.getDate());
                String date2 = dFormat.format(deldate.getDate());
                
                String product = txtproduct.getText();
                String qty = txtqty.getText();
                String category = cmbcategory.getItemAt(0);
                String supplier = txtsupplier.getText();
                String deliverydate = date1;
                String expirydate = date2;
                String user = txtqty.getText();

                    PreparedStatement ps = con.prepareStatement("update inventory set"
                            + "(product=?,qty=?,category=?,supplier=?,deliveredate=?,expirydate=?,image=?,user=?) ");
                    ps.setString(1,product);
                    ps.setString(2,qty);
                    ps.setString(3,category);
                    ps.setString(4,supplier);
                    ps.setString(5,deliverydate);
                    ps.setString(6,expirydate);
                    ps.setBytes(7,pimage);
                    ps.setString(8,user);
                ps.executeUpdate();
                

            } catch (Exception ex) {
                Logger.getLogger(Final.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Updated Successfully");
            fetch2();
            fetch();
        }
    }//GEN-LAST:event_cmdupdateActionPerformed

    private void cmdimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdimageActionPerformed
       JFileChooser fchooser = new JFileChooser();
        fchooser.showOpenDialog(null);
        File f = fchooser.getSelectedFile();
        fname = f.getAbsolutePath();
        ImageIcon micon = new ImageIcon(fname);
        try{
            
            File image = new File(fname);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readnum; (readnum = fis.read(buf))!= -1;){
            
                baos.write(buf,0,readnum);
            }
            pimage = baos.toByteArray();
            lblImage.setIcon(resizeImage(fname, buf));
            
        }catch (Exception e){
        
        }
    }//GEN-LAST:event_cmdimageActionPerformed

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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbcategory;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdedit;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdimage;
    private javax.swing.JButton cmdsave;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JButton cmdupdate;
    private com.toedter.calendar.JDateChooser deldate;
    private com.toedter.calendar.JDateChooser expdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTable tbl1;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsupplier;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
