/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author pravin
 */
public class OrganizationDirectory {
    
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
      
        if (type.getValue().equals(Organization.Type.VocationalSchool.getValue())) {
            organization = new VocationalSchoolOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.Type.GradSchool.getValue())) {
            organization = new GradSchoolOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.TempHousing.getValue())) {
            organization = new TempHousingOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PermHousing.getValue())) {
            organization = new PermHousingOrganization();
            organizationList.add(organization);
        } 
        else if (type.getValue().equals(Organization.Type.Job.getValue())) {
            organization = new JobOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
    
}
