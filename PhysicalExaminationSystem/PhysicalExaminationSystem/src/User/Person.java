/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author TANKLI
 */
public class Person {

        public String name;
        private int id;
        private String gender;
        private int brithdate;
        private static int count = 1;

        public Person() {
                id = count;
                count++;
        }

        public int getBrithdate() {
                return brithdate;
        }

        public void setBrithdate(int brithdate) {
                this.brithdate = brithdate;
        }

        public String getName() {
                return name;
        }

        public void setNameString(String name) {
                this.name = name;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public static int getCount() {
                return count;
        }

        public static void setCount(int count) {
                Person.count = count;
        }

              
        @Override
        public String toString() {
                return name;
        }
}
