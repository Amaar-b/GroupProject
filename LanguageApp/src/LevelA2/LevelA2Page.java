/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LevelA2;

import LevelA1.*;
import LevelA1.Ordering.LevelA1Takeaway;
import languageapp.ScenarioPage;
import languageapp.loginWithRegistry;
import languageapp.profilePage;
import languageapp.teacherPage;


/**
 *
 * @author w1740779
 */
public class LevelA2Page extends javax.swing.JFrame {

    
    /**
     * Creates new form profilePage
     */

    public LevelA2Page() {
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
        jButton_Submit = new javax.swing.JButton();
        jComboBox_SubContext = new javax.swing.JComboBox<>();
        jComboBox_Context = new javax.swing.JComboBox<>();

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
        jLabel5.setForeground(new java.awt.Color(0, 181, 204));
        jLabel5.setText("Choose which topic you want to practice:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jPanel_LevelA1.setBackground(new java.awt.Color(0, 181, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LEVEL A1");

        javax.swing.GroupLayout jPanel_LevelA1Layout = new javax.swing.GroupLayout(jPanel_LevelA1);
        jPanel_LevelA1.setLayout(jPanel_LevelA1Layout);
        jPanel_LevelA1Layout.setHorizontalGroup(
            jPanel_LevelA1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
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

        jPanel1.add(jPanel_LevelA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jButton_Submit.setText("Submit");
        jButton_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        jComboBox_SubContext.setEditable(true);
        jComboBox_SubContext.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBox_SubContext.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_SubContext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SubContextActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_SubContext, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 210, -1));

        jComboBox_Context.setEditable(true);
        jComboBox_Context.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBox_Context.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox_Context.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ordering food and drink", "Exchanging personal information", "Making Appointments", "Going shopping and asking for prices", "Introductions", "Basic employment issues", "Making invitations", "Socialising in the country", "Asking and giving directions", "University life", "Cross-cultural experiences", " " }));
        jComboBox_Context.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_ContextActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox_Context, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 210, -1));

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
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton_B2ActionPerformed

    private void jButton_A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_A2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_A2ActionPerformed

    private void jButton_B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_B1ActionPerformed
        // TODO add your handling code here:
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

    private void jComboBox_SubContextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SubContextActionPerformed
       
    }//GEN-LAST:event_jComboBox_SubContextActionPerformed

    private void jComboBox_ContextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_ContextActionPerformed
               if(jComboBox_Context.getSelectedItem().equals("Introductions"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Ist day in job");
         jComboBox_SubContext.addItem("Job offer");                
      
     }  
     
      else  
        
       if(jComboBox_Context.getSelectedItem().equals("Making Appointments"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Dentist");
         jComboBox_SubContext.addItem("Doctor");
       
                        
     }             
                   
       if(jComboBox_Context.getSelectedItem().equals("Asking and giving directions"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Hospital visit");
         jComboBox_SubContext.addItem("Delivery driver");
        
                        
     }             
                       
                                 
        if(jComboBox_Context.getSelectedItem().equals("Making Appointments"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Lunch");
         jComboBox_SubContext.addItem("Charity");
         jComboBox_SubContext.addItem("Children at wedding");
         jComboBox_SubContext.addItem("Wedding RSVP");
                          
     }
     
      
             if(jComboBox_Context.getSelectedItem().equals("Ordering food and drink"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Delayed drink order");
         jComboBox_SubContext.addItem("QR code");
         jComboBox_SubContext.addItem("Cocktails-1");
         jComboBox_SubContext.addItem("Cocktails-2");
         jComboBox_SubContext.addItem("Vegan pizza");
         jComboBox_SubContext.addItem("Reservation");               
                          
     }
        
             
             if(jComboBox_Context.getSelectedItem().equals("Going shopping and asking for prices"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Payment");
       
                          
     }      
             
              if(jComboBox_Context.getSelectedItem().equals("Health matters"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Sick relative");
         jComboBox_SubContext.addItem("Visiting patient");
                          
     }          
             
                if(jComboBox_Context.getSelectedItem().equals("Socialising in the country"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Family size");
         jComboBox_SubContext.addItem("Hobbies");
         
                          
     }
              
                 if(jComboBox_Context.getSelectedItem().equals("Making travel arrangements"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Expired ticket");
        
                          
     }     
             
        
     else
          if(jComboBox_Context.getSelectedItem().equals("Exchanging personal information"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Age restricted");
         
                        
     }
                 
        else
          if(jComboBox_Context.getSelectedItem().equals("Cross-cultural experiences"))   
     {
         jComboBox_SubContext.removeAllItems();
         jComboBox_SubContext.setSelectedItem(null);
         jComboBox_SubContext.addItem("Omelette");
         
                        
     }          
                 
       
    }//GEN-LAST:event_jComboBox_ContextActionPerformed
        
    private void jButton_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SubmitActionPerformed

        if 
                (jComboBox_Context.getSelectedItem().equals("Introductions")  && jComboBox_SubContext.getSelectedItem().equals("Ist day in job")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
        else if  
                (jComboBox_Context.getSelectedItem().equals("Introductions")  && jComboBox_SubContext.getSelectedItem().equals("Job offer")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  

    }
 ///////////////////       
  ///////////////////////      
         else  if    
                 (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Dentist")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
          else if 
                  (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Doctor")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window    
          }
     ////////////////////////////
     
             else  if 
                     (jComboBox_Context.getSelectedItem().equals("Asking and giving directions")  && jComboBox_SubContext.getSelectedItem().equals("Hospital visit")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
          else if (jComboBox_Context.getSelectedItem().equals("Asking and giving directions")  && jComboBox_SubContext.getSelectedItem().equals("Doctor")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
          }
     //////////////////////////////
          ////////////////////////
          
          
          
                 else  if 
                     (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Lunch")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
          else if (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Charity")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
          }
               
        else  if 
      (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Children at wedding")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
    else if (jComboBox_Context.getSelectedItem().equals("Making Appointments")  && jComboBox_SubContext.getSelectedItem().equals("Wedding RSVP")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
                   
    /////////////////////////////////
    ////////////////////////////
    
         
                 else  if 
                     (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("Delayed drink order")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
          else if (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("QR code")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
          }
               
        else  if 
      (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("Cocktails-1")){ 
    LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
    else if (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("Cocktails-2")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
                 
       else if (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("Vegan pizza")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
   
                    
       else if (jComboBox_Context.getSelectedItem().equals("Ordering food and drink")  && jComboBox_SubContext.getSelectedItem().equals("Reservation")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window  
}
   /////////////////////////////
   ////////////////////////////
   else if (jComboBox_Context.getSelectedItem().equals("Going shopping and asking for prices")  && jComboBox_SubContext.getSelectedItem().equals("Payment")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
   }
   
   ///////////////////////////////////
   //////////////////////////
           else if (jComboBox_Context.getSelectedItem().equals("Health matters")  && jComboBox_SubContext.getSelectedItem().equals("Sick relative")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }      
                    else if (jComboBox_Context.getSelectedItem().equals("(Health matters")  && jComboBox_SubContext.getSelectedItem().equals("Visiting patient")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }    
     /////////////////////////////
     ///////////////////////////////
     
           else if (jComboBox_Context.getSelectedItem().equals("Socialising in the country")  && jComboBox_SubContext.getSelectedItem().equals("Family size")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }      
                    else if (jComboBox_Context.getSelectedItem().equals("Socialising in the country")  && jComboBox_SubContext.getSelectedItem().equals("Hobbies")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }    
        
    ///////////////////////////////////
//////////////////////////////////////////    
                            else if (jComboBox_Context.getSelectedItem().equals("Making travel arrangements")  && jComboBox_SubContext.getSelectedItem().equals("Expired ticket")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }    
           
  /////////////////////////////////////////////////
     ////////////////////////////////////////         
    //////////////            
                             else if (jComboBox_Context.getSelectedItem().equals("Exchanging personal information")  && jComboBox_SubContext.getSelectedItem().equals("Age restricted")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }    
             
  ///////////////////////////////////////////
   /////////////////////////////////////////                          
                                     else if (jComboBox_Context.getSelectedItem().equals("Cross-cultural experiences")  && jComboBox_SubContext.getSelectedItem().equals("Omelette")){ 
        LevelA1Takeaway emp = new LevelA1Takeaway();
        emp.setVisible(true);
        setVisible(false); //Closes This window 
                          
     }    
        
  


    }//GEN-LAST:event_jButton_SubmitActionPerformed

     
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
            java.util.logging.Logger.getLogger(LevelA2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LevelA2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LevelA2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LevelA2Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LevelA2Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_A2;
    private javax.swing.JButton jButton_B1;
    private javax.swing.JButton jButton_B2;
    private javax.swing.JButton jButton_Records;
    private javax.swing.JButton jButton_Scenario;
    private javax.swing.JButton jButton_SignOut;
    private javax.swing.JButton jButton_Submit;
    private javax.swing.JButton jButton_SupportPage;
    private javax.swing.JButton jButton_profile;
    private javax.swing.JComboBox<String> jComboBox_Context;
    private javax.swing.JComboBox<String> jComboBox_SubContext;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelPic1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel_LevelA1;
    // End of variables declaration//GEN-END:variables
}