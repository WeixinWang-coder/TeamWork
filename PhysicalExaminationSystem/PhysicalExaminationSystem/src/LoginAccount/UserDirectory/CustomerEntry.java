/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount.UserDirectory;

import java.util.ArrayList;

/**
 *
 * @author TANKLI
 */
public class CustomerEntry {
        
        ArrayList<CheckItem> item;
        String center;
        String year;
        String month;
        String date;

        public String toString() {
                return center;
        }
        public ArrayList<CheckItem> getItem() {
                return item;
        }

        public String getYear() {
                return year;
        }

        public void setYear(String year) {
                this.year = year;
        }

        public String getMonth() {
                return month;
        }

        public void setMonth(String month) {
                this.month = month;
        }

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }

        public void setItem(ArrayList<CheckItem> item) {
                this.item = item;
        }
        
        public CustomerEntry() {
                this.item = new ArrayList<>();
        }

       

        public String getCenter() {
                return center;
        }

        public void setCenter(String center) {
                this.center = center;
        }

        
        
}
