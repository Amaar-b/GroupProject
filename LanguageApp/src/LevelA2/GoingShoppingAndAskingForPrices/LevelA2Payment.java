/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LevelA2.GoingShoppingAndAskingForPrices;

import LevelB1.LevelB1Page;
import LevelB2.LevelB2Page;
import LevelA2.LevelA2Page;
import LevelA2.Introductions.*;
import LevelA1.Introductions.*;
import javax.swing.*;
import java.awt.*;  
import languageapp.ScenarioPage;
import languageapp.loginWithRegistry;
import languageapp.profilePage;
import languageapp.teacherPage;


/**
 *
 * @author hari
 */
public class LevelA2Payment extends javax.swing.JFrame {
    
    /**
     * Creates new form profilePage
     */

    
final String PaymentA = "- A: Hi there. May I pay for these items please?\n" +
"- B: ...\n" +
"- A: Hi there. May I pay for these items please?\n" +
"- B: ...\n" +
"- A: Thank you.\n" +
"- B: ...\n" +
"- A: Let me try another card. Here it is!\n" +
"- B: ..." +
"- A: How embarrassing. I will go and get some cash from the bank." +
"- B: ..."+
"- A: I will be back as soon as possible.\n" ;        

            
final String PaymentB ="- A: ...\n" +
"- B: Hello, yes of course. Your total is £35. Will you be paying by cash or card?\n" +
"- A: ...\n" +
"- B: No problem. You can insert or touch your card to the machine.\n" +
"- A: ...\n" +
"- B: I'm sorry your card hasn't worked. Can you try again?\n" +
"- A: ...\n" +
"- B: I'm sorry, but this card hasn't worked either." +
"- A: ...\n" +
"- B: Ok. No problem. I can hold onto your shopping for 30 minutes."+
"- A: ...\n" ;        
    
    
    public LevelA2Payment() {
        initComponents();
//        jComboBox_Context.setSelectedItem(null);
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_profile = new javax.swing.JButton();
        jLabelPic1 = new javax.swing.JLabel();
        jButton_Scenario = new javax.swing.JButton();
        jButton_SupportPage = new javax.swing.JButton();
        jButton_SignOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton_B2 = new javax.swing.JButton();
        jButton_A2 = new javax.swing.JButton();
        jButton_B1 = new javax.swing.JButton();
        jButton_Records = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel_LevelA1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton_PersonB = new javax.swing.JButton();
        jButton_PersonA = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox_Use4 = new javax.swing.JCheckBox();
        jCheckBox_Use5 = new javax.swing.JCheckBox();
        jCheckBox_Use6 = new javax.swing.JCheckBox();
        jCheckBox_Use7 = new javax.swing.JCheckBox();
        jCheckBox_Use8 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanuage App");
        setMinimumSize(new java.awt.Dimension(930, 530));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 181, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_profile.setText("Profile");
        jButton_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_profileActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 41));
        jPanel4.add(jLabelPic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 34, -1, 112));

        jButton_Scenario.setBackground(new java.awt.Color(255, 255, 255));
        jButton_Scenario.setText("Scenario");
        jButton_Scenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ScenarioActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Scenario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 41));

        jButton_SupportPage.setText("Support Page");
        jPanel4.add(jButton_SupportPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 110, 41));

        jButton_SignOut.setText("Sign Out");
        jButton_SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SignOutActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_SignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Language Exchange");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/earth-globeprofile-page.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jButton_B2.setText("B2");
        jButton_B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_B2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 50, -1));

        jButton_A2.setText("A2");
        jButton_A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_A2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_A2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 50, -1));

        jButton_B1.setText("B1");
        jButton_B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_B1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 50, -1));

        jButton_Records.setText("Admin Records");
        jButton_Records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RecordsActionPerformed(evt);
            }
        });
        jPanel4.add(jButton_Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 110, 41));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 760));

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel5.setText("Negative");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jPanel_LevelA1.setBackground(new java.awt.Color(0, 181, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment");

        javax.swing.GroupLayout jPanel_LevelA1Layout = new javax.swing.GroupLayout(jPanel_LevelA1);
        jPanel_LevelA1.setLayout(jPanel_LevelA1Layout);
        jPanel_LevelA1Layout.setHorizontalGroup(
            jPanel_LevelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(jPanel_LevelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_LevelA1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_LevelA1Layout.setVerticalGroup(
            jPanel_LevelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel_LevelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_LevelA1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel_LevelA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 181, 204));
        jLabel7.setText("Or: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 50, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("2nd: Assign two roles: A & B. Click on the\n triangle of your allocated role to see your\n part of the text. Proceed to say in turns each\n phrase in the language you are practising.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 380, 110));

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 181, 204));
        jLabel9.setText("Key Vocabulary:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Light", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("1st: Look up the\ntranslation of these\nhigher level words:");
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 230, 120));

        jButton_PersonB.setText("Person B");
        jButton_PersonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PersonBActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_PersonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 120, 30));

        jButton_PersonA.setText("Person A");
        jButton_PersonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PersonAActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_PersonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 120, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 181, 204));
        jLabel10.setText("Text:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 181, 204));
        jLabel11.setText("Text:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 181, 204));
        jLabel12.setText("Choose:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 181, 204));
        jLabel8.setText("Grammar/Structure: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jCheckBox_Use4.setText("Hasn't worked");
        jPanel1.add(jCheckBox_Use4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 160, -1));

        jCheckBox_Use5.setText("Cash");
        jCheckBox_Use5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Use5ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox_Use5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));

        jCheckBox_Use6.setText("Card");
        jPanel1.add(jCheckBox_Use6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 160, -1));

        jCheckBox_Use7.setText("Insert");
        jPanel1.add(jCheckBox_Use7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 160, -1));

        jCheckBox_Use8.setText("Touch");
        jPanel1.add(jCheckBox_Use8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 160, -1));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1080, 740));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1100, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1316, 797));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_profileActionPerformed
       //Takes you to the Profile page
        profilePage emp = new profilePage();
        emp.setVisible(true);
        setVisible(false); //Closes This window
    }//GEN-LAST:event_jButton_profileActionPerformed

    private void jButton_B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_B2ActionPerformed
        LevelB2Page emp = new LevelB2Page();
        emp.setVisible(true);
        setVisible(false); //Closes This window
    }//GEN-LAST:event_jButton_B2ActionPerformed

    private void jButton_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_A2ActionPerformed
         LevelA2Page emp = new LevelA2Page();
        emp.setVisible(true);
        setVisible(false); //Closes This window
    }//GEN-LAST:event_jButton_A2ActionPerformed

    private void jButton_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_B1ActionPerformed
         LevelB1Page emp = new LevelB1Page();
        emp.setVisible(true);
        setVisible(false); //Closes This window
    }//GEN-LAST:event_jButton_B1ActionPerformed

    private void jButton_SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SignOutActionPerformed
        //Takes you to the login page
        loginWithRegistry emp = new loginWithRegistry();
        emp.setVisible(true);
        setVisible(false); //Closes This window // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_SignOutActionPerformed

    private void jButton_ScenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ScenarioActionPerformed
        //Takes you to the scenario page
        ScenarioPage emp = new ScenarioPage();
        emp.setVisible(true);
        setVisible(false); //Closes This window        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ScenarioActionPerformed

    private void jButton_RecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RecordsActionPerformed
        //Takes you to the teacher page
        teacherPage emp = new teacherPage();
        emp.setVisible(true);
        setVisible(false); //Closes This window        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RecordsActionPerformed

     
        
    private void jButton_PersonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PersonAActionPerformed
       //Reset textpanes content so on every button click the new content of the read file will be displayed
       
       JFrame frame = new JFrame("StudentA");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        
        JTextArea textArea = new JTextArea(PaymentA);
        
       
        panel.add(textArea);   
        frame.add(panel);  
        frame.setSize(700, 500);  
        frame.setLocationRelativeTo(null);  
        
        frame.setVisible(true);  
      
       

                 

        
    }//GEN-LAST:event_jButton_PersonAActionPerformed

   

    
    
    private void jButton_PersonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PersonBActionPerformed
        JFrame frame2 = new JFrame("StudentB");  
        JPanel panel2 = new JPanel();  
        panel2.setLayout(new FlowLayout());  
        
        JTextArea textArea = new JTextArea(PaymentB);
        
