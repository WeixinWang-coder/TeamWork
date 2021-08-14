/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import Roles.BasicInspectionDoctorRole;
import Roles.ClinicalLabDoctorRole;
import Roles.CustomerRole;
import Roles.InnternalMedDoctorRole;
import Roles.SystemAdminRole;
import javax.swing.JOptionPane;

/**
 *
 * @author Syuu
 */
public class ConfigureSystem {

        public static PESystem configure() {

                PESystem system = PESystem.getInstance();

                User ua = system.getUserDirectory().createUserAccount("2", "2", new SystemAdminRole());
                User createUserAccount = system.getUserDirectory().createUserAccount("c1", "1", new CustomerRole());
                createUserAccount.setName("Alice");
                createUserAccount.setAge("18");
                createUserAccount.setGender("Female");
                createUserAccount.setID("c001");
                createUserAccount.setCenter("Center1");
                
                User createDoctor1 = system.getUserDirectory().createUserAccount("d001", "1", new BasicInspectionDoctorRole());
                createDoctor1.setCenter("Center1");
                
                User createDoctor2 = system.getUserDirectory().createUserAccount("d002", "2", new ClinicalLabDoctorRole());
                
                User createDoctor3 = system.getUserDirectory().createUserAccount("d003", "3", new InnternalMedDoctorRole());
                
                Center center1 = system.getCenterDirectory().addCenter("Center1", "100 Rold", "High");
                Center center2 = system.getCenterDirectory().addCenter("Center2", "100 Avenue", "Medium");
                Center center3 = system.getCenterDirectory().addCenter("Center3", "100 Place", "Medium");
                Center center4 = system.getCenterDirectory().addCenter("Center4", "100 Circle", "Primary");
                
                center1.getCustomerList().add(createUserAccount);
                
                system.getDepartmentDirectory().addDepartment("Basic Inspection",100);
                system.getDepartmentDirectory().addDepartment("Innternal Med", 200);
                system.getDepartmentDirectory().addDepartment("Orthopedics",300);
                system.getDepartmentDirectory().addDepartment("Otorhinolaryngologic",280);
                system.getDepartmentDirectory().addDepartment("Surgery",320);
                system.getDepartmentDirectory().addDepartment("Clinical-Lab",50);
                
                system.getDepartmentDirectory().addDepartment("Phyarmacy");
                system.getDepartmentDirectory().addDepartment("Feedback");
                

//        User doctorBruce = new User();
//        doctorBruce.setAge("50");
//        doctorBruce.setCenter("Center 1");
//        doctorBruce.setDepartment("Basic Inspection");
//        doctorBruce.setGender("Male");
//        doctorBruce.setName("Bruce");
//        doctorBruce.setRole(new BasicInspectionDoctorRole());
//        doctorBruce.setUsername("Bruce");
//        doctorBruce.setPassword("1");
//        doctorBruce.setID("001");
//
//        system.getDoctorDirectory().getDoctorDirectory().add(doctorBruce);
                return system;

        }
}
