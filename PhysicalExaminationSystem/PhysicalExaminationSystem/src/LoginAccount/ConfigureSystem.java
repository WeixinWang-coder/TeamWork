/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import Roles.SystemAdminRole;

/**
 *
 * @author Syuu
 */
public class ConfigureSystem {
    
    public static PESystem configure(){
        
        PESystem system = PESystem.getInstance();
        
        User ua = system.getUserDirectory().createUserAccount("aaa", "111", new SystemAdminRole());
        
        
        
        return system;
        
        
        
    }
}
