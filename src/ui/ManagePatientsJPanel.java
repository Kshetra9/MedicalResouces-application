/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EncounterHistory;
import model.PatientInfo;

/**
 *
 * @author kshetrahegde
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientsJPanel
     */
    EncounterHistory encounterhistory;
    
    public ManagePatientsJPanel(EncounterHistory encounterhistory) {
        initComponents();
        this.encounterhistory = encounterhistory;
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblPatName = new javax.swing.JLabel();
        txtAssigned = new javax.swing.JTextField();
        lblPatAge = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblPatCity = new javax.swing.JLabel();
        txtPatName = new javax.swing.JTextField();
        lblPatID = new javax.swing.JLabel();
        lblEncID = new javax.swing.JLabel();
        lblReport = new javax.swing.JLabel();
        txtReport = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblBP = new javax.swing.JLabel();
        lblAssigned = new javax.swing.JLabel();
        txtPatAge = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtPatCity = new javax.swing.JTextField();
        txtPatID = new javax.swing.JTextField();
        txtEncID = new javax.swing.JTextField();
        txtBP = new javax.swing.JTextField();
        btnSave1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientsDirectory = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        jLabel2.setText("Add Patient Details");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPulse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPulseKeyPressed(evt);
            }
        });

        lblPatName.setText("Name");

        txtAssigned.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAssignedKeyPressed(evt);
            }
        });

        lblPatAge.setText("Age");

        lblPatCity.setText("City");

        txtPatName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatNameKeyPressed(evt);
            }
        });

        lblPatID.setText("ID");

        lblEncID.setText("Encounter ID");

        lblReport.setText("Report");

        txtReport.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtReportKeyPressed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(102, 102, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblBP.setText("Heart Rate");

        lblAssigned.setText("Doc. Assigned");

        txtPatAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatAgeKeyPressed(evt);
            }
        });

        lblPulse.setText("Pulse");

        lblDate.setText("Date");

        txtPatCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatCityActionPerformed(evt);
            }
        });
        txtPatCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatCityKeyPressed(evt);
            }
        });

        txtPatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatIDActionPerformed(evt);
            }
        });
        txtPatID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatIDKeyPressed(evt);
            }
        });

        txtEncID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEncIDKeyPressed(evt);
            }
        });

        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });
        txtBP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBPKeyPressed(evt);
            }
        });

        btnSave1.setBackground(new java.awt.Color(102, 102, 255));
        btnSave1.setForeground(new java.awt.Color(255, 255, 255));
        btnSave1.setText("Update");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        tblPatientsDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Age", "ID", "Encounter", "Heart Rate", "Pulse", "EncounterID", "Diagnosis", "City", "Assigned Doctor"
            }
        ));
        jScrollPane1.setViewportView(tblPatientsDirectory);

        btnView.setBackground(new java.awt.Color(102, 102, 255));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(102, 102, 255));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(102, 102, 255));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnAdd)
                        .addGap(55, 55, 55)
                        .addComponent(btnSave1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatName)
                            .addComponent(lblPatAge)
                            .addComponent(lblPatCity)
                            .addComponent(lblPatID)
                            .addComponent(lblEncID)
                            .addComponent(lblBP)
                            .addComponent(lblPulse)
                            .addComponent(lblAssigned)
                            .addComponent(lblDate)
                            .addComponent(lblReport))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReport, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtBP)
                                    .addComponent(txtPatName)
                                    .addComponent(txtPatAge)
                                    .addComponent(txtPatCity)
                                    .addComponent(txtPatID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEncID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPulse, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(btnRefresh)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatName)
                            .addComponent(txtPatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatAge)
                            .addComponent(txtPatAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatCity)
                            .addComponent(txtPatCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatID)
                    .addComponent(txtPatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncID)
                    .addComponent(txtEncID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBP)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssigned)
                    .addComponent(txtAssigned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblReport))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave1))
                .addGap(0, 300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        if (txtPatName.getText().equals("") || txtPulse.getText().equals("") || txtPatID.getText().equals("") || txtPatCity.getText().equals("") || txtPatAge.getText().equals("") || txtEncID.getText().equals("") ||  txtBP.getText().equals("") || txtAssigned.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all details!");
        } else {

            String patientName = txtPatName.getText();
            int age = Integer.parseInt(txtPatAge.getText());
            String city = txtPatCity.getText();
            int patientId = Integer.parseInt(txtPatID.getText());
            int encounterId = Integer.parseInt(txtEncID.getText());
            int bloodPressure = Integer.parseInt(txtBP.getText());
            int pulse = Integer.parseInt(txtPulse.getText());
            String assignedDoctor = txtAssigned.getText();
            LocalDate d1 = LocalDate.parse(txtDate.getText());
            String diagnosis = txtReport.getText();

            PatientInfo pi = encounterhistory.addNewPatient();

            pi.setPatientName(patientName);
            pi.setAge(age);
            pi.setCity(city);
            pi.setPatientId(patientId);
            pi.setEncounterId(encounterId);
            pi.setBloodPressure(bloodPressure);
            pi.setPulse(pulse);
            pi.setAssignedDoctor(assignedDoctor);
            pi.setD1(d1);
            pi.setDiagnosis(diagnosis);

            JOptionPane.showMessageDialog(this, "Information Added!");

            txtPatName.setText("");
            txtPatAge.setText("");
            txtPatCity.setText("");
            txtPatID.setText("");
            txtEncID.setText("");
            txtBP.setText("");
            txtPulse.setText("");
            txtAssigned.setText("");
            txtDate.setText("");
            txtReport.setText("");
            displayTable();

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtPatCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatCityActionPerformed

    private void txtPatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatIDActionPerformed

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientsDirectory.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPatientsDirectory.getModel();
        //PatientInfo selectPatient = (PatientInfo)model.getValueAt(selectedRowIndex, 0);
        
        if(tblPatientsDirectory.getSelectedRowCount() == 1) {
            String patientName = txtPatName.getText();
            int age = Integer.parseInt(txtPatAge.getText());
            String city = txtPatCity.getText();
            int patientId = Integer.parseInt(txtPatID.getText());
            int encounterId = Integer.parseInt(txtEncID.getText());
            int bloodPressure = Integer.parseInt(txtBP.getText());
            int pulse = Integer.parseInt(txtPulse.getText());
            String assignedDoctor = txtAssigned.getText();
            LocalDate d1 = LocalDate.parse(txtDate.getText());
            String diagnosis = txtReport.getText();
            
            
            model.setValueAt(patientName, tblPatientsDirectory.getSelectedRow(), 0);
            model.setValueAt(age, tblPatientsDirectory.getSelectedRow(), 1);
            model.setValueAt(city, tblPatientsDirectory.getSelectedRow(), 8);
            model.setValueAt(patientId, tblPatientsDirectory.getSelectedRow(), 2);
            model.setValueAt(encounterId, tblPatientsDirectory.getSelectedRow(), 6);
            model.setValueAt(bloodPressure, tblPatientsDirectory.getSelectedRow(), 4);
            model.setValueAt(pulse, tblPatientsDirectory.getSelectedRow(), 5);
            model.setValueAt(assignedDoctor, tblPatientsDirectory.getSelectedRow(), 9);
            model.setValueAt(d1, tblPatientsDirectory.getSelectedRow(), 3);
            model.setValueAt(diagnosis, tblPatientsDirectory.getSelectedRow(), 7);
            
            
            txtPatName.setText("");
            txtPatAge.setText("");
            txtPatCity.setText("");
            txtPatID.setText("");
            txtEncID.setText("");
            txtBP.setText("");
            txtPulse.setText("");
            txtAssigned.setText("");
            txtDate.setText("");
            txtReport.setText("");
            
        }
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        
        
        int selectedRowIndex = tblPatientsDirectory.getSelectedRow();
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }
        
        
        
        DefaultTableModel model = (DefaultTableModel) tblPatientsDirectory.getModel();
        //PatientInfo selectedPatient = (PatientInfo) model1.getValueAt(selectedRowIndex, 0);
        //txtName.setText(String.valueOf(selectedPatient.getPatientName()));
        
        txtPatName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtPatAge.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtPatCity.setText(model.getValueAt(selectedRowIndex, 8).toString());
        txtPatID.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtEncID.setText(model.getValueAt(selectedRowIndex, 6).toString());
        txtBP.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtPulse.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtAssigned.setText(model.getValueAt(selectedRowIndex, 9).toString());
        txtDate.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtReport.setText(model.getValueAt(selectedRowIndex, 9).toString());
        
        /* txtPatName.setText(selectedpatient.getPatientName());
        txtPatAge.setText(String.valueOf(selectedpatient.getAge()));
        txtPatCity.setText(selectedpatient.getCity());
        txtPatID.setText(String.valueOf(selectedpatient.getPatientId()));
        txtEncID.setText(String.valueOf(selectedpatient.getEncounterId()));
        txtBP.setText(String.valueOf(selectedpatient.getBloodPressure()));
        txtPulse.setText(String.valueOf(selectedpatient.getBloodPressure()));
        txtAssigned.setText(selectedpatient.getAssignedDoctor());
        txtDate.setText(String.valueOf(selectedpatient.getD1()));
        txtReport.setText(selectedpatient.getDiagnosis()); */
        
        
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPatientsDirectory.getSelectedRow();
        
        if(selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select the row!");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatientsDirectory.getModel();
        PatientInfo selectPatient = (PatientInfo) model.getValueAt(selectedRowIndex, 0);
        
        encounterhistory.deletePatient(selectPatient);
        JOptionPane.showMessageDialog(this, "Employee Information Deleted!");
        displayTable();
//        if(tblPatientsDirectory.getSelectedRowCount()==1) {
//            model.removeRow(tblPatientsDirectory.getSelectedRow());
//            JOptionPane.showMessageDialog(this, "Employee Information Deleted!");
//        }


        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        displayTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtPatNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtPatName.setEditable(false);
        }
        else {
            txtPatName.setEditable(true);
        }
    }//GEN-LAST:event_txtPatNameKeyPressed

    private void txtPatCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatCityKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtPatCity.setEditable(false);
        }
        else {
            txtPatCity.setEditable(true);
        }
    }//GEN-LAST:event_txtPatCityKeyPressed

    private void txtAssignedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAssignedKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtAssigned.setEditable(false);
        }
        else {
            txtAssigned.setEditable(true);
        }
    }//GEN-LAST:event_txtAssignedKeyPressed

    private void txtReportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReportKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtReport.setEditable(false);
        }
        else {
            txtReport.setEditable(true);
        }
    }//GEN-LAST:event_txtReportKeyPressed

    private void txtPatAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatAgeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtPatAge.setEditable(false);
        }
        else {
            txtPatAge.setEditable(true);
        }
    }//GEN-LAST:event_txtPatAgeKeyPressed

    private void txtPatIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatIDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtPatID.setEditable(false);
        }
        else {
            txtPatID.setEditable(true);
        }
    }//GEN-LAST:event_txtPatIDKeyPressed

    private void txtEncIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEncIDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtEncID.setEditable(false);
        }
        else {
            txtEncID.setEditable(true);
        }
    }//GEN-LAST:event_txtEncIDKeyPressed

    private void txtBPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBPKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtBP.setEditable(false);
        }
        else {
            txtBP.setEditable(true);
        }
    }//GEN-LAST:event_txtBPKeyPressed

    private void txtPulseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtPulse.setEditable(false);
        }
        else {
            txtPulse.setEditable(true);
        }
    }//GEN-LAST:event_txtPulseKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssigned;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEncID;
    private javax.swing.JLabel lblPatAge;
    private javax.swing.JLabel lblPatCity;
    private javax.swing.JLabel lblPatID;
    private javax.swing.JLabel lblPatName;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable tblPatientsDirectory;
    private javax.swing.JTextField txtAssigned;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEncID;
    private javax.swing.JTextField txtPatAge;
    private javax.swing.JTextField txtPatCity;
    private javax.swing.JTextField txtPatID;
    private javax.swing.JTextField txtPatName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtReport;
    // End of variables declaration//GEN-END:variables
    
    private void displayTable() {
       
        
        DefaultTableModel model1 = (DefaultTableModel) tblPatientsDirectory.getModel();
        model1.setRowCount(0);
        
        for (PatientInfo pi : encounterhistory.getHistory()){
            
            Object[] row = new Object[10];
            //row[0] = pi.getPatientName();
            row[0] = pi;
            row[1] = pi.getAge();
            row[2] = pi.getPatientId();
            row[3] = pi.getD1();
            row[4] = pi.getBloodPressure();
            row[5] = pi.getPulse();
            row[6] = pi.getEncounterId();
            row[7] = pi.getDiagnosis();
            row[8] = pi.getCity();
            row[9] = pi.getAssignedDoctor();
            
            
            model1.addRow(row);
            
        }
         
        
    }


}
