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
public class DoctorDirectory {

        ArrayList<User> doctorDirectory;

        public DoctorDirectory() {
                doctorDirectory = new ArrayList<>();
        }

        public ArrayList<User> getDoctorDirectory() {
                return doctorDirectory;
        }

        public void setDoctorDirectory(ArrayList<User> doctorDirectory) {
                this.doctorDirectory = doctorDirectory;
        }

        public void addDoctor() {
                User u = new User();
                doctorDirectory.add(u);
        }

        public User searchDoctor(String ID) {
                for (User ua : doctorDirectory) {
                        if (ua.getID().equals(ID)) {
                                return ua;
                        }
                }
                return null;
        }
}
