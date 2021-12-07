/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Citizen.CitizensDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author pravin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CitizensDirectory cd;
    private UserAccountDirectory uad;
//    private HouseListingDirectory hsd;
//    private TempHouseListingDirectory thsd;

    public CitizensDirectory getVd() {
        return cd;
    }

    public void setVd(CitizensDirectory cd) {
        this.cd = cd;
    }

    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }
   

//    public TempHouseListingDirectory getThsd() {
//        return thsd;
//    }
//
//    public void setThsd(TempHouseListingDirectory thsd) {
//        this.thsd = thsd;
//    }
//
//    public HouseListingDirectory getHsd() {
//        return hsd;
//    }
//
//    public void setHsd(HouseListingDirectory hsd) {
//        this.hsd = hsd;
//    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem() {};
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
}
