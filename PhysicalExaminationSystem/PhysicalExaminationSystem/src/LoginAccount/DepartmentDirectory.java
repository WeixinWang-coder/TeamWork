/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import java.util.ArrayList;

/**
 *
 * @author TANKLI
 */
public class DepartmentDirectory {

        ArrayList<Department> departmentDirectory;

        public DepartmentDirectory() {
                departmentDirectory = new ArrayList<>();
        }

        public ArrayList<Department> getDepartmentDirectory() {
                return departmentDirectory;
        }

        public void setDepartmentDirectory(ArrayList<Department> departmentDirectory) {
                this.departmentDirectory = departmentDirectory;
        }

        public void addDepartment(String name, int price) {
                Department d = new Department(name, price);
                departmentDirectory.add(d);
        }
        public void addDepartment(String name) {
                Department d = new Department(name);
                departmentDirectory.add(d);
        }

        public Department BasicInspectionfindDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Basic Inspection")) {
                                return d;
                        }
                }
                return null;
               
        }
        public Department InnternalMedDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Innternal Med")) {
                                return d;
                        }
                }
                return null;    
        }
        
        public Department OrthopedicsDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Orthopedics")) {
                                return d;
                        }
                }
                return null;      
        }
        
        public Department OtorhinolaryngologicDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Otorhinolaryngologic")) {
                                return d;
                        }
                }
                return null;
               
        }
        
        public Department SurgeryDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Surgery")) {
                                return d;
                        }
                }
                return null;
               
        }
        public Department ClinicalLabDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Clinical-Lab")) {
                                return d;
                        }
                }
                return null;   
        }
        
         public Department PharmacyDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Clinical-Lab")) {
                                return d;
                        }
                }
                return null;   
        }
          public Department FeedbackDepartment() {
                for (Department d : departmentDirectory) {
                        if (d.getName().equals("Feedback")) {
                                return d;
                        }
                }
                return null;   
        }
         /*
                system.getDepartmentDirectory().addDepartment("Basic Inspection",100);
                system.getDepartmentDirectory().addDepartment("Innternal Med", 200);
                system.getDepartmentDirectory().addDepartment("Orthopedics",300);
                system.getDepartmentDirectory().addDepartment("Otorhinolaryngologic",280);
                system.getDepartmentDirectory().addDepartment("Surgery",320);
                system.getDepartmentDirectory().addDepartment("Clinical-Lab",50);
                
                
                 */
}
