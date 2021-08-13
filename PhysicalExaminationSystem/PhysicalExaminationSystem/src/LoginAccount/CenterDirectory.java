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
public class CenterDirectory {
        ArrayList<Center> centerDirectory;

        public CenterDirectory() {
                centerDirectory = new ArrayList<>();
        }

        public void setCenterDirectory(ArrayList<Center> centerDirectory) {
                this.centerDirectory = centerDirectory;
        }

        public ArrayList<Center> getCenterDirectory() {
                return centerDirectory;
        }
//        public Center addCenter(String name, String address,String level) {
//
//                Center c = new Center(name, address, level);
//                centerDirectory.add(c);
//                return c;
//        }
}
