/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import LoginAccount.DoctorDirectory;
import LoginAccount.PESystem;
import LoginAccount.User;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TANKLI
 */
public class Login_Doctor extends javax.swing.JPanel {

        private JPanel userProcessContainer;
        private User userAccount;
        private PESystem system;

        public Login_Doctor(JPanel userProcessContainer, User useraccount, PESystem system) {
                initComponents();

                this.userAccount = useraccount;
                this.userProcessContainer = userProcessContainer;
                this.system = system;
                refreshTable();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                btnBack = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tblDoctor = new javax.swing.JTable();
                tbnSearch = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                btnDelete = new javax.swing.JButton();
                btnAssign = new javax.swing.JButton();

                btnBack.setText("Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null},
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "Name", "ID", "Gender", "Age", "Department", "Center"
                        }
                ));
                jScrollPane1.setViewportView(tblDoctor);

                tbnSearch.setText("Search");
                tbnSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                tbnSearchActionPerformed(evt);
                        }
                });

                jLabel1.setText("Doctor Information In Physical Examination Center");

                btnDelete.setText("Delete");
                btnDelete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeleteActionPerformed(evt);
                        }
                });

                btnAssign.setText("Assign");
                btnAssign.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAssignActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnBack)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(tbnSearch)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnDelete)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnAssign))
                                                        .addComponent(jLabel1))
                                                .addGap(0, 318, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tbnSearch)
                                        .addComponent(btnDelete)
                                        .addComponent(btnAssign))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
        }//GEN-LAST:event_btnBackActionPerformed

        private void tbnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSearchActionPerformed
                // TODO add your handling code here:

                Login_Doctor_Search mod = new Login_Doctor_Search(userProcessContainer, system);
                userProcessContainer.add("Login_User_Search", mod);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

//                User authenticateUser = system.getUserDirectory().authenticateUser(password);
//                 
//                if (authenticateUser == null) {
//                        
//                        system.getUserDirectory().getUserAccountList().add(ua);//save a new user in system
//
//                        RegisterInformation mod = new RegisterInformation(system, userProcessContainer, ua);
//                        userProcessContainer.add("RegisterInformation", mod);
//                        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//                        layout.next(userProcessContainer);
//                } else {
//                        JOptionPane.showMessageDialog(null, "This is a exsiting name or password");
//                        return;
//                }
        }//GEN-LAST:event_tbnSearchActionPerformed

        private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                // TODO add your handling code here:
                int row = tblDoctor.getSelectedRow();
                if (row < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row from the table first", " warning", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                User user = (User) tblDoctor.getValueAt(row, 0);
                system.getDoctorDirectory().getDoctorDirectory().remove(user);
                refreshTable();
        }//GEN-LAST:event_btnDeleteActionPerformed

        private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
                // TODO add your handling code here:
                int row = tblDoctor.getSelectedRow();
                if (row < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row from the table first", " warning", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                User selectedUser = (User) tblDoctor.getValueAt(row, 0);
                Login_Doctor_Assgin vpdjp = new Login_Doctor_Assgin(userProcessContainer, selectedUser, system);
                userProcessContainer.add("Login_Doctor_Assgin", vpdjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
        }//GEN-LAST:event_btnAssignActionPerformed

        public void refreshTable() {
                DefaultTableModel model = (DefaultTableModel) tblDoctor.getModel();
                model.setRowCount(0);
                for (User u : system.getDoctorDirectory().getDoctorDirectory()) {
                        Object row[] = new Object[6];
                        row[0] = u;
                        row[1] = u.getID();
                        row[2] = u.getGender();
                        row[3] = u.getAge();
                        row[4] = u.getDepartment();
                        row[5] = u.getCenter();
                        model.addRow(row);
                }
        }
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAssign;
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnDelete;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblDoctor;
        private javax.swing.JButton tbnSearch;
        // End of variables declaration//GEN-END:variables
}
