/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount.UserDirectory;

import LoginAccount.User;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Syuu
 */
public class UserAccountDirectory {
    
    private ArrayList<User> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }
    
    public User authenticateUser(String username, String password){
        for (User ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User authenticateUser(String password){
        for (User ua : userAccountList)
            if (ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User createUserAccount(String username, String password, Role role){
        User userAccount = new User();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}