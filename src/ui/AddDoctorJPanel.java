/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.DoctorHistory;
import model.DoctorInfo;

/**
 *
 * @author kshetrahegde
 */
public class AddDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDoctorJPanel
     */
    DoctorHistory history;
    
    public AddDoctorJPanel(DoctorHistory history) {
        initComponents();
        this.history = history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddDoctor = new javax.swing.JLabel();
        btnDocName = new javax.swing.JLabel();
        btnDocAge = new javax.swing.JLabel();
        btnDocCity = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        btnComm = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        txtHospCity = new javax.swing.JTextField();
        txtComm = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblAddDoctor.setText("Add Doctor Details");
        lblAddDoctor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnDocName.setText("Name");

        btnDocAge.setText("Hospital");

        btnDocCity.setText("City");

        btnComm.setText("Community");

        txtHospCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospCityActionPerformed(evt);
            }
        });

        txtComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnDocName)
                                            .addComponent(btnDocCity)
                                            .addComponent(btnDocAge))
                                        .addGap(29, 29, 29))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnComm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtHospCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txtHospital, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtComm))
                                .addGap(24, 24, 24))
                            .addComponent(lblAddDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(btnSave)))
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblAddDoctor)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocName)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocAge)
                    .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDocCity)
                    .addComponent(txtHospCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComm)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSave)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHospCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospCityActionPerformed

    private void txtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(txtDocName.getText().equals("")||txtHospital.getText().equals("")||txtHospCity.getText().equals("")||txtComm.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all details!");
        }
        else {
            
            String doctorName = txtDocName.getText();
            String hospitalName = txtHospital.getText();
            String hospitalCity = txtHospCity.getText();
            String hospitalCommunity = txtComm.getText();
            
            DoctorInfo di = history.addNewDoctor();
            
            di.setDoctorName(doctorName);
            di.setHospitalName(hospitalName);
            di.setHospitalCity(hospitalCity);
            di.setHospitalCommunity(hospitalCommunity);
            
            
            
            JOptionPane.showMessageDialog(this, "Information Added!");
            
            txtDocName.setText("");
            txtHospital.setText("");
            txtHospCity.setText("");
            txtComm.setText("");
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnComm;
    private javax.swing.JLabel btnDocAge;
    private javax.swing.JLabel btnDocCity;
    private javax.swing.JLabel btnDocName;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddDoctor;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtHospCity;
    private javax.swing.JTextField txtHospital;
    // End of variables declaration//GEN-END:variables
}
