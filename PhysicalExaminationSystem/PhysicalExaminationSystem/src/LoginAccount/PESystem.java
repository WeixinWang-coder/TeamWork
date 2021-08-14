/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import LoginAccount.UserDirectory.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Syuu
 */
public class PESystem {
    
    private static PESystem system;
    private UserAccountDirectory userAccountDirectory;
    private CenterDirectory centerDirectory;
    private DepartmentDirectory departmentDirectory;
    private DoctorDirectory doctorDirectory;
    private CustomerDirectory customerDirectory;

    public PESystem() {
            userAccountDirectory = new UserAccountDirectory();
            centerDirectory = new CenterDirectory();
            departmentDirectory = new DepartmentDirectory();
            doctorDirectory = new DoctorDirectory();
            customerDirectory = new CustomerDirectory();
    }

        public static PESystem getSystem() {
                return system;
        }

        public static void setSystem(PESystem system) {
                PESystem.system = system;
        }

        public UserAccountDirectory getUserAccountDirectory() {
                return userAccountDirectory;
        }

        public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
                this.userAccountDirectory = userAccountDirectory;
        }

        public CenterDirectory getCenterDirectory() {
                return centerDirectory;
        }

        public void setCenterDirectory(CenterDirectory centerDirectory) {
                this.centerDirectory = centerDirectory;
        }

        public DepartmentDirectory getDepartmentDirectory() {
                return departmentDirectory;
        }

        public void setDepartmentDirectory(DepartmentDirectory departmentDirectory) {
                this.departmentDirectory = departmentDirectory;
        }

        public DoctorDirectory getDoctorDirectory() {
                return doctorDirectory;
        }
        
        public void addDoctor(User u) {
                doctorDirectory.getDoctorDirectory().add(u);
                userAccountDirectory.getUserAccountList().add(u);
        }

        public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
                this.doctorDirectory = doctorDirectory;
        }

        public CustomerDirectory getCustomerDirectory() {
                return customerDirectory;
        }

        public void setCustomerDirectory(CustomerDirectory customerDirectory) {
                this.customerDirectory = customerDirectory;
        }


       

    
    public static PESystem getInstance(){
        if(system==null){
            system=new PESystem();
        }
        return system;
    }

    public UserAccountDirectory getUserDirectory() {
        return userAccountDirectory;
    }

    
}
    
    
    
    
    

