/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author pravin
 */
public class CitizensDirectory {
    
    UserAccountDirectory useracc;
    private ArrayList<Citizen> citizens_Dir; 
    private CitizensDirectory citizens_Di;
    

      
 
    public CitizensDirectory(){
      citizens_Dir = new ArrayList<Citizen>();
    }

    public ArrayList<Citizen> getCitizens_Dir() {
        return citizens_Dir;
    }

    public void setCitizens_Dir(ArrayList<Citizen> citizen_Dir) {
        this.citizens_Dir = citizens_Dir;
    }
    
     public Citizen addCitizen()
    {
        Citizen c = new Citizen();
        citizens_Dir.add(c);
        return c;
    }
    
    
}
