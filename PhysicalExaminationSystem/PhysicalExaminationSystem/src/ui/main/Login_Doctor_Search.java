/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import LoginAccount.PESystem;
import LoginAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TANKLI
 */
public class Login_Doctor_Search extends javax.swing.JPanel {

        private JPanel userProcessContainer;
        private PESystem system;

        public Login_Doctor_Search(JPanel userProcessContainer, PESystem system) {
                this.userProcessContainer = userProcessContainer;
                this.system = system;
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btnBack = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                txtUserID = new javax.swing.JTextField();
                btnSearch = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblID = new javax.swing.JTable();

                btnBack.setText("Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                jLabel1.setText("User ID:");

                btnSearch.setText("Search");
                btnSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSearchActionPerformed(evt);
                        }
                });

                tblID.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "Name", "ID", "Age", "Gender", "Department", "Center"
                        }
                ));
                jScrollPane1.setViewportView(tblID);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(123, 123, 123)
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnSearch))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(btnBack)))
                                                .addGap(0, 142, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSearch))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(82, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                // TODO add your handling code here:
                String text = txtUserID.getText();
                User authenticateUser = system.getDoctorDirectory().searchDoctor(text);
                if (authenticateUser == null) {
                        JOptionPane.showMessageDialog(null, "Doctor Not founded");
                } else {
                        populateTable();
                }
        }//GEN-LAST:event_btnSearchActionPerformed

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                // TODO add your handling code here:
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
        }//GEN-LAST:event_btnBackActionPerformed

        public void populateTable() {
                DefaultTableModel model = (DefaultTableModel) tblID.getModel();
                model.setRowCount(0);
                for (User u : system.getDoctorDirectory().getDoctorDirectory()) {
                        Object row[] = new Object[6];
                        row[0] = u;
                        row[1] = u.getID();
                        row[2] = u.getAge();
                        row[3] = u.getGender();
                        row[4] = u.getDepartment();
                        row[5] = u.getCenter();
                        model.addRow(row);
                }

        }

//        public void refreshTable() {
        //
        //        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnSearch;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblID;
        private javax.swing.JTextField txtUserID;
        // End of variables declaration//GEN-END:variables
}
