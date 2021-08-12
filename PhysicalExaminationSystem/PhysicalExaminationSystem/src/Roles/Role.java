/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import LoginAccount.PESystem;
import LoginAccount.User;
import static com.db4o.internal.InCallback.value;
import javax.swing.JPanel;

/**
 *
 * @author Syuu
 */
public abstract class Role {
    
    public enum RoleType{
        SystemAdminRole("SystemAdmin");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account,  
            PESystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
