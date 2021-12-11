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
import userinterface.AdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author pravin
 */
public class AdminRole extends Role {
    
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,CitizensDirectory cd,UserAccountDirectory user_Dir) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, cd, user_Dir);
    }
    
}
