/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import LoginAccount.Center;
import LoginAccount.PESystem;
import LoginAccount.User;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TANKLI
 */
public class Login_Center extends javax.swing.JPanel {

        private JPanel userProcessContainer;
        private User userAccount;
        private PESystem system;

        public Login_Center(JPanel userProcessContainer, User useraccount, PESystem system) {
                initComponents();
                this.userAccount = useraccount;
                this.userProcessContainer = userProcessContainer;
                this.system = system;
                refreshTable();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                loginJButton = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tbnCenter = new javax.swing.JTable();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                loginJButton.setText("Back");
                loginJButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                loginJButtonActionPerformed(evt);
                        }
                });

                tbnCenter.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null},
                                {null, null, null},
                                {null, null, null},
                                {null, null, null}
                        },
                        new String [] {
                                "Name", "Address", "Level"
                        }
                ));
                tbnCenter.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
                jScrollPane1.setViewportView(tbnCenter);

                jButton1.setText("Create");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Delete");

                jLabel1.setText("Examination Center Information");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loginJButton)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2))
                                        .addComponent(jLabel1))
                                .addContainerGap(103, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginJButton)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap(87, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);

        }//GEN-LAST:event_loginJButtonActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jButton1ActionPerformed
        public void refreshTable() {
                System.out.println("111");
                DefaultTableModel model = (DefaultTableModel) tbnCenter.getModel();
                model.setRowCount(0);
                
                for (Center u : system.getCenterDirectory().getCenterDirectory()) {
                        Object row[] = new Object[3];
                        row[0] = u;
                        row[1] = u.getAddress();
                        row[2] = u.getLevel();
                        model.addRow(row);
                        
                }
                
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton loginJButton;
        private javax.swing.JTable tbnCenter;
        // End of variables declaration//GEN-END:variables
}
