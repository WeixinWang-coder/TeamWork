/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import Roles.Role;

/**
 *
 * @author Syuu
 */
public class User {
    
    private String password;
    private String username;
    private Role role;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public User() {
        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
    
    
    
    
}
