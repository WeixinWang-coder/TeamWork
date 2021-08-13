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
class DepartmentDirectory {
        ArrayList<Department> departmentDirectory;

        public DepartmentDirectory() {
                departmentDirectory = new ArrayList<>();
        }

        public ArrayList<Department> getDepartmentDirectory() {
                return departmentDirectory;
        }

        public void setDepartmentDirectory(ArrayList<Department> departmentDirectory) {
                this.departmentDirectory = departmentDirectory;
        }
        public void addDepartment(String name) {
                Department d = new Department(name);
                departmentDirectory.add(d);
        }
}
