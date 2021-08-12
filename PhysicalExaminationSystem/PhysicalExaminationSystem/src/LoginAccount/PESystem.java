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
    private ArrayList<PhysicalExamination> peDirectory;
    private ArrayList<Department> departmentDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ArrayList<Doctor> doctorDirectory;
    private ArrayList<Customer> customerDirectory;

    public PESystem() {
        this.peDirectory = new ArrayList<PhysicalExamination>();
        this.departmentDirectory = new ArrayList<Department>();
        this.doctorDirectory = new ArrayList<Doctor>();
        this.userAccountDirectory = new UserAccountDirectory();
        this.customerDirectory = new ArrayList<Customer>();
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
    
    
    
    
    

