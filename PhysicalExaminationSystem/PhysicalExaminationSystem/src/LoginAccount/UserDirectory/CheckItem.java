/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount.UserDirectory;

/**
 *
 * @author TANKLI
 */
public class CheckItem {
        String price;
        String itemName;

        public String toString() {
                return itemName;
        }
        public String getPrice() {
                return price;
        }

        public void setPrice(String price) {
                this.price = price;
        }

        public String getItemName() {
                return itemName;
        }

        public void setItemName(String itemName) {
                this.itemName = itemName;
        }
}
