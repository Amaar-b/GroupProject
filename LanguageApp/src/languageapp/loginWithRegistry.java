/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageapp;

import java.security.interfaces.RSAKey;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Miah - w1776316 / Omar Omar - w1740779 / Amaar Bhatti - w1781655 
 * 
 */

public class loginWithRegistry extends javax.swing.JFrame {
    
    private static String UName;
    private String salt;
    private String securePassword;
    private Boolean isEmailExist;
    private String mySecurePassword;
    public static String storeFname;
    public static String storeSname;
    public static String storeEmail;
    private int g;

    /**
     * Creates new form loginWithRegistry
     */
    public loginWithRegistry() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginPass = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        signupFname = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        signupSname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        signupEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        signupPass = new javax.swing.JPasswordField();
        signupBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        signupPass2 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Login");

        jLabel3.setText("Email:");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Password:");

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setFocusable(false);
        loginBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))
                            .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(79, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(loginPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addGap(41, 41, 41))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Register");

        jLabel6.setText("Forename:");

        signupFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupFnameActionPerformed(evt);
            }
        });

        jLabel8.setText("Surename:");

        jLabel5.setText("Email :");

        signupEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupEmailActionPerformed(evt);
            }
        });

        jLabel7.setText("Password:");

        signupBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupBtn.setText("Sign-Up");
        signupBtn.setFocusable(false);
        signupBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signupBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        jLabel12.setText("Confirm: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(50, 50, 50)
                                .addComponent(signupPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(signupSname)
                                    .addComponent(signupEmail)
                                    .addComponent(signupPass, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(signupBtn))
                                    .addComponent(signupFname))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(signupFname, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(signupSname, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(signupEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(signupPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(signupPass2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(signupBtn)
                .addGap(23, 23, 23))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Welcome to the Language Exchange Practice App");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Please Login or Register to access the App ");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel10)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void signupFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupFnameActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        
        // get data from fields
        String fname = signupFname.getText();
        String lname = signupSname.getText();
        String uname = signupEmail.getText();
        String pass1 = String.valueOf(signupPass.getPassword());
        String pass2 = String.valueOf(signupPass2.getPassword());
        
        //check if the data are empty
        if(verifyFields())
         {
             if (loginSelection.option == "S"){
        //check if the username already exists     
        if(!checkStuUsername(uname))
             {
                 
                 PreparedStatement pst;
                 ResultSet rs;
                 
               
                 String sql = "INSERT INTO `student`(`Firstname`,`Surname`, `Email`, `Password`) VALUES (?,?,?,?);";
                
           
                 
                 try {
                     Connection con = connectDB.getConnection();
                     
                     pst = con.prepareStatement(sql);
                     pst.setString(1, fname);
                     pst.setString(2, lname);
                     pst.setString(3, uname);
                     pst.setString(4, pass1);
                     pst.execute();
                     System.out.println("new user registered sucessfully");
                     JOptionPane.showMessageDialog(null, "Registration Successful");
                     signupFname.setText("");
                     signupSname.setText("");
                     signupEmail.setText("");
                     signupPass.setText("");
                     signupPass2.setText("");
                    
                     
             
                     
                 } catch (SQLException ex) {
                     Logger.getLogger(loginWithRegistry.class.getName()).log(Level.SEVERE, null, ex);
                     System.out.println("reg failed");
                 }
                 
             }
         }
             //if teacher selected, sign up via teacher table 
             else {
                 if(!checkTeaUsername(uname))
             {
                 PreparedStatement pst;
                 ResultSet rs;
                 
               
                 String sql = "INSERT INTO `teacher`(`Firstname`,`Surname`, `Email`, `Password`) VALUES (?,?,?,?);";
            
                 
                 try {
                     Connection con = connectDB.getConnection();
                     
                     pst = con.prepareStatement(sql);
                     pst.setString(1, fname);
                     pst.setString(2, lname);
                     pst.setString(3, uname);
                     pst.setString(4, pass1);
                     pst.execute();
                     System.out.println("new user registered sucessfully");
                     JOptionPane.showMessageDialog(null, "Registration Successful");
                     signupFname.setText("");
                     signupSname.setText("");
                     signupEmail.setText("");
                     signupPass.setText("");
                     signupPass2.setText("");
                    
                     
             
                     
                 } catch (SQLException ex) {
                     Logger.getLogger(loginWithRegistry.class.getName()).log(Level.SEVERE, null, ex);
                     System.out.println("reg failed");
                 }
                 
             }
             
             }
         }                                      
    }//GEN-LAST:event_signupBtnActionPerformed

    private void signupEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signupEmailActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

       // test selection INPUT "S" / "T" from selection window
       if(loginSelection.option == "S"){
        try {
            
            Connection con = connectDB.getConnection();
            Statement stmt = null;
            
            System.out.println("con" + con);
            
            String sql = "Select * from student where Email=? and Password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            System.out.println("pst: " +pst);
            pst.setString(1, Email.getText());
            pst.setString(2, loginPass.getText());
            System.out.println("1: " + pst);
            
            ResultSet rs = pst.executeQuery();
            System.out.println("rs: " + rs.getString(1));
            
            if(rs.next()){
                //salt = Public Key
                salt = rs.getString("encryptedPublicKey");

                System.out.println("salt: " + salt);
                securePassword = rs.getString("encryptedPassword");
                System.out.println("securePwd: " + securePassword);
                if(VerifyProvidedPassword(loginPass.getText())) {
                JOptionPane.showMessageDialog(null, "Login Successful, Press 'OK' to continue.");
                storeFname = rs.getString(2);
                storeSname = rs.getString(3);
                storeEmail = Email.getText();                
                
                profilePage emp = new profilePage();
                emp.setVisible(true); // Opens next window 
                con.close(); // Disconnects from DB
                setVisible(false); //Closes This window
                }
                
            }else {
            JOptionPane.showMessageDialog(null, "Invalid entry, Please try again.");
            loginPass.setText("");
            }
        }
       
        
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, "User Not Found !");
        }
       }
       
       else {
           try {
            
            Connection con = connectDB.getConnection();
            Statement stmt = null;
            
            System.out.println("con" + con);
            
            String sql = "Select * from teacher where Email=? and Password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            System.out.println("pst: " +pst);
            pst.setString(1, Email.getText());
            pst.setString(2, loginPass.getText());
            System.out.println("1: " + pst);
            
            ResultSet rs = pst.executeQuery();
            System.out.println("rs: " + rs.getString(1));
            
            if(rs.next()){
                //salt = Public Key
                salt = rs.getString("encryptedPublicKey");

                System.out.println("salt: " + salt);
                securePassword = rs.getString("encryptedPassword");
                System.out.println("securePwd: " + securePassword);
                if(VerifyProvidedPassword(loginPass.getText())) {
                JOptionPane.showMessageDialog(null, "Login Successful, Press 'OK' to continue.");
                
                profilePage emp = new profilePage();
                emp.setVisible(true); // Opens next window 
                con.close(); // Disconnects from DB
                setVisible(false); //Closes This window
                }
                
            }else {
            JOptionPane.showMessageDialog(null, "Invalid entry, Please try again.");
            loginPass.setText("");
            }
        }
       
        
        catch (Exception e) {
        JOptionPane.showMessageDialog(null, "User Not Found !");
        }
       
       }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        loginSelection emp = new loginSelection();
        emp.setVisible(true);
        setVisible(false); //Closes This window
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(loginWithRegistry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginWithRegistry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginWithRegistry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginWithRegistry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginWithRegistry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField loginPass;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField signupEmail;
    private javax.swing.JTextField signupFname;
    private javax.swing.JPasswordField signupPass;
    private javax.swing.JPasswordField signupPass2;
    private javax.swing.JTextField signupSname;
    // End of variables declaration//GEN-END:variables

    private boolean VerifyProvidedPassword(String providedPassword) {
        return true;
//        "Select * from students "
    
}
     public boolean verifyFields()
    {
        String fname = signupFname.getText();
        String lname = signupSname.getText();
        String uname = signupEmail.getText();
        String pass1 = String.valueOf(signupPass.getPassword());
        String pass2 = String.valueOf(signupPass2.getPassword());
        
        //check empty fields
        if(fname.trim().equals("") || lname.trim().equals("") || uname.trim().equals("") || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        //check if the two password are equals or not
        else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           return false;
        }
        
        //// if everything is ok
        else{
            return true;
        }
        
    }
     
     // create a function to check if the entered username already exists in the database
     public boolean checkStuUsername(String username){
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String sql = "SELECT * FROM `student` WHERE `Email` = ?";
        
        try {
            Connection con = connectDB.getConnection();
            
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Email is Already Taken, Choose Another One", "Email Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginWithRegistry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;
     }
     
      public boolean checkTeaUsername(String username){
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String sql = "SELECT * FROM `teacher` WHERE `Email` = ?";
        
        try {
            Connection con = connectDB.getConnection();
            
            
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            rs = pst.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Email is Already Taken, Choose Another One", "Email Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginWithRegistry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return username_exist;
     }
    
}
