/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityInfo;
import model.CommunityHistory;

/**
 *
 * @author kshetrahegde
 */
public class ManageCommunityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCommunityJPanel
     */
    CommunityHistory commhistory;
    public ManageCommunityJPanel(CommunityHistory commhistory) {
        initComponents();
        
        this.commhistory = commhistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddr = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblComm = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddr = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtComm = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddCommunity = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblHosp = new javax.swing.JLabel();
        txthosp = new javax.swing.JTextField();

        lblTitle.setText("Community Directory Information");

        lblName.setText("Person Name");

        lblAddr.setText("Address");

        lblCity.setText("City");

        lblComm.setText("Community Name");

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

        txtAddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddrActionPerformed(evt);
            }
        });

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCityKeyPressed(evt);
            }
        });

        txtComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommActionPerformed(evt);
            }
        });
        txtComm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCommKeyPressed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblAddCommunity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "City", "Community Name", "Nearest Hospital"
            }
        ));
        jScrollPane1.setViewportView(tblAddCommunity);

        btnView.setBackground(new java.awt.Color(0, 102, 102));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 102, 102));
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 102, 102));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblHosp.setText("Closest Hospital");

        txthosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthospActionPerformed(evt);
            }
        });
        txthosp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txthospKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(29, 29, 29)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddr)
                                    .addComponent(lblName)
                                    .addComponent(lblCity)
                                    .addComponent(lblComm)
                                    .addComponent(lblHosp))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(txtAddr)
                                    .addComponent(txtCity)
                                    .addComponent(txtComm)
                                    .addComponent(txthosp))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(btnView)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblComm)
                            .addComponent(txtComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHosp)
                            .addComponent(txthosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnRefresh)
                            .addComponent(btnDelete))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddrActionPerformed

    private void txtCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        if(txtName.getText().equals("")||txtAddr.getText().equals("")||txtCity.getText().equals("")||txtComm.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all details!");
        }
        else {

            String personName = txtName.getText();
            String personAddress = txtAddr.getText();
            String commName = txtComm.getText();
            String commCity = txtCity.getText();
            String hospNearby = txthosp.getText();
            

            CommunityInfo ci = commhistory.addNewCommunity();

            ci.setPersonName(personName);
            ci.setPersonAddress(personAddress);
            ci.setCommCity(commCity);
            ci.setCommName(commName);
            ci.setHospNearby(hospNearby);
            

            JOptionPane.showMessageDialog(this, "Information Added!");

            txtName.setText("");
            txtAddr.setText("");
            txtCity.setText("");
            txtComm.setText("");
            txthosp.setText("");
            displayTable();

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblAddCommunity.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblAddCommunity.getModel();

        if(tblAddCommunity.getSelectedRowCount() == 1) {
            String personName = txtName.getText();
            String personAddress = txtAddr.getText();
            String commName = txtComm.getText();
            String commCity = txtCity.getText();
            String hospNearby = txthosp.getText();

            model.setValueAt(personName, tblAddCommunity.getSelectedRow(), 0);
            model.setValueAt(personAddress, tblAddCommunity.getSelectedRow(), 1);
            model.setValueAt(commName, tblAddCommunity.getSelectedRow(), 2);
            model.setValueAt(commCity, tblAddCommunity.getSelectedRow(), 3);
            model.setValueAt(hospNearby, tblAddCommunity.getSelectedRow(), 4);
            
            
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblAddCommunity.getSelectedRow();
        if(selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddCommunity.getModel();
        CommunityInfo selectedcommunity = (CommunityInfo) model.getValueAt(selectedRowIndex, 0);

        //txtPatName.setText(model.getValueAt(selectedRowIndex, 0).toString());
         
        
        
        
        txtName.setText(selectedcommunity.getPersonName());
        txtAddr.setText(selectedcommunity.getPersonAddress());
        txtCity.setText(selectedcommunity.getCommCity());
        txtComm.setText(selectedcommunity.getCommName());
        txthosp.setText(selectedcommunity.getHospNearby());

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        displayTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblAddCommunity.getSelectedRow();

        if(selectedRowIndex<0) {

            JOptionPane.showMessageDialog(this, "Please select the row!");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddCommunity.getModel();
        CommunityInfo selectcomm = (CommunityInfo) model.getValueAt(selectedRowIndex, 0);

        commhistory.deleteCommunity(selectcomm);
        JOptionPane.showMessageDialog(this, "Doctor Information Deleted!");
        displayTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txthospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthospActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthospActionPerformed

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

    private void txtCommKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txtComm.setEditable(false);
        }
        else {
            txtComm.setEditable(true);
        }
    }//GEN-LAST:event_txtCommKeyPressed

    private void txthospKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthospKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)) {
            JOptionPane.showMessageDialog(this, "Please enter alphabets only!");
            txthosp.setEditable(false);
        }
        else {
            txthosp.setEditable(true);
        }
    }//GEN-LAST:event_txthospKeyPressed


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
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblAddCommunity;
    private javax.swing.JTextField txtAddr;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtComm;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txthosp;
    // End of variables declaration//GEN-END:variables
    
    private void displayTable() {
       
        
        DefaultTableModel model1 = (DefaultTableModel) tblAddCommunity.getModel();
        model1.setRowCount(0);
        
        for (CommunityInfo ci : commhistory.getCommhistory()){
            
            Object[] row = new Object[5];
            //row[0] = pi.getPatientName();
            row[0] = ci;
            row[1] = ci.getPersonAddress();
            row[2] = ci.getCommCity();
            row[3] = ci.getCommName();
            row[4] = ci.getHospNearby();
            
            
            
            model1.addRow(row);
            
        }

}
}
