/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.customer;

import LoginAccount.PESystem;
import LoginAccount.User;
import LoginAccount.UserDirectory.CustomerEntry;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.main.Login_Doctor_Search;

/**
 *
 * @author TANKLI
 */
public class ExaminationHistory extends javax.swing.JPanel {

        JPanel userProcessContainer;
        User account;
        PESystem system;

        public ExaminationHistory(JPanel userProcessContainer, User account, PESystem system) {
                initComponents();
                this.userProcessContainer = userProcessContainer;
                this.account = account;
                this.system = system;
                txtName.setText(account.getName());
                refreshTable();
        } 

       public void refreshTable() {
                DefaultTableModel model = (DefaultTableModel) tblHistory.getModel();
                model.setRowCount(0);
                account.getEntryHistory().getEntryHistory().forEach((key,value) ->{
                        Object row[] = new Object[2];
                        row[0] = value;
                        row[1] = key;
                        model.addRow(row);
       });
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                tblHistory = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                btnBack = new javax.swing.JButton();
                btnReview = new javax.swing.JButton();
                txtName = new javax.swing.JTextField();

                tblHistory.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null},
                                {null, null},
                                {null, null},
                                {null, null}
                        },
                        new String [] {
                                "Examination Center", "Date"
                        }
                ));
                jScrollPane1.setViewportView(tblHistory);

                jLabel1.setText("Customer Name:");

                jLabel2.setText("Encounter History");

                btnBack.setText("Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                btnReview.setText("Review");
                btnReview.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnReviewActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBack)
                                                .addGap(67, 67, 67)
                                                .addComponent(jLabel2))
                                        .addComponent(btnReview))
                                .addContainerGap(15, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnBack)
                                        .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReview)
                                .addContainerGap(78, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewActionPerformed

                int row = tblHistory.getSelectedRow();
                if (row < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row from the table first", " warning", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                CustomerEntry customerEntry = (CustomerEntry) tblHistory.getValueAt(row, 0);
                
                ExaminationHistory_Review mod = new ExaminationHistory_Review( userProcessContainer,  account,  system, customerEntry);
                userProcessContainer.add("ExaminationHistory_Review", mod);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                
                
        }//GEN-LAST:event_btnReviewActionPerformed

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                // TODO add your handling code here:
              userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
        }//GEN-LAST:event_btnBackActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnReview;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblHistory;
        private javax.swing.JTextField txtName;
        // End of variables declaration//GEN-END:variables
}
