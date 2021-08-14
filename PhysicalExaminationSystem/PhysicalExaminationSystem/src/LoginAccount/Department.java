/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import java.util.ArrayList;

/**
 *
 * @author Syuu
 */
public class Department {
        ArrayList<User> userList;
        String name;
        int price;
        public Department(String name, int price) {
                this.name = name;
                this.price = price;
                this.userList = new ArrayList();
        }

        public Department(String name) {
                this.name = name;
        }
        public ArrayList<User> getUserList() {
                return userList;
        }

        public void setUserList(ArrayList<User> userList) {
                this.userList = userList;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

}
