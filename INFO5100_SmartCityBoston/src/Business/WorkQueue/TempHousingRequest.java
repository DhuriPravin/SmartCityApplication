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
public class TempHousingRequest extends WorkRequest {
    
    int NumberOfPeople;
    String HousingSociety;
    String Comment;

    public int getNumberOfPeople() {
        return NumberOfPeople;
    }

    public void setNumberOfPeople(int NumberOfPeople) {
        this.NumberOfPeople = NumberOfPeople;
    }

    public String getHousingSociety() {
        return HousingSociety;
    }

    public void setHousingSociety(String HousingSociety) {
        this.HousingSociety = HousingSociety;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    
    
}
