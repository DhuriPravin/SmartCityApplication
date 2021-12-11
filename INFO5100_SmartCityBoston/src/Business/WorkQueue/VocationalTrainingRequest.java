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
public class VocationalTrainingRequest extends WorkRequest{
    
    private String housingRequest;
    private String areaofInterest;
    private String campus;
    private String highestQualification;
    private String fundingRequired;
    private String additionalComments;

    public String getHousingRequest() {
        return housingRequest;
    }

    public void setHousingRequest(String housingRequest) {
        this.housingRequest = housingRequest;
    }

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

    public String getFundingRequired() {
        return fundingRequired;
    }

    public void setFundingRequired(String fundingRequired) {
        this.fundingRequired = fundingRequired;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String additionalComments) {
        this.additionalComments = additionalComments;
    }
    
    
    
}
