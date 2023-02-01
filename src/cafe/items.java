
package cafe;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class items extends javax.swing.JFrame {

    public items() {
        initComponents();
        showproducts();
    }
    
    
    Connection con=null;
    Statement st=null ,st1=null;
    ResultSet rs=null ,rs1=null;
    @SuppressWarnings("unchecked")
    
    int prnum;
    private void countprod()
    {
        try {
            st1=con.createStatement();
            rs1=st1.executeQuery("select Max(pnum) from productTb1");
            rs1.next();
            prnum=rs1.getInt(1)+1;
        } catch (SQLException e) {
            
        }
        
    }
    
    
    
    private void showproducts()
    {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
            st =con.createStatement();
            rs=st.executeQuery("select * from productTb1");
            producttable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
         }

        
    }
        
    
    private void filterProducts()    {
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
            st =con.createStatement();
            rs=st.executeQuery("select * from productTb1 where category='"+filter.getSelectedItem().toString()+"'");
            producttable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
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
        nameprod = new javax.swing.JTextField();
        priceprod = new javax.swing.JTextField();
        filter = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        catgprod = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        producttable = new javax.swing.JTable();
        refresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 79, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 79, 0));
        jLabel1.setText("Item Management");

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 79, 0));
        jLabel4.setText("Category");

        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 79, 0));
        jLabel6.setText("Price");

        jLabel7.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(230, 79, 0));
        jLabel7.setText("Name");

        nameprod.setForeground(new java.awt.Color(203, 158, 51));
        nameprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameprodActionPerformed(evt);
            }
        });

        priceprod.setForeground(new java.awt.Color(203, 158, 51));
        priceprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceprodActionPerformed(evt);
            }
        });

        filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "beverage ", "snack" }));
        filter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 79, 0));
        jLabel8.setText("Filter");

        catgprod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "beverage ", "snack" }));
        catgprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catgprodActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 79, 0));
        jLabel9.setText("Item List");

        deletebtn.setBackground(new java.awt.Color(230, 79, 0));
        deletebtn.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 204, 102));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(230, 79, 0));
        addbtn.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 204, 102));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(230, 79, 0));
        editbtn.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 204, 102));
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        producttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Category", "Price"
            }
        ));
        producttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                producttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(producttable);

        refresh.setBackground(new java.awt.Color(230, 79, 0));
        refresh.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 204, 102));
        refresh.setText("Show all products");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameprod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(132, 132, 132)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(catgprod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(156, 156, 156)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(priceprod, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)))
                .addGap(198, 198, 198))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(529, 529, 529)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(380, 380, 380))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catgprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 102));
        jLabel5.setText("Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel5)
                    .addContainerGap(1256, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jLabel5)
                    .addContainerGap(506, Short.MAX_VALUE)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameprodActionPerformed

    private void priceprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceprodActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
          if(nameprod.getText().isEmpty()||priceprod.getText().isEmpty()||catgprod.getSelectedIndex() == -1)
        {
            JOptionPane.showConfirmDialog(this, "Missing information ?! ");
            
        }else{
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
                PreparedStatement pst =con.prepareStatement("delete from productTb1 where pnum=?");
                pst.setInt(1, key);
                int row =pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "* PRODUCT HAS BEEN DELETED DONE *");
                con.close();
                showproducts();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        if(nameprod.getText().isEmpty()||priceprod.getText().isEmpty()||catgprod.getSelectedIndex() == -1)
        {
            JOptionPane.showConfirmDialog(this, "Missing information ?! ");
            
        }else{
            try {
                countprod();
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
                PreparedStatement pst =con.prepareStatement("insert into productTb1 values(?,?,?,?)");
                pst.setInt(1, prnum);
                pst.setString(2, nameprod.getText());
                pst.setString(3, catgprod.getSelectedItem().toString());
                pst.setInt(4, Integer.valueOf(priceprod.getText()));
                int row =pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "* product added *");
                con.close();
                showproducts();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
          if(nameprod.getText().isEmpty()||priceprod.getText().isEmpty()||catgprod.getSelectedIndex() == -1)
        {
            JOptionPane.showConfirmDialog(this, "Missing information ?! ");
            
        }else{
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
                PreparedStatement pst =con.prepareStatement("update  productTb1 set pname=?,category=?,price=? where pnum=?");
                pst.setInt(4, key);
                pst.setString(1, nameprod.getText());
                pst.setString(2, catgprod.getSelectedItem().toString());
                pst.setInt(3, Integer.valueOf(priceprod.getText()));
                int row =pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "* product update done *");
                con.close();
                showproducts();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
        }
    }//GEN-LAST:event_editbtnActionPerformed

    int key=0;
    private void producttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_producttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) producttable.getModel();
        int myindex =producttable.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(myindex, 0).toString());
        nameprod.setText(model.getValueAt(myindex, 1).toString());
//        catgprod.setSelectedIndex(myindex);
        priceprod.setText(model.getValueAt(myindex, 3).toString());
    }//GEN-LAST:event_producttableMouseClicked

    private void filterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterItemStateChanged
        // TODO add your handling code here:
        filterProducts();
    }//GEN-LAST:event_filterItemStateChanged

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        showproducts();
    }//GEN-LAST:event_refreshActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void catgprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catgprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catgprodActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> catgprod;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JComboBox<String> filter;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField nameprod;
    private javax.swing.JTextField priceprod;
    private javax.swing.JTable producttable;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
