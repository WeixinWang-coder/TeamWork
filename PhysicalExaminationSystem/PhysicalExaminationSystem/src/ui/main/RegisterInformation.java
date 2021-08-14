/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.main;

import LoginAccount.Department;
import LoginAccount.PESystem;
import LoginAccount.User;
import Roles.BasicInspectionDoctorRole;
import Roles.ClinicalLabDoctorRole;
import Roles.CustomerRole;
import Roles.FeedbackRole;
import Roles.InnternalMedDoctorRole;
import Roles.OrthopedicsDoctorRole;
import Roles.OtorhinolaryngologicDoctorRole;
import Roles.PhyarmacyRole;
import Roles.SurgicalDoctorRole;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author TANKLI
 */
public class RegisterInformation extends javax.swing.JPanel {

        private JPanel mainWorkArea;
        private PESystem system;
        private User user;
        private final JFileChooser fileChooser = new JFileChooser();
        ImageIcon logoImage;

        public RegisterInformation(PESystem system, JPanel mainWorkArea, User user) {
                initComponents();
                this.system =system;
                this.mainWorkArea = mainWorkArea;
                this.user = user;
                
                cmbIdentity();
                cmbGender();
                cmbDepartment();

                FileFilter jpegFileFilter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
                FileFilter pngFileFilter = new FileNameExtensionFilter("PNG file", "png", "png");

                fileChooser.addChoosableFileFilter(jpegFileFilter);
                fileChooser.addChoosableFileFilter(pngFileFilter);
                fileChooser.setFileFilter(jpegFileFilter);

                if (cmbIdentity.equals("Customer")) {
                        cmbDepartment.setVisible(false);
                        lblDepartment.setVisible(false);
                }
                if (cmbIdentity.equals("Doctor")) {
                        cmbDepartment.setVisible(true);
                        lblDepartment.setVisible(true);
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jFileChooser1 = new javax.swing.JFileChooser();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtAge = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtName = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtID = new javax.swing.JTextField();
                imgLogo = new javax.swing.JLabel();
                btnSubmit = new javax.swing.JButton();
                cmbIdentity = new javax.swing.JComboBox<>();
                jLabel6 = new javax.swing.JLabel();
                lblDepartment = new javax.swing.JLabel();
                cmbDepartment = new javax.swing.JComboBox<>();
                jLabel10 = new javax.swing.JLabel();
                cmbGender = new javax.swing.JComboBox<>();
                btnRemove = new javax.swing.JButton();
                btnAttach = new javax.swing.JButton();

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
                );

                jLabel4.setText("Gender:");

                jLabel5.setText("Age:");

                jLabel2.setText("Name:");

                jLabel3.setText("ID:");

                imgLogo.setText("Please Insert your Image");

                btnSubmit.setText("Submit");
                btnSubmit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSubmitActionPerformed(evt);
                        }
                });

                jLabel6.setText("Identity:");

                lblDepartment.setText("Department:");

                jLabel10.setText("Personal Information");

                btnRemove.setText("Remove");
                btnRemove.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRemoveActionPerformed(evt);
                        }
                });

                btnAttach.setText("Attach");
                btnAttach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAttachActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblDepartment)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cmbIdentity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnSubmit)
                                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cmbIdentity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDepartment))
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSubmit)
                                        .addComponent(btnAttach)
                                        .addComponent(btnRemove))
                                .addContainerGap(88, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
            String identity = (String) cmbIdentity.getSelectedItem();
            String gender = (String) cmbGender.getSelectedItem();
            String name = txtName.getText();
            String age = txtAge.getText();
            String id = txtID.getText();

            if (identity.equals("Customer")) {
                    user.setRole(new CustomerRole());
                    user.setAge(age);
                    user.setGender(gender);
                    user.setID(id);
                    user.setName(name);
                    user.setLogoImage(logoImage);
                    system.getCustomerDirectory().getCustomerDirectory().add(user);
                    JOptionPane.showMessageDialog(this, "New Customer Added.");

            } else if (identity.equals("Doctor")) {
                    String selectedItem = (String) cmbDepartment.getSelectedItem();
                    switch (selectedItem) {
                            case "Basic Inspection":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new BasicInspectionDoctorRole());
                                    
                                    Department BasicInspectionfindDepartment = system.getDepartmentDirectory().BasicInspectionfindDepartment();
                                    BasicInspectionfindDepartment.getUserList().add(user);
                                    break;
                            case "Clinical Lab":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new ClinicalLabDoctorRole());
                                    Department ClinicalLabDepartment = system.getDepartmentDirectory().ClinicalLabDepartment();
                                    ClinicalLabDepartment.getUserList().add(user);
                                    break;
                            case "Innternal Med":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new InnternalMedDoctorRole());
                                    
                                     Department InnternalMedDepartment = system.getDepartmentDirectory().InnternalMedDepartment();
                                    InnternalMedDepartment.getUserList().add(user);
                                    break;
                            case "Orthopedics":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new OrthopedicsDoctorRole());
                                    Department OrthopedicsDepartment = system.getDepartmentDirectory().OrthopedicsDepartment();
                                    OrthopedicsDepartment.getUserList().add(user);
                                    
                                    break;
                            case "Otorhinolaryngologic":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new OtorhinolaryngologicDoctorRole());
                                    
                                    Department OtorhinolaryngologicDepartment = system.getDepartmentDirectory().OtorhinolaryngologicDepartment();
                                    OtorhinolaryngologicDepartment.getUserList().add(user);
                                    break;
                            case "Surgery":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new SurgicalDoctorRole());
                                    Department SurgeryDepartment = system.getDepartmentDirectory().SurgeryDepartment();
                                    SurgeryDepartment.getUserList().add(user);
                                    break;
                            case "Phyarmacy":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new PhyarmacyRole());
                                    
                                    Department PharmacyDepartment = system.getDepartmentDirectory().PharmacyDepartment();
                                    PharmacyDepartment.getUserList().add(user);
                                    break;
                            case "Feedback":
                                    user.setDepartment(selectedItem);
                                    user.setRole(new FeedbackRole());
                                    Department FeedbackDepartment = system.getDepartmentDirectory().FeedbackDepartment();
                                    FeedbackDepartment.getUserList().add(user);
                                    break;
                    }
                    user.setAge(age);
                    user.setGender(gender);
                    user.setID(id);
                    user.setName(name);
                    user.setLogoImage(logoImage);
                    system.getDoctorDirectory().getDoctorDirectory().add(user);

                    JOptionPane.showMessageDialog(this, "New Doctor Added.");
            }

    }//GEN-LAST:event_btnSubmitActionPerformed

        private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
                // TODO add your handling code here:
                logoImage = null;
                imgLogo.setIcon(logoImage);
        }//GEN-LAST:event_btnRemoveActionPerformed

        private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
                // TODO add your handling code here:

                int returnVal = fileChooser.showOpenDialog(this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();
                        URL url;
                        try {
                                url = file.toURI().toURL();
                                logoImage = new ImageIcon(url);
                                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
                                imgLogo.setIcon(logoImage);
                        } catch (MalformedURLException ex) {
                                Logger.getLogger(this.getName()).log(Level.SEVERE, null, ex);
                        }
                }
        }//GEN-LAST:event_btnAttachActionPerformed

        private void cmbIdentity() {
                cmbIdentity.addItem("Doctor");
                cmbIdentity.addItem("Customer");
        }

        private void cmbGender() {
                cmbGender.addItem("Male");
                cmbGender.addItem("Female");
                cmbGender.addItem("Other");
        }

        private void cmbDepartment() {
                cmbDepartment.addItem("Basic Inspection");
                cmbDepartment.addItem("Innternal Med");
                cmbDepartment.addItem("Orthopedics");
                cmbDepartment.addItem("Otorhinolaryngologic");
                cmbDepartment.addItem("Surgery");
                cmbDepartment.addItem("Phyarmacy");
                cmbDepartment.addItem("Feedback");
        }
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAttach;
        private javax.swing.JButton btnRemove;
        private javax.swing.JButton btnSubmit;
        private javax.swing.JComboBox<String> cmbDepartment;
        private javax.swing.JComboBox<String> cmbGender;
        private javax.swing.JComboBox<String> cmbIdentity;
        private javax.swing.JLabel imgLogo;
        private javax.swing.JFileChooser jFileChooser1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JLabel lblDepartment;
        private javax.swing.JTextField txtAge;
        private javax.swing.JTextField txtID;
        private javax.swing.JTextField txtName;
        // End of variables declaration//GEN-END:variables

}
