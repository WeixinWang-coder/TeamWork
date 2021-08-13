/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import Roles.BasicInspectionDoctorRole;
import Roles.SystemAdminRole;
import javax.swing.JOptionPane;

/**
 *
 * @author Syuu
 */
public class ConfigureSystem {
    
    public static PESystem configure(){
        
        PESystem system = PESystem.getInstance();   

        User ua = system.getUserDirectory().createUserAccount("1", "1", new SystemAdminRole());
        
 
//        system.getDepartmentDirectory().addDepartment("Basic Inspection");
//        system.getDepartmentDirectory().addDepartment("Innternal Med");
//        system.getDepartmentDirectory().addDepartment("Orthopedics");
//        system.getDepartmentDirectory().addDepartment("Otorhinolaryngologic");
//        system.getDepartmentDirectory().addDepartment("Surgery");
//        system.getDepartmentDirectory().addDepartment("Phyarmacy");
//        system.getDepartmentDirectory().addDepartment("Feedback");

        Center c = new Center("Center1", "100 Rold", "High");
        system.getCenterDirectory().getCenterDirectory().add(c);
        
//            Center center1 = system.getCenterDirectory().addCenter("Center1", "100 Rold", "High");
//            System.out.println(center1);
//            Center center2 = system.getCenterDirectory().addCenter("Center2", "100 Avenue", "Medium");
//            Center center3 = system.getCenterDirectory().addCenter("Center3", "100 Place", "Medium");
//            Center center4 = system.getCenterDirectory().addCenter("Center4", "100 Circle", "Primary");

            
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
