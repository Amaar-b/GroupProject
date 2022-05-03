/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageapp;

import javax.swing.JFrame;


/**
 *
 * @author w1787623
 */
public class progressPage extends javax.swing.JPanel {
    
    

    /**
     * Creates new form scenariosPage
     */
    public progressPage() {
        initComponents();
        JFrame frame = new JFrame();

    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressLabel = new java.awt.Label();
        completedScenarios = new javax.swing.JPanel();
        completedScenariosLabelSmall = new java.awt.Label();
        incompleteScenarios = new javax.swing.JPanel();
        incompleteScenariosLabelSmall = new java.awt.Label();
        jButton2 = new javax.swing.JButton();
        incompScenFromDatabase = new javax.swing.JLabel();
        scenariosAvailable = new javax.swing.JPanel();
        scenariosAvailableLabelSmall = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        scenAvailFromDatabase = new javax.swing.JLabel();
        scenariosLineGraph = new javax.swing.JPanel();
        scenariosAndTimeTakenLabel = new java.awt.Label();
        streakViewer = new javax.swing.JPanel();
        dailyStreakLabel = new java.awt.Label();
        smallLogoPicture = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        profilePageButtonMenu = new javax.swing.JButton();
        supportPageMenuButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 181, 204));

        progressLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        progressLabel.setText("Progress");

        completedScenarios.setBackground(new java.awt.Color(240, 240, 255));
        completedScenarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        completedScenariosLabelSmall.setText("Completed Scenarios");

        javax.swing.GroupLayout completedScenariosLayout = new javax.swing.GroupLayout(completedScenarios);
        completedScenarios.setLayout(completedScenariosLayout);
        completedScenariosLayout.setHorizontalGroup(
            completedScenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, completedScenariosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(completedScenariosLabelSmall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        completedScenariosLayout.setVerticalGroup(
            completedScenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, completedScenariosLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(completedScenariosLabelSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        incompleteScenarios.setBackground(new java.awt.Color(240, 240, 255));
        incompleteScenarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        incompleteScenariosLabelSmall.setText("Incomplete Scenarios");

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        incompScenFromDatabase.setText("jLabel1");

        javax.swing.GroupLayout incompleteScenariosLayout = new javax.swing.GroupLayout(incompleteScenarios);
        incompleteScenarios.setLayout(incompleteScenariosLayout);
        incompleteScenariosLayout.setHorizontalGroup(
            incompleteScenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incompleteScenariosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(incompleteScenariosLabelSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(incompleteScenariosLayout.createSequentialGroup()
                .addGroup(incompleteScenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(incompleteScenariosLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jButton2))
                    .addGroup(incompleteScenariosLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(incompScenFromDatabase)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        incompleteScenariosLayout.setVerticalGroup(
            incompleteScenariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, incompleteScenariosLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(incompScenFromDatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(incompleteScenariosLabelSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        scenariosAvailable.setBackground(new java.awt.Color(240, 240, 255));
        scenariosAvailable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scenariosAvailableLabelSmall.setText("Scenarios Available");

        jButton1.setText("Check Available Scenarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scenAvailFromDatabase.setText("jLabel1");

        javax.swing.GroupLayout scenariosAvailableLayout = new javax.swing.GroupLayout(scenariosAvailable);
        scenariosAvailable.setLayout(scenariosAvailableLayout);
        scenariosAvailableLayout.setHorizontalGroup(
            scenariosAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scenariosAvailableLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scenariosAvailableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(scenariosAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scenariosAvailableLayout.createSequentialGroup()
                        .addComponent(scenariosAvailableLabelSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scenariosAvailableLayout.createSequentialGroup()
                        .addComponent(scenAvailFromDatabase)
                        .addGap(79, 79, 79))))
        );
        scenariosAvailableLayout.setVerticalGroup(
            scenariosAvailableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scenariosAvailableLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(scenAvailFromDatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scenariosAvailableLabelSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        scenariosLineGraph.setBackground(new java.awt.Color(240, 240, 155));
        scenariosLineGraph.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scenariosAndTimeTakenLabel.setText("Scenarios and time taken");

        javax.swing.GroupLayout scenariosLineGraphLayout = new javax.swing.GroupLayout(scenariosLineGraph);
        scenariosLineGraph.setLayout(scenariosLineGraphLayout);
        scenariosLineGraphLayout.setHorizontalGroup(
            scenariosLineGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scenariosLineGraphLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(scenariosAndTimeTakenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scenariosLineGraphLayout.setVerticalGroup(
            scenariosLineGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scenariosLineGraphLayout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(scenariosAndTimeTakenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        streakViewer.setBackground(new java.awt.Color(240, 240, 155));
        streakViewer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dailyStreakLabel.setText("Daily Streak");

        javax.swing.GroupLayout streakViewerLayout = new javax.swing.GroupLayout(streakViewer);
        streakViewer.setLayout(streakViewerLayout);
        streakViewerLayout.setHorizontalGroup(
            streakViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(streakViewerLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(dailyStreakLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        streakViewerLayout.setVerticalGroup(
            streakViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, streakViewerLayout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addComponent(dailyStreakLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        smallLogoPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/earth-globeprofile-page.png"))); // NOI18N
        smallLogoPicture.setText("\n");
        smallLogoPicture.setToolTipText("");

        profilePageButtonMenu.setText("Profile Page");
        profilePageButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilePageButtonMenuActionPerformed(evt);
            }
        });

        supportPageMenuButton.setText("Support Page");
        supportPageMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supportPageMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(profilePageButtonMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supportPageMenuButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smallLogoPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(286, 286, 286))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(streakViewer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(completedScenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(incompleteScenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(scenariosAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scenariosLineGraph, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(progressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(smallLogoPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(incompleteScenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(completedScenarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scenariosAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(profilePageButtonMenu)
                        .addGap(18, 18, 18)
                        .addComponent(supportPageMenuButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(streakViewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scenariosLineGraph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void profilePageButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilePageButtonMenuActionPerformed
        // TODO add your handling code here:
        //Takes you to the Profile page, this is aport of the menu buttons which all pages have.
        profilePage emp = new profilePage();
        emp.setVisible(true);
        setVisible(false); //Closes This window
        
    }//GEN-LAST:event_profilePageButtonMenuActionPerformed

    private void supportPageMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supportPageMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supportPageMenuButtonActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel completedScenarios;
    private java.awt.Label completedScenariosLabelSmall;
    private java.awt.Label dailyStreakLabel;
    private javax.swing.JLabel incompScenFromDatabase;
    private javax.swing.JPanel incompleteScenarios;
    private java.awt.Label incompleteScenariosLabelSmall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton profilePageButtonMenu;
    private java.awt.Label progressLabel;
    private javax.swing.JLabel scenAvailFromDatabase;
    private java.awt.Label scenariosAndTimeTakenLabel;
    private javax.swing.JPanel scenariosAvailable;
    private java.awt.Label scenariosAvailableLabelSmall;
    private javax.swing.JPanel scenariosLineGraph;
    private javax.swing.JLabel smallLogoPicture;
    private javax.swing.JPanel streakViewer;
    private javax.swing.JButton supportPageMenuButton;
    // End of variables declaration//GEN-END:variables
}



