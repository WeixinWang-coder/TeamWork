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
public class CustomerDirectory {
        ArrayList<User> customerDirectory;

        public CustomerDirectory() {
                customerDirectory = new ArrayList<>();
        }
        
        public ArrayList<User> getCustomerDirectory() {
                return customerDirectory;
        }

        public void setCustomerDirectory(ArrayList<User> customerDirectory) {
                this.customerDirectory = customerDirectory;
        }
         public User searchCustomer(String ID) {
                for (User ua : customerDirectory) {
                        if (ua.getID().equals(ID)) {
                                return ua;
                        }
                }
                return null;
        }
}
