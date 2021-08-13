/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import LoginAccount.PESystem;
import LoginAccount.User;
import javax.swing.JPanel;
import ui.main.Login;

/**
 *
 * @author Syuu
 */
public class SystemAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User u, PESystem system) {
        return new Login(userProcessContainer,u, system);
    } 
}
