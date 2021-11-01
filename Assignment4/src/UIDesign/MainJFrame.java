/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIDesign;

import Model.City;
import Model.Community;
import Model.House;
import Model.Patient;
import Model.PatientDirectory;
import Model.Person;
import Model.PersonDirectory;
import Model.SystemPeople;
import javax.swing.JOptionPane;

/**
 *
 * @author vachanabelgavi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    PersonDirectory person;
    PatientDirectory patient;
    House house;
    Community community;
    City city;
    SystemPeople system;
    
    public MainJFrame() {
        initComponents();
        
        person = new PersonDirectory();
        patient = new PatientDirectory();
        house = new House();
        community = new Community();
        city = new City();
        system = new SystemPeople();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnEncounter = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btnHouse1 = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 650));
        setMinimumSize(new java.awt.Dimension(850, 650));
        setPreferredSize(new java.awt.Dimension(800, 604));
        setSize(new java.awt.Dimension(850, 650));

        controlPanel.setBackground(new java.awt.Color(54, 33, 89));
        controlPanel.setMaximumSize(new java.awt.Dimension(150, 200));
        controlPanel.setMinimumSize(new java.awt.Dimension(150, 200));
        controlPanel.setPreferredSize(new java.awt.Dimension(150, 200));

        btnEncounter.setBackground(new java.awt.Color(54, 33, 89));
        btnEncounter.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnEncounter.setForeground(new java.awt.Color(255, 255, 255));
        btnEncounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/patient-20 2.png"))); // NOI18N
        btnEncounter.setText("Encounter");
        btnEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(54, 33, 89));
        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/view-20 2.png"))); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(54, 33, 89));
        btnExit.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/exit-20 2.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(54, 33, 89));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/update-20 2.png"))); // NOI18N
        btnUpdate.setText("Update Delete");
        btnUpdate.setToolTipText("");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnPerson.setBackground(new java.awt.Color(54, 33, 89));
        btnPerson.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnPerson.setForeground(new java.awt.Color(255, 255, 255));
        btnPerson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/man-20.png"))); // NOI18N
        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnHouse1.setBackground(new java.awt.Color(54, 33, 89));
        btnHouse1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnHouse1.setForeground(new java.awt.Color(255, 255, 255));
        btnHouse1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/house-20 2.png"))); // NOI18N
        btnHouse1.setText("Housing");
        btnHouse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHouse1ActionPerformed(evt);
            }
        });

        btnCommunity.setBackground(new java.awt.Color(54, 33, 89));
        btnCommunity.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnCommunity.setForeground(new java.awt.Color(255, 255, 255));
        btnCommunity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ImagesFolder/community-20.png"))); // NOI18N
        btnCommunity.setText("Community");
        btnCommunity.setToolTipText("");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnHouse1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEncounter, btnExit, btnHouse1, btnPerson, btnUpdate, btnView});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnHouse1)
                .addGap(18, 18, 18)
                .addComponent(btnPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEncounter)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(37, 37, 37))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEncounter, btnExit, btnHouse1, btnPerson, btnUpdate, btnView});

        splitPane.setLeftComponent(controlPanel);

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setMaximumSize(new java.awt.Dimension(400, 600));
        workPanel.setMinimumSize(new java.awt.Dimension(400, 600));
        workPanel.setPreferredSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterActionPerformed
        // TODO add your handling code here:
        EncounterJPanel encounterPanel = new EncounterJPanel(patient, person, house, community, city, system);
        splitPane.setRightComponent(encounterPanel);
    }//GEN-LAST:event_btnEncounterActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(patient, person, house, community, city, system);
        splitPane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel personPanel = new PersonJPanel(person, house, community, city, system);
        splitPane.setRightComponent(personPanel);
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHouse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHouse1ActionPerformed
        // TODO add your handling code here:
        HousingJPanel housePanel = new HousingJPanel(person, house, community, city, system);
        splitPane.setRightComponent(housePanel);
    }//GEN-LAST:event_btnHouse1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        UpdateJPanel updatePanel = new UpdateJPanel(person, patient, house, community, city, system);
        splitPane.setRightComponent(updatePanel);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
        CommunityJPanel commPanel = new CommunityJPanel(person, patient, house, community, city, system);
        splitPane.setRightComponent(commPanel);
    }//GEN-LAST:event_btnCommunityActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunity;
    private javax.swing.JButton btnEncounter;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHouse1;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
