/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PersonInfo;
import model.PersonHistory;

/**
 *
 * @author kshetrahegde
 */
public class ManagePersonsJPanel extends javax.swing.JPanel {

    /** Creates new form ManagePersonsJPanel */
    PersonHistory personhistory;
    public ManagePersonsJPanel(PersonHistory personhistory) {
        initComponents();
        
        this.personhistory = personhistory;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddPerson = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        lblComm = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblHosp = new javax.swing.JLabel();
        txtAddr = new javax.swing.JTextField();
        txtpatID = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblHosp1 = new javax.swing.JLabel();
        txtHosp = new javax.swing.JTextField();
        lblHosp2 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        btnAdd.setBackground(new java.awt.Color(51, 51, 0));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 51, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblTitle.setText("Person Directory Information");

        tblAddPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Community", "City", "Patient ID", "Nearest Hospital", "Age"
            }
        ));
        jScrollPane1.setViewportView(tblAddPerson);

        lblName.setText("Person Name");

        lblAddr.setText("House");

        btnView.setBackground(new java.awt.Color(51, 51, 0));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblCity.setText("Community");

        btnRefresh.setBackground(new java.awt.Color(51, 51, 0));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblComm.setText("City");

        btnDelete.setBackground(new java.awt.Color(51, 51, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        lblHosp.setText("Patient ID");

        txtAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddrActionPerformed(evt);
            }
        });

        txtpatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatIDActionPerformed(evt);
            }
        });
        txtpatID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpatIDKeyPressed(evt);
            }
        });

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommunityKeyPressed(evt);
            }
        });

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        lblHosp1.setText("Nearest Hospital");

        txtHosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHospKeyPressed(evt);
            }
        });

        lblHosp2.setText("Age");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddr)
                            .addComponent(lblName)
                            .addComponent(lblCity)
                            .addComponent(lblComm)
                            .addComponent(lblHosp)
                            .addComponent(lblHosp1)
                            .addComponent(lblHosp2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHosp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(txtpatID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddr, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddr)
                            .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComm)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHosp)
                            .addComponent(txtpatID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHosp1)
                            .addComponent(txtHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHosp2)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnRefresh)
                            .addComponent(btnDelete))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        if(txtName.getText().equals("")||txtAddr.getText().equals("")||txtCommunity.getText().equals("")||txtCity.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all details!");
        }
        else {
            
            

            String personName = txtName.getText();
            String personHouse = txtAddr.getText();
            String personCommunity = txtCommunity.getText();
            String personCity = txtCity.getText();
            int patientID = Integer.parseInt(txtpatID.getText());
            String hospNearby = txtHosp.getText();
            int personAge = Integer.parseInt(txtAge.getText());

            PersonInfo pi = personhistory.addNewPerson();

            pi.setPersonName(personName);
            pi.setPersonHouse(personHouse);
            pi.setPersonCommunity(personCommunity);
            pi.setPersonCity(personCity);
            pi.setPatientID(patientID);
            pi.setHospNear(hospNearby);
            pi.setPersonAge(personAge);

            JOptionPane.showMessageDialog(this, "Information Added!");

            txtName.setText("");
            txtAddr.setText("");
            txtCommunity.setText("");
            txtCity.setText("");
            txtpatID.setText("");
            txtHosp.setText("");
            txtAge.setText("");
            displayTable();

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblAddPerson.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblAddPerson.getModel();

        if(tblAddPerson.getSelectedRowCount() == 1) {
            
            String personName = txtName.getText();
            String personHouse = txtAddr.getText();
            String personCommunity = txtCommunity.getText();
            String personCity = txtCity.getText();
            int patientID = Integer.parseInt(txtpatID.getText());
            String hospNearby = txtHosp.getText();
            int personAge = Integer.parseInt(txtAge.getText());
                    
                    
            

            model.setValueAt(personName, tblAddPerson.getSelectedRow(), 0);
            model.setValueAt(personHouse, tblAddPerson.getSelectedRow(), 1);
            model.setValueAt(personCommunity, tblAddPerson.getSelectedRow(), 2);
            model.setValueAt(personCity, tblAddPerson.getSelectedRow(), 3);
            model.setValueAt(patientID, tblAddPerson.getSelectedRow(), 4);
            model.setValueAt(hospNearby, tblAddPerson.getSelectedRow(), 5);
            model.setValueAt(personAge, tblAddPerson.getSelectedRow(), 6);

        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblAddPerson.getSelectedRow();
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddPerson.getModel();
        PersonInfo selectedperson = (PersonInfo) model.getValueAt(selectedRowIndex, 0);

        //txtPatName.setText(model.getValueAt(selectedRowIndex, 0).toString());

        txtName.setText(selectedperson.getPersonName());
        txtAddr.setText(selectedperson.getPersonHouse());
        txtCommunity.setText(selectedperson.getPersonCommunity());
        txtCity.setText(selectedperson.getPersonCity());
        txtpatID.setText(String.valueOf(selectedperson.getPatientID()));
        txtHosp.setText(selectedperson.getHospNear());
        txtAge.setText(String.valueOf(selectedperson.getPersonAge()));
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        displayTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAddPerson.getSelectedRow();

        if(selectedRowIndex<0) {

            JOptionPane.showMessageDialog(this, "Please select the row!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddPerson.getModel();
        PersonInfo selectcomm = (PersonInfo) model.getValueAt(selectedRowIndex, 0);

        personhistory.deletePerson(selectcomm);
        JOptionPane.showMessageDialog(this, "Doctor Information Deleted!");
        displayTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrActionPerformed

    private void txtpatIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatIDActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtName.setEditable(false);
        }
        else {
            txtName.setEditable(true);
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtCommunityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtCommunity.setEditable(false);
        }
        else {
            txtCommunity.setEditable(true);
        }
    }//GEN-LAST:event_txtCommunityKeyPressed

    private void txtCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtCity.setEditable(false);
        }
        else {
            txtCity.setEditable(true);
        }
    }//GEN-LAST:event_txtCityKeyPressed

    private void txtHospKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHospKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtHosp.setEditable(false);
        }
        else {
            txtHosp.setEditable(true);
        }
    }//GEN-LAST:event_txtHospKeyPressed

    private void txtpatIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpatIDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtpatID.setEditable(false);
        }
        else {
            txtpatID.setEditable(true);
        }
    }//GEN-LAST:event_txtpatIDKeyPressed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
            txtAge.setEditable(false);
        }
        else {
            txtAge.setEditable(true);
        }
    }//GEN-LAST:event_txtAgeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddr;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblHosp;
    private javax.swing.JLabel lblHosp1;
    private javax.swing.JLabel lblHosp2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAddPerson;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHosp;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtpatID;
    // End of variables declaration//GEN-END:variables
    
    private void displayTable() {
       
        
        DefaultTableModel model1 = (DefaultTableModel) tblAddPerson.getModel();
        model1.setRowCount(0);
        
        for (PersonInfo pi : personhistory.getPersonhistory()){
            
            Object[] row = new Object[7];
            //row[0] = pi.getPatientName();
            row[0] = pi;
            row[1] = pi.getPersonHouse();
            row[2] = pi.getPersonCommunity();
            row[3] = pi.getPersonCity();
            row[4] = pi.getPatientID();
            row[5] = pi.getHospNear();
            row[6] = pi.getPersonAge();
            
            
            
            model1.addRow(row);
            
        }
         
        
    }


}
