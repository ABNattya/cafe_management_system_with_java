
package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class signup extends javax.swing.JFrame {

 
    
      ImageIcon coffe=new ImageIcon("coffee.png");
      ImageIcon ext =new ImageIcon("button.png");
      
    public signup() {
        initComponents();
    }

            Connection con=null;
    Statement st=null ,st1=null;
    ResultSet rs=null ,rs1=null;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailtx = new javax.swing.JTextField();
        log = new javax.swing.JLabel();
        passtx = new javax.swing.JPasswordField();
        photo = new javax.swing.JLabel();
        exitbtn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usertx1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        conpasstx = new javax.swing.JPasswordField();
        gender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 79, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setBackground(new java.awt.Color(230, 79, 0));
        jLabel1.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 79, 0));
        jLabel1.setText("AOLAD");

        jLabel2.setBackground(new java.awt.Color(230, 79, 0));
        jLabel2.setFont(new java.awt.Font("Pristina", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 79, 0));
        jLabel2.setText("ATTYA");

        jLabel3.setBackground(new java.awt.Color(230, 79, 0));
        jLabel3.setFont(new java.awt.Font("Pristina", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 79, 0));
        jLabel3.setText("cafe");

        jLabel4.setBackground(new java.awt.Color(230, 79, 0));
        jLabel4.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(230, 79, 0));
        jLabel4.setText("Sign up");

        signupbtn.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        signupbtn.setForeground(new java.awt.Color(230, 79, 0));
        signupbtn.setText("SignUP");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(230, 79, 0));
        jLabel5.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 79, 0));
        jLabel5.setText("Gender");

        jLabel6.setBackground(new java.awt.Color(230, 79, 0));
        jLabel6.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 79, 0));
        jLabel6.setText("Password");

        emailtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        log.setForeground(new java.awt.Color(230, 79, 0));
        log.setText("I already have account");
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });

        passtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxActionPerformed(evt);
            }
        });

        photo.setForeground(new java.awt.Color(255, 255, 255));
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/coffee.png"))); // NOI18N

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/button.png"))); // NOI18N
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(230, 79, 0));
        jLabel8.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(230, 79, 0));
        jLabel8.setText("user Name");

        usertx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertx1ActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(230, 79, 0));
        jLabel9.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(230, 79, 0));
        jLabel9.setText("confirtm password");

        conpasstx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conpasstxActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel10.setBackground(new java.awt.Color(230, 79, 0));
        jLabel10.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(230, 79, 0));
        jLabel10.setText("e-mail");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel4)
                                .addGap(231, 231, 231)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passtx, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailtx, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usertx1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conpasstx, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(log)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(photo)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbtn)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jLabel10)
                    .addContainerGap(959, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertx1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(emailtx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passtx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(conpasstx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(log)
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(jLabel10)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    int prnum;
    private void countprod()
    {
        try {
            st1=con.createStatement();
            rs1=st1.executeQuery("select Max(idnum) from signup");
            rs1.next();
            prnum=rs1.getInt(1)+1;
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(this, ex);
        }
        
    }
    
    
    
    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
          try {
              // TODO add your handling code here:
             
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");

                String u=usertx1.getText();
                String e=emailtx.getText();
                String p=passtx.getText();
                String pc=conpasstx.getText();
                String g=gender.getSelectedItem().toString();
                
                String er = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$";
                Pattern ep=Pattern.compile(er,Pattern.CASE_INSENSITIVE);
                Matcher mat =ep.matcher(e);
                
               if(mat.find()){
                
                
                if(p.equals(pc))
                {
                    countprod();
                    PreparedStatement pst =con.prepareStatement("insert into signup values(?,?,?,?,?)");
                    pst.setInt(1, prnum);
                    pst.setString(2,u);
                    pst.setString(3,e);
                    pst.setString(4,p);
                    pst.setString(5,g);

                    
                    pst.executeUpdate(); 
                    JOptionPane.showMessageDialog(this, "* account created done *");
                    con.close();
                
                
                }
                else{
                  JOptionPane.showMessageDialog(this, " !! password not matching !!");
                    conpasstx.setText("");
                    passtx.setText("");
                }
                }
                else{
                    JOptionPane.showMessageDialog(this, " !! invalid email !!");
                    emailtx.setText("");
                }

              
          } catch (SQLException ex) {
                             JOptionPane.showMessageDialog(this, ex);

          }

 
    
    }//GEN-LAST:event_signupbtnActionPerformed

    private void emailtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxActionPerformed
        // TODO add your handling code here
        photo.setIcon(coffe);
        exitbtn.setIcon(ext);
    }//GEN-LAST:event_emailtxActionPerformed

    private void passtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxActionPerformed

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void usertx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertx1ActionPerformed

    private void conpasstxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conpasstxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conpasstxActionPerformed

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        // TODO add your handling code here:
           new login().setVisible(true);
            this.dispose();
        
    }//GEN-LAST:event_logMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conpasstx;
    private javax.swing.JTextField emailtx;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel log;
    private javax.swing.JPasswordField passtx;
    private javax.swing.JLabel photo;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField usertx1;
    // End of variables declaration//GEN-END:variables
}
