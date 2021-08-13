/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount;

import Roles.Role;
import javax.swing.ImageIcon;

/**
 *
 * @author Syuu
 */
public class User {

        private String password;
        private String username;

        private String name;
        private String ID;
        private String age;
        private String gender;
        
        private String center;
        private String department;
        private Role role;
        
        private ImageIcon logoImage;

        
     
        public User() {
                
        }
        @Override
        public String toString() {
                return name;
        }
        public ImageIcon getLogoImage() {
                return logoImage;
        }

        public String getCenter() {
                return center;
        }

        public void setCenter(String center) {
                this.center = center;
        }

        public void setLogoImage(ImageIcon logoImage) {
                this.logoImage = logoImage;
        }

        public String getDepartment() {
                return department;
        }

        public void setDepartment(String department) {
                this.department = department;
        }

        public User(String password, String username) {
                this.password = password;
                this.username = username;
        }

        public String getPassword() {
                return password;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getID() {
                return ID;
        }

        public void setID(String ID) {
                this.ID = ID;
        }

        public String getAge() {
                return age;
        }

        public void setAge(String age) {
                this.age = age;
        }

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public Role getRole() {
                return role;
        }

        public void setRole(Role role) {
                this.role = role;
        }

}
