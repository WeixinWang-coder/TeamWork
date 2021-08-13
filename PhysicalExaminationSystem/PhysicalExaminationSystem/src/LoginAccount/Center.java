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
public class Center {
        String name;
        String address;
        String level;
        ArrayList<User> doctorList;
        ArrayList<User> customerList;
        public Center(String name, String address, String level) {
                System.out.println("000");
                this.name = name;
                this.address = address;
                this.level = level;
                doctorList = new ArrayList<>();
                customerList = new ArrayList<>();
        }
        @Override
        public String toString() {
                return name;
        }
        
        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getLevel() {
                return level;
        }

        public void setLevel(String level) {
                this.level = level;
        }

        public void setCustomerList(ArrayList<User> customerList) {
                this.customerList = customerList;
        }

        public ArrayList<User> getDoctorList() {
                return doctorList;
        }

        public void setDoctorList(ArrayList<User> doctorList) {
                this.doctorList = doctorList;
        }
        
}
