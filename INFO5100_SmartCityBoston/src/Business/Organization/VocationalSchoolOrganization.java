/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VocationalSchoolRole;
import java.util.ArrayList;

/**
 *
 * @author pravin
 */
public class VocationalSchoolOrganization extends Organization{
    
    public VocationalSchoolOrganization() {
        super(Organization.Type.VocationalSchool.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VocationalSchoolRole());
        return roles;
    }
    
}
