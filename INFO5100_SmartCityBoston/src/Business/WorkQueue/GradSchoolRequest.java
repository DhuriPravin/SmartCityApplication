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
public class GradSchoolRequest extends WorkRequest {
    
    String highschoolGrade;
    String highSchool;
    String bachelorUniv;
    String bachelorGrade;
    String bachelorDegree;
    String desProgram;
    String desUniv;
    String desIntake;
    String additionalInfo;

    public String getHighschoolGrade() {
        return highschoolGrade;
    }

    public void setHighschoolGrade(String highschoolGrade) {
        this.highschoolGrade = highschoolGrade;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getBachelorUniv() {
        return bachelorUniv;
    }

    public void setBachelorUniv(String bachelorUniv) {
        this.bachelorUniv = bachelorUniv;
    }

    public String getBachelorGrade() {
        return bachelorGrade;
    }

    public void setBachelorGrade(String bachelorGrade) {
        this.bachelorGrade = bachelorGrade;
    }

    public String getBachelorDegree() {
        return bachelorDegree;
    }

    public void setBachelorDegree(String bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public String getDesProgram() {
        return desProgram;
    }

    public void setDesProgram(String desProgram) {
        this.desProgram = desProgram;
    }

    public String getDesUniv() {
        return desUniv;
    }

    public void setDesUniv(String desUniv) {
        this.desUniv = desUniv;
    }

    public String getDesIntake() {
        return desIntake;
    }

    public void setDesIntake(String desIntake) {
        this.desIntake = desIntake;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
    
    @Override
    public String toString() {
        return bachelorUniv;
    }
    
}
