/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount.UserDirectory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author TANKLI
 */
public class CustomerEntryHistory {

    public HashMap<String, CustomerEntry> entryHistory;

    public CustomerEntryHistory() {
        entryHistory = new HashMap<>();
    }

    public HashMap<String, CustomerEntry> getEntryHistory() {
        return entryHistory;
    }

    public void setEntryHistory(HashMap<String, CustomerEntry> entryHistory) {
        this.entryHistory = entryHistory;
    }

}
