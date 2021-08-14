/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import LoginAccount.PESystem;
import LoginAccount.User;
import javax.swing.JPanel;
import ui.customer.Main;

/**
 *
 * @author TANKLI
 */
public class CustomerRole extends Role{
        public JPanel createWorkArea(JPanel userProcessContainer, User account, PESystem system) {
                return new Main(userProcessContainer,account, system);
        }
}
