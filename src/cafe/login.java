
package cafe;

import javax.swing.ImageIcon;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class login extends javax.swing.JFrame {

      ImageIcon coffe=new ImageIcon("coffee.png");
      ImageIcon ext =new ImageIcon("button.png");

      
      
    public login() {
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
        loginbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usertx = new javax.swing.JTextField();
        create = new javax.swing.JLabel();
        passtx = new javax.swing.JPasswordField();
        photo = new javax.swing.JLabel();
        exitbtn = new javax.swing.JLabel();

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
        jLabel4.setText("Log In");

        loginbtn.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(230, 79, 0));
        loginbtn.setText("Log In");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(230, 79, 0));
        jLabel5.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 79, 0));
        jLabel5.setText("user Name");

        jLabel6.setBackground(new java.awt.Color(230, 79, 0));
        jLabel6.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 79, 0));
        jLabel6.setText("Password");

        usertx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxActionPerformed(evt);
            }
        });

        create.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        create.setForeground(new java.awt.Color(230, 79, 0));
        create.setText("Create new Account");
        create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMouseClicked(evt);
            }
        });

        passtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxActionPerformed(evt);
            }
        });

        photo.setForeground(new java.awt.Color(255, 255, 255));
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/coffee.png"))); // NOI18N
        photo.setLabelFor(photo);

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/button.png"))); // NOI18N
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
        });

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
                                .addGap(503, 503, 503)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usertx)
                                    .addComponent(passtx, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(create)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(photo)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbtn)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(usertx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(passtx, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5))
                .addGap(85, 85, 85)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(create)
                .addGap(51, 51, 51))
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

    private void usertxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxActionPerformed
        // TODO add your handling code here
        photo.setIcon(coffe);
        exitbtn.setIcon(ext);

    }//GEN-LAST:event_usertxActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        if(usertx.getText().isEmpty()||passtx.getText().isEmpty())
            JOptionPane.showMessageDialog(this, " !! infomation not completed yet !!");
        else{
            try {
                String u=usertx.getText();
                String p=passtx.getText();

                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafedb","root","");
                PreparedStatement pst =con.prepareStatement("Select * from signup WHERE username=? AND pass=?");
                pst.setString(1, u);
                pst.setString(2, p);
                
                ResultSet res=pst.executeQuery();
                
                if(res.next())
                {
                    new items().setVisible(true);
                    this.dispose();
                }
                
                else{
                    JOptionPane.showMessageDialog(this, " !! User Name or Password is Wrong !!");
                    usertx.setText("");
                    passtx.setText("");
                }
                
            } catch (SQLException ex) {
               
            }
  
        }



    }//GEN-LAST:event_loginbtnActionPerformed

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void passtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxActionPerformed

    private void createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMouseClicked
        // TODO add your handling code here:
                  new signup().setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_createMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new login().setVisible(true);


            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel create;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passtx;
    private javax.swing.JLabel photo;
    private javax.swing.JTextField usertx;
    // End of variables declaration//GEN-END:variables
}