//        JButton button = new JButton();  
//        button.setText("Button");  
        panel2.add(textArea);  
//        panel2.add(button);  
        frame2.add(panel2);  
       frame2.setSize(700, 500);  
        frame2.setLocationRelativeTo(null);    
        frame2.setVisible(true);  
        
        
        
        
        
        

        
    }//GEN-LAST:event_jButton_PersonBActionPerformed

    private void jCheckBox_Use5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Use5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_Use5ActionPerformed
 
        
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
            java.util.logging.Logger.getLogger(LevelA2Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelA2Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelA2Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelA2Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     
        //</editor-fold>
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelA2Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_A2;
    private javax.swing.JButton jButton_B1;
    private javax.swing.JButton jButton_B2;
    private javax.swing.JButton jButton_PersonA;
    private javax.swing.JButton jButton_PersonB;
    private javax.swing.JButton jButton_Records;
    private javax.swing.JButton jButton_Scenario;
    private javax.swing.JButton jButton_SignOut;
    private javax.swing.JButton jButton_SupportPage;
    private javax.swing.JButton jButton_profile;
    private javax.swing.JCheckBox jCheckBox_Use4;
    private javax.swing.JCheckBox jCheckBox_Use5;
    private javax.swing.JCheckBox jCheckBox_Use6;
    private javax.swing.JCheckBox jCheckBox_Use7;
    private javax.swing.JCheckBox jCheckBox_Use8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPic1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_LevelA1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
