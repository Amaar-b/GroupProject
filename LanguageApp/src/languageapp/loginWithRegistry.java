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
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 124, 14, 336));

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Email:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel1.add(loginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, -1));

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
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 217, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 320, 300));

        jPanel2.setBackground(new java.awt.Color(0, 181, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 14, 54, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Forename:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 59, -1, -1));

        signupFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupFnameActionPerformed(evt);
            }
        });
        jPanel2.add(signupFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 53, 147, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Surename:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 91, -1, -1));
        jPanel2.add(signupSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 91, 147, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 129, -1, -1));

        signupEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupEmailActionPerformed(evt);
            }
        });
        jPanel2.add(signupEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 129, 147, 27));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 173, 52, -1));
        jPanel2.add(signupPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 167, 147, 27));

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
        jPanel2.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirm: ");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 218, -1, -1));
        jPanel2.add(signupPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 212, 147, 27));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 124, 370, 300));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 742, 10));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 181, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome to the Language Exchange Practice App");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 520, 33));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Please Login or Register to access the App ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, 23));

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel3.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 370, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 460));

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
    private javax.swing.JPanel jPanel4;
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
