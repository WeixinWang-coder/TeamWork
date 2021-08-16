/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.customer;

import LoginAccount.Center;
import LoginAccount.Department;
import LoginAccount.PESystem;
import LoginAccount.User;
import LoginAccount.UserDirectory.CheckItem;
import LoginAccount.UserDirectory.CustomerEntry;
import LoginAccount.UserDirectory.CustomerEntryHistory;
import LoginAccount.UserDirectory.Date;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TANKLI
 */
public class CreateNewExamination extends javax.swing.JPanel {

        JPanel userProcessContainer;
        User account;
        PESystem system;
        CustomerEntry c;

        public CreateNewExamination(JPanel userProcessContainer, User account, PESystem system) {
                initComponents();
                this.c = new CustomerEntry();
                this.userProcessContainer = userProcessContainer;
                this.account = account;
                this.system = system;
                txtName.setText(account.getName());
                refreshTable();
                cmbMonth();
                cmbDate();
                cmbYear();
                cmbCenter();
                cmbItem();
        }

        public void cmbMonth() {
                cmbMonth.addItem("January");
                cmbMonth.addItem("Feburary");
                cmbMonth.addItem("March");
                cmbMonth.addItem("April");
                cmbMonth.addItem("May");
                cmbMonth.addItem("June");
                cmbMonth.addItem("July");
                cmbMonth.addItem("Auguest");
                cmbMonth.addItem("September");
                cmbMonth.addItem("Octorber");
                cmbMonth.addItem("November");
                cmbMonth.addItem("December");
        }

        public void cmbDate() {
                for (int i = 1; i < 32; i++) {
                        cmbDate.addItem(String.valueOf(i));
                }
        }

        public void cmbYear() {
                for (int i = 2021; i < 2025; i++) {
                        cmbYear.addItem(String.valueOf(i));
                }
        }

        public void cmbCenter() {
                for (Center c : system.getCenterDirectory().getCenterDirectory()) {
                        cmbCenter.addItem(c.getName());
                }
        }

        public void cmbItem() {
                for (Department d : system.getDepartmentDirectory().getDepartmentDirectory()) {
                        cmbItem.addItem(d.getName());
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                tblItem = new javax.swing.JTable();
                cmbItem = new javax.swing.JComboBox<>();
                btnPay = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                btnAdd = new javax.swing.JButton();
                cmbCenter = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                btnBack = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                cmbMonth = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                cmbDate = new javax.swing.JComboBox<>();
                jLabel7 = new javax.swing.JLabel();
                cmbYear = new javax.swing.JComboBox<>();
                btnDelete = new javax.swing.JButton();
                txtTotalPrice = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txtName = new javax.swing.JTextField();

                tblItem.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null},
                                {null, null},
                                {null, null},
                                {null, null}
                        },
                        new String [] {
                                "Item", "Price"
                        }
                ));
                jScrollPane2.setViewportView(tblItem);

                btnPay.setText("Pay");
                btnPay.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPayActionPerformed(evt);
                        }
                });

                jLabel1.setText("Item:");

                jLabel2.setText("Total Prices;");

                btnAdd.setText("Add");
                btnAdd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAddActionPerformed(evt);
                        }
                });

                jLabel3.setText("Center:");

                btnBack.setText("Back");
                btnBack.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnBackActionPerformed(evt);
                        }
                });

                jLabel4.setText("Date:");

                jLabel5.setText("Month");

                jLabel6.setText("Date:");

                jLabel7.setText("Year:");

                btnDelete.setText("Delete");
                btnDelete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDeleteActionPerformed(evt);
                        }
                });

                jLabel8.setText("Customer Name:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel7)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(cmbItem, 0, 328, Short.MAX_VALUE)
                                                                        .addComponent(cmbCenter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnAdd))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(81, 81, 81)
                                                                                .addComponent(jLabel2)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(txtTotalPrice))
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnDelete))))
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(50, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel6)
                                                .addComponent(cmbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7)
                                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAdd)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDelete))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(btnPay)
                                        .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
                userProcessContainer.remove(this);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);
        }//GEN-LAST:event_btnBackActionPerformed

        private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
                String selectedMonth = (String) cmbMonth.getSelectedItem();
                String selectedDate = (String) cmbDate.getSelectedItem();
                String selectedYear = (String) cmbYear.getSelectedItem();
                String selectedCenter = (String) cmbCenter.getSelectedItem();
                String selectedItem = (String) cmbItem.getSelectedItem();

                
                c.setDate(selectedDate);
                c.setMonth(selectedMonth);
                c.setYear(selectedYear);
                
                c.setCenter(selectedCenter);
                
                CheckItem ci = new CheckItem();
                ci.setItemName(selectedItem);
                ci.setPrice(String.valueOf(getPrice(selectedItem)));
                c.getItem().add(ci);
                refreshTable();
                refreshPrice();


        }//GEN-LAST:event_btnAddActionPerformed

        private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                // TODO add your handling code here:
                int row = tblItem.getSelectedRow();
                if (row < 0) {
                        JOptionPane.showMessageDialog(null, "Please select a row from the table first", " warning", JOptionPane.WARNING_MESSAGE);
                        return;
                }
                CheckItem checkItem = (CheckItem) tblItem.getValueAt(row, 0);
                c.getItem().remove(checkItem);
                refreshTable();
                refreshPrice();
                
        }//GEN-LAST:event_btnDeleteActionPerformed

        private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
                // TODO add your handling code here:
                String selectedMonth = (String) cmbMonth.getSelectedItem();
                String selectedDate = (String) cmbDate.getSelectedItem();
                String selectedYear = (String) cmbYear.getSelectedItem();
                String date = selectedDate+"/"+selectedMonth+"/"+selectedYear;
                account.getEntryHistory().getEntryHistory().put(date, c);
                JOptionPane.showMessageDialog(null, "Thanks for your payment", " ", JOptionPane.INFORMATION_MESSAGE);
        }//GEN-LAST:event_btnPayActionPerformed

        public int getPrice(String s) {
                switch(s) {
                        case "Basic Inspection" : return 100;
                        case "Innternal Med" : return 200;
                        case "Orthopedics" : return 300;
                        case "Otorhinolaryngologic" : return 280;
                        case "Surgery" : return 320;
                        case "Clinical-Lab" : return 50;
                }
                return 0;
        }
        public void refreshTable() {
                DefaultTableModel model = (DefaultTableModel) tblItem.getModel();
                model.setRowCount(0);
                for (CheckItem checkItem : c.getItem()) {
                        Object row[] = new Object[2];
                        row[0] = checkItem;
                        row[1] = checkItem.getPrice();
                        model.addRow(row);
                }
        }
        public void refreshPrice() {
                int sum = 0;
                int row = tblItem.getRowCount();
                
                for(int i = 1; i <= row; i++) {
                        String price = (String) tblItem.getValueAt(i - 1, 1);
                        sum += Integer.parseInt(price);
                }
                txtTotalPrice.setText(String.valueOf(sum));
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAdd;
        private javax.swing.JButton btnBack;
        private javax.swing.JButton btnDelete;
        private javax.swing.JButton btnPay;
        private javax.swing.JComboBox<String> cmbCenter;
        private javax.swing.JComboBox<String> cmbDate;
        private javax.swing.JComboBox<String> cmbItem;
        private javax.swing.JComboBox<String> cmbMonth;
        private javax.swing.JComboBox<String> cmbYear;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable tblItem;
        private javax.swing.JTextField txtName;
        private javax.swing.JTextField txtTotalPrice;
        // End of variables declaration//GEN-END:variables
}
