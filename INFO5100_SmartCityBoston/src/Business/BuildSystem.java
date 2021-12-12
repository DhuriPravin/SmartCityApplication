/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author pravin
 */
public class BuildSystem {
    
        public static EcoSystem build(){
        
        EcoSystem system = EcoSystem.getInstance();
               
        Employee employee = system.getEmployeeDirectory().createEmployee("admin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin123", "admin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
