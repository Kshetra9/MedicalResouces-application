/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.DoctorHistory;
import model.EncounterHistory;
import model.HospitalHistory;
import model.PatientInfo;
import model.HospitalDirectory;

/**
 *
 * @author kshetrahegde
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    DoctorHistory history;
    EncounterHistory encounterhistory;
    HospitalHistory hosphistory;
    
    
    
    public MainJFrame() {
        initComponents();
        history = new DoctorHistory();
        encounterhistory = new EncounterHistory();
        hosphistory = new HospitalHistory();
        
        
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
        btnHospital = new javax.swing.JButton();
        btnDoctor = new javax.swing.JButton();
        btnCommunity = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnSystemPatient = new javax.swing.JButton();
        btnHospital1 = new javax.swing.JButton();
        btnSystemPersons = new javax.swing.JButton();
        btnSystemHospital = new javax.swing.JButton();
        btnSystemCommunity = new javax.swing.JButton();
        btnSystemDoctors = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHospital.setText("Hosp. Admin: Add Details");
        btnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalActionPerformed(evt);
            }
        });

        btnDoctor.setText("Doctor Login");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnCommunity.setText("Comm. Admin");
        btnCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityActionPerformed(evt);
            }
        });

        btnPatient.setText("Find Doctor");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnSystemPatient.setText("System Admin : Manage Patients Directory");
        btnSystemPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemPatientActionPerformed(evt);
            }
        });

        btnHospital1.setText("Hosp. Admin: Add Patient");
        btnHospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospital1ActionPerformed(evt);
            }
        });

        btnSystemPersons.setText("System Admin : Manage Persons Directory");
        btnSystemPersons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemPersonsActionPerformed(evt);
            }
        });

        btnSystemHospital.setText("System Admin : Manage Hospital Directory");
        btnSystemHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemHospitalActionPerformed(evt);
            }
        });

        btnSystemCommunity.setText("System Admin : Manage Community Directory");
        btnSystemCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemCommunityActionPerformed(evt);
            }
        });

        btnSystemDoctors.setText("System Admin : Manage Doctors Directory");
        btnSystemDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemDoctorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSystemPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHospital1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSystemPersons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSystemCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSystemHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnSystemDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHospital1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSystemPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btnSystemPersons, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnSystemCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                    .addContainerGap(498, Short.MAX_VALUE)
                    .addComponent(btnSystemHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(250, 250, 250)))
            .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                    .addContainerGap(660, Short.MAX_VALUE)
                    .addComponent(btnSystemDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(88, 88, 88)))
        );

        splitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        FindDoctorJPanel findDoctor = new FindDoctorJPanel(userProcessContainer, history);
        splitPane.setRightComponent(findDoctor);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalActionPerformed
        // TODO add your handling code here:
        AddDoctorJPanel addDoctor = new AddDoctorJPanel(userProcessContainer, history);
        splitPane.setRightComponent(addDoctor);
    }//GEN-LAST:event_btnHospitalActionPerformed

    private void btnCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityActionPerformed
        // TODO add your handling code here:
//        FinalJPanel finalJ = new FinalJPanel(userProcessContainer);
//        userProcessContainer.add("test", finalJ);
//        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCommunityActionPerformed

    private void btnSystemPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemPatientActionPerformed
        // TODO add your handling code here:
        //SysAdminJFrame sysadmin = new SysAdminJFrame();
        //sysadmin.show();
        //dispose();
        ManagePatientsJPanel managePatient = new ManagePatientsJPanel(encounterhistory);
        splitPane.setRightComponent(managePatient);
    }//GEN-LAST:event_btnSystemPatientActionPerformed

    private void btnHospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospital1ActionPerformed
        // TODO add your handling code here:
        
        
        AddPatientJPanel addPatient = new AddPatientJPanel(encounterhistory);
        splitPane.setRightComponent(addPatient);
    }//GEN-LAST:event_btnHospital1ActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        // TODO add your handling code here:
        DoctorLoginJPanel doctorLogin = new DoctorLoginJPanel(encounterhistory);
        splitPane.setRightComponent(doctorLogin);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnSystemPersonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemPersonsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSystemPersonsActionPerformed

    private void btnSystemHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemHospitalActionPerformed
        // TODO add your handling code here:
        ManageHospitalJPanel addHospital = new ManageHospitalJPanel(hosphistory);
        splitPane.setRightComponent(addHospital);
        
    }//GEN-LAST:event_btnSystemHospitalActionPerformed

    private void btnSystemCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSystemCommunityActionPerformed

    private void btnSystemDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemDoctorsActionPerformed
        // TODO add your handling code here:
        ManageDoctorsJPanel managedoctors = new ManageDoctorsJPanel(history);
        splitPane.setRightComponent(managedoctors);
    }//GEN-LAST:event_btnSystemDoctorsActionPerformed

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
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnHospital;
    private javax.swing.JButton btnHospital1;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnSystemCommunity;
    private javax.swing.JButton btnSystemDoctors;
    private javax.swing.JButton btnSystemHospital;
    private javax.swing.JButton btnSystemPatient;
    private javax.swing.JButton btnSystemPersons;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
