/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DoctorHistory;
import model.DoctorInfo;

/**
 *
 * @author kshetrahegde
 */
public class FindDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FindDoctorJPanel
     */
    DoctorHistory history;
    private JPanel userProcessContainer;
    
    public FindDoctorJPanel(JPanel userProcessContainer, DoctorHistory history) {
        initComponents();
        this.history = history;
        this.userProcessContainer = userProcessContainer;
        
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFindDoctor = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDocName = new javax.swing.JTextField();
        lblHosp = new javax.swing.JLabel();
        txtHosp = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblComm = new javax.swing.JLabel();
        txtComm = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();

        tblFindDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Hospital", "City", "Community "
            }
        ));
        jScrollPane1.setViewportView(tblFindDoctor);

        btnView.setBackground(new java.awt.Color(51, 51, 51));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        lblHosp.setText("Hospital");

        txtHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospActionPerformed(evt);
            }
        });

        lblCity.setText("City");

        lblComm.setText("Community");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblComm)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblHosp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCity, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDocName, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(txtHosp)
                                    .addComponent(txtCity)
                                    .addComponent(txtComm)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnView))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHosp)
                    .addComponent(txtHosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComm)
                    .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblFindDoctor.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) tblFindDoctor.getModel();
        //DoctorInfo doctor = (DoctorInfo)model.getValueAt(selectedRowIndex, 0);
        
        //txtDocName.setText(String.valueOf(doctor.getDoctorName()));
        txtDocName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtHosp.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtCity.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtComm.setText(model.getValueAt(selectedRowIndex, 3).toString());
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblFindDoctor.getModel();
        //EmployeeInfo selectedEmployee = (EmployeeInfo)model.getValueAt(selectedRowIndex, 0);
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblFindDoctor.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearch.getText().trim()));
    }//GEN-LAST:event_txtSearchKeyPressed

          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblComm;
    private javax.swing.JLabel lblHosp;
    private javax.swing.JTable tblFindDoctor;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtHosp;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
       
        
        DefaultTableModel model = (DefaultTableModel) tblFindDoctor.getModel();
        model.setRowCount(0);
        
        for (DoctorInfo di : history.getHistory()){
            
            Object[] row = new Object[4];
            row[0] = di.getDoctorName();
            row[1] = di.getHospitalName();
            row[2] = di.getHospitalCity();
            row[3] = di.getHospitalCommunity();
            
            model.addRow(row);
            
        }
        
        
        
        
        
    }


}
