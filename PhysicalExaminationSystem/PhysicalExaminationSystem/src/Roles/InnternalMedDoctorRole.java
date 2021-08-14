/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import LoginAccount.PESystem;
import LoginAccount.User;
import javax.swing.JPanel;
import ui.Doctor.InnternalMedWaitingList;

/**
 *
 * @author TANKLI
 */
public class InnternalMedDoctorRole extends Role {
    
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer, User account, PESystem system) {
                return new InnternalMedWaitingList(userProcessContainer,account, system);
        }
}
