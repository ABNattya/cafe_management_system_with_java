
package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class selling extends javax.swing.JFrame {

    
    public selling() {
        initComponents();
        showproducts();
        pricetx.setEditable(false);
        sellertx.setEditable(false);
        nametx.setEditable(false);

    }
    
        
    Connection con=null;
    Statement st=null ,st1=null;
    ResultSet rs=null ,rs1=null;

   
    @SuppressWarnings("unchecked")
    
    
    int bnum;
    private void countbill()
    {
        try {
            st1=con.createStatement();
            rs1=st1.executeQuery("select Max(bnum) from billTb1");
            rs1.next();
            bnum=rs1.getInt(1)+1;
        } catch (SQLException e) {
            
        }
        
    }
    
    
        
    private void showproducts()
    {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
            st =con.createStatement();
            rs=st.executeQuery("select * from productTb1");
            listofproduct.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
         }

        
    }
    
    private void insertBillToDataBase(){
        
            try {
                countbill();
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
                PreparedStatement pst =con.prepareStatement("insert into billTb1 values(?,?,?,?)");
                pst.setInt(1, bnum);
                pst.setString(2,sellertx.getText());
                DateTimeFormatter dt =DateTimeFormatter.ofPattern("dd/MM//yyyy");
                LocalDateTime now=LocalDateTime.now();
                pst.setString(3,now.toString());
                pst.setInt(4, money);
                int row =pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "* Bill added *");
                con.close();
                showproducts();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
        }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nametx = new javax.swing.JTextField();
        sellertx = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        printbtn = new javax.swing.JButton();
        addbillBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listofproduct = new javax.swing.JTable();
        quanttx = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pricetx = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        billtable = new javax.swing.JTable();
        totalmo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 79, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 79, 0));
        jLabel1.setText("Sell Products ");

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 79, 0));
        jLabel4.setText("Seller");

        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 79, 0));
        jLabel6.setText("Quantity");

        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 79, 0));
        jLabel7.setText("Name");

        nametx.setForeground(new java.awt.Color(203, 158, 51));
        nametx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxActionPerformed(evt);
            }
        });

        sellertx.setForeground(new java.awt.Color(203, 158, 51));
        sellertx.setText("First seller");
        sellertx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellertxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 79, 0));
        jLabel9.setText("Your Bill");

        printbtn.setBackground(new java.awt.Color(230, 79, 0));
        printbtn.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 204, 102));
        printbtn.setText("Print");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        addbillBtn.setBackground(new java.awt.Color(230, 79, 0));
        addbillBtn.setFont(new java.awt.Font("Bodoni MT Black", 0, 20)); // NOI18N
        addbillBtn.setForeground(new java.awt.Color(255, 204, 102));
        addbillBtn.setText("ADD to Bill");
        addbillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbillBtnMouseClicked(evt);
            }
        });
        addbillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbillBtnActionPerformed(evt);
            }
        });

        listofproduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        listofproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listofproductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listofproduct);

        quanttx.setForeground(new java.awt.Color(203, 158, 51));
        quanttx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanttxActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(230, 79, 0));
        jLabel10.setText("Price");

        pricetx.setForeground(new java.awt.Color(203, 158, 51));
        pricetx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetxActionPerformed(evt);
            }
        });

        billtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "quantity", "Price", "total"
            }
        ));
        jScrollPane2.setViewportView(billtable);

        totalmo.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        totalmo.setForeground(new java.awt.Color(230, 79, 0));
        totalmo.setText("total");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(467, 467, 467)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(nametx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quanttx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellertx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pricetx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(addbillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(totalmo)
                        .addGap(213, 213, 213))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(202, 202, 202))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalmo)
                        .addGap(18, 18, 18)
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(nametx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sellertx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(quanttx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pricetx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(addbillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE))))
        );

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("Selling");

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setText("Log Out");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)))
                .addGap(85, 85, 85)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel5)
                    .addContainerGap(1256, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(185, 185, 185))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jLabel5)
                    .addContainerGap(800, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nametxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxActionPerformed

    private void sellertxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellertxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellertxActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        // TODO add your handling code here:
        try {
            insertBillToDataBase();
            billtable.print();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_printbtnActionPerformed
int money=0;
    private void addbillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbillBtnActionPerformed
        // TODO add your handling code here:
        
        if(nametx.getText().isEmpty()||pricetx.getText().isEmpty()||quanttx.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "some information missing");
        }
        else
        {
         int total=Integer.valueOf(pricetx.getText()) * Integer.valueOf(quanttx.getText());
        money=money+total;
        totalmo.setText(money+" EGP");
        DefaultTableModel model=(DefaultTableModel) billtable.getModel();
        String rowid=Integer.toHexString(model.getRowCount());
        model.addRow(new Object[] {
            Integer.valueOf(rowid)+1,nametx.getText(),quanttx.getText(),pricetx.getText(),total
        });
        }
    
    }//GEN-LAST:event_addbillBtnActionPerformed

    private void quanttxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanttxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanttxActionPerformed

    private void pricetxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetxActionPerformed


    private void addbillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbillBtnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_addbillBtnMouseClicked
    int key=0;
    private void listofproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listofproductMouseClicked
        // TODO add your handling code here:
                        DefaultTableModel model= (DefaultTableModel) listofproduct.getModel();
        int myindex =listofproduct.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(myindex, 0).toString());
        nametx.setText(model.getValueAt(myindex, 1).toString());
//        catgprod.setSelectedIndex(myindex);
        pricetx.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_listofproductMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbillBtn;
    private javax.swing.JTable billtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listofproduct;
    private javax.swing.JTextField nametx;
    private javax.swing.JTextField pricetx;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField quanttx;
    private javax.swing.JTextField sellertx;
    private javax.swing.JLabel totalmo;
    // End of variables declaration//GEN-END:variables
}
