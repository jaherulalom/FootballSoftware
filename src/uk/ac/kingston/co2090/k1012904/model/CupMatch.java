/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package uk.ac.kingston.co2090.k1012904.model;

/**
 *This class inherits attributes from superclass Match
 * @author k1012904
 */
public class CupMatch extends Match {
    //new attributes for Cup matches
    private String round;
    private String Venue;
    

    
    
    public CupMatch(String csvString)
    {
        String[] attributes = csvString.split(",");
        this.setTeamName(attributes[0]);
        this.setResult(attributes[1]);
        this.setDate(attributes[2]);
        this.setOpponent(attributes[3]);
        this.setAttendance(Integer.parseInt(attributes[4]));
           //new attributes from subclass 
        this.setRound(attributes[5]);
        this.setVenue(attributes[6]);
    }

    public String getVenue() {
        return Venue;
    }

    public void setVenue(String Venue) {
        this.Venue = Venue;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String datePlayed) {
        this.round = datePlayed;
    }
    
      /**
     * override toString method
     * @return string with all attributes and new attributes from leagueMatch
     */
   @Override 
    public String toString(){
        return this.getTeamName() + "\t" + this.getOpponent() + "\t" + this.getResult() +
                this.getDate() + "\t" + this.getVenue() + "\t" + this.getRound() + "\n";
    }
    
}
