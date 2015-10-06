/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package uk.ac.kingston.co2090.k1012904.model;

/**
 *this class inherits from the abstract class Match
 * @author k1012904
 */
public class LeagueMatch extends Match {
    //new attributes for league matches
     private String ticketPrice;
    private String awayFans;
    
     public LeagueMatch(String csvString)
    {
        String[] attributes = csvString.split(","); 
        //inherited attributes from superclass 
        this.setTeamName(attributes[0]);
        this.setResult(attributes[2]);
        this.setDate(attributes[3]);
        this.setAttendance(Integer.parseInt(attributes[4]));
        //new attributes from subclass 
        this.setTicketPrice(attributes[5]); 
        this.setAwayFans(attributes[6]);
    
}
/**
      * access method to new attribute AwayFans
      * @return value of AwayFans
      */
    public String getAwayFans() {
        return awayFans;
    }
/**
     * set value of AwayFans
     * @param AwayFans new value of AwayFans
     */
    public void setAwayFans(String awayFans) {
        this.awayFans = awayFans;
    }
/**
     * get value of ticket price
     * @return  value of ticket price
     */
    public String getTicketPrice() {
        return ticketPrice;
    }
/**
     * set value of ticket price
     * @param ticketPrice new value of ticket price
     */
    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    /**
     * override toString method
     * @return string with all attributes and new attributes from leagueMatch
     */
      @Override 
    public String toString(){
        return this.getTeamName() + "\t" + this.getOpponent() + "\t" + this.getResult() +
                this.getDate() + "\t" + this.getTicketPrice() + "\t" + this.getAwayFans() + "\n";
}
      
}