/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Citizen.CitizensDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JPanel;

/**
 *
 * @author pravin
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        VocationalSchool("Vocational School"), 
        GradSchool("Grad School"), 
        TempHousing("Temporary Housing"), 
        PermHousing("Permanent Housing"),
        Citizen("Citizen");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            CitizensDirectory cd,
            UserAccountDirectory user_Dir);
   
 

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
