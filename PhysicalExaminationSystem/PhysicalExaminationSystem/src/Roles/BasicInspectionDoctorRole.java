/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import LoginAccount.Center;
import LoginAccount.PESystem;
import LoginAccount.User;
import javax.swing.JPanel;
import ui.Doctor.BasicDoctor;
import ui.Doctor.BasicDoctorWaitingList;

/**
 *
 * @author TANKLI
 */
public class BasicInspectionDoctorRole extends Role {

        @Override
        public JPanel createWorkArea(JPanel userProcessContainer, User account, PESystem system) {
                return new BasicDoctorWaitingList(userProcessContainer,account, system);
        }
        
}
