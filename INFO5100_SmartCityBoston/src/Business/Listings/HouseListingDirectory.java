/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Listings;

import Business.Employee.Employee;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import userinterface.MainJFrame;
import userinterface.PermanentHousing.AddListingJPanel;

/**
 *
 * @author pravin
 */
public class HouseListingDirectory {

    private ArrayList<HouseListings> houseList;
    UserAccountDirectory useracc;
    private ArrayList<HouseListings> HouseListing_Dir;
    private HouseListingDirectory HouseLisitng_Di;
    MainJFrame main;
    AddListingJPanel addlisting;
    int Total_count = 0;

    public int getTotal_count() {
        return Total_count;
    }

    public void setTotal_count(int Total_count) {
        this.Total_count = Total_count;
    }

    public HouseListingDirectory() {
        HouseListing_Dir = new ArrayList<HouseListings>();
    }

    public ArrayList<HouseListings> getHouseListing_Dir() {
        return HouseListing_Dir;
    }

    public void setHouseListing_Dir(ArrayList<HouseListings> HouseListing_Dir) {
        this.HouseListing_Dir = HouseListing_Dir;
    }

    public HouseListings addHouseListing() {
        HouseListings h = new HouseListings();
        HouseListing_Dir.add(h);
        Total_count = HouseListing_Dir.size();
        return h;
    }

    public void DeleteHouseListing(HouseListings h) {

        HouseListing_Dir.remove(h);
        Total_count = HouseListing_Dir.size();

    }

    public HouseListingDirectory getHouseListingDirectory() {
        HouseListingDirectory hd = addlisting.getDir();
        return hd;
    }

}
