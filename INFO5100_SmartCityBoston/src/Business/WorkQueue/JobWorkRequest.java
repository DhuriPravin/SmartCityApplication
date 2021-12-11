/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author pravin
 */
public class JobWorkRequest extends WorkRequest {
    
    private String areaofInterest;
    private String campus;
    private String highestQualification;
    private String candidateName;

    public String getAreaofInterest() {
        return areaofInterest;
    }

    public void setAreaofInterest(String areaofInterest) {
        this.areaofInterest = areaofInterest;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }
    
    
    
}
