/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Citizen;

/**
 *
 * @author pravin
 */
public class Citizen {
    
    private String firstName;
    private String lastName;
    private String citizen_ID;
    private String username;
    private String password;
    private String coordX;
    private String coordY;
    private String currentConcern;
    private String criticalityLevel;

    public String getCoordX() {
        return coordX;
    }

    public void setCoordX(String coordX) {
        this.coordX = coordX;
    }

    public String getCoordY() {
        return coordY;
    }

    public void setCoordY(String coordY) {
        this.coordY = coordY;
    }

    public String getCurrentConcern() {
        return currentConcern;
    }

    public void setCurrentConcern(String currentConcern) {
        this.currentConcern = currentConcern;
    }

    public String getCriticalityLevel() {
        return criticalityLevel;
    }

    public void setCriticalityLevel(String criticalityLevel) {
        this.criticalityLevel = criticalityLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getVeteran_ID() {
        return citizen_ID;
    }

    public void setVeteran_ID(String veteran_ID) {
        this.citizen_ID = veteran_ID;
    }
    private String residentAddress;
    private String citizenType;
    private String gender;
    private String age;
    private String educationalDetails;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getResidentAddress() {
        return residentAddress;
    }

    public void setResidentAddress(String residentAddress) {
        this.residentAddress = residentAddress;
    }

    public String getArmyType() {
        return citizenType;
    }

    public void setArmyType(String armyType) {
        this.citizenType = armyType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEducationalDetails() {
        return educationalDetails;
    }

    public void setEducationalDetails(String educationalDetails) {
        this.educationalDetails = educationalDetails;
    }
    
    
    @Override
    public String toString() {
        return firstName;
    }
    
}
