  /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model;

/**
 *
 * @author k1012904
 */
public class Team {
//below are attributes to my team class
    private String Name;  
    private String[] Coaches;
    private String League;
    private String Division;
    private String Fulltime;

    public static void main(String[] args) {
        System.out.println("Football Main Method"); //I created this Main Method to rest the 
                                                    //implementation of my class
    }
        
        //check that the new constructor and toString() method works
        //try it on an array of objects **part of test Main method**
        /*Team t = new Team("Ashton Athletic,Oliver Talty:Wilfredo Ruddell:Danial Brock:Modesto Blose:Marty Pegram,National,1,yes");
        Team[] Teams = new Team[3];
        Teams[0] = new Team("Ashton Athletic,Oliver Talty:Wilfredo Ruddell:Danial Brock:Modesto Blose:Marty Pegram,National,1,yes");
        Teams[1] = new Team("Barnstoneworth United, Kelly Toothman:Carlos Schacht:Raul Bresnahan:Oren Fogal:Felipe Lesher:Geoffrey Caya,National,1,yes");
        Teams[2] = new Team("Wood Green,Jon Bryer:Abe Meza:Stan Policastro:Joan Shiring:Silas Dearmas:Cedric Twombly,Conference,1,no");
        int i =0;
        for (Team t :Teams){
        System.out.print(t);
        }*/

       

    
    
    /**
     * Convert a String to an array of Strings
     * @param t a string for conversion
     * @return array of Strings, separated at the colon characters
     */
private String[] getStringAsArray(String t)
    {
        String[] result = t.split(":");
        return result;
    }


    /**
 * sets the Coaches names
 * @param Coaches the coaches names as a string separated by spaces
 */
    public void setCoaches(String Coaches)
    {
        this.Coaches= getStringAsArray(Coaches);
    }

    
    /**
     * Convert an array of Strings into one String
     * @param t target array of Strings
     * @return  single String comprised of all the array elements separated by spaces
     */
    
    
    private String getArrayAsString(String[] t)
    {
        String result = " ";
        
        for(String s: t)
        {
            result += s+", ";
        }
        result = result.trim();
        return result;
    }
    
    /**
     * Gets the coaches names
     * @return the coaches names as a String separated by spaces
     */
    public String getCoachesAsString()
    {
        return getArrayAsString(Coaches);
    }
    
  /**
     * Override toString() method
     * @return a String with all the attributes of the Team
     */
    
    @Override
        public String toString()
    {
        return Name+ ": " + getCoachesAsString()+" "
                +League + " " + Division+" " 
                +Fulltime+" ";
        
    }
    
    public String textArea()
    {
         return Name+ "\t" + getCoachesAsString()+"\t"
                +League + "\t" + Division+"\t" 
                +Fulltime+"\n";
    }
  
    /**
     * create a team from a line in a data file
     * @param csvString 
     */
    public Team (String csvString)
    {
        String[] attributes = csvString.split(","); //split line from data file at commas
        int i = 0;
        for (String t : attributes)
        {
            switch (i)
            {
                case 0:
                    this.Name = t;
                    break;
                case 1:
                    this.Coaches = getStringAsArray(t);
                    break;
                case 2:
                    this.League = t;
                    break;
                case 3:
                    this.Division = t;
                    break;
                case 4:
                    this.Fulltime =(t); //new access method to convert a string to a boolean
                    break;
                    
            }
            i++;
        }
    }
     
    public String getName(){   //Here i implemented the access methods to my attribute Name
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
   
  
    /**
     * Get the value of Coaches
     *
     * @return the value of Coaches
     * 
     * 
     */
    public String[] getCoaches() {      //Here i implemented the access methods to my attribute coaches
        return Coaches;
    }
    /**
     * Set the value of Coaches
     *
     * @param Coaches new value of Coaches
     */
    public void setCoaches(String[] Coaches) {
        this.Coaches = Coaches;
    }


    /**
     * Get the value of league
     *
     * @return the value of league
     */
    public String getLeague() {  //Here i implemented the access methods to my attribute league
        return League;
    }

    /**
     * Set the value of league
     *
     * @param league new value of league
     */
    public void setLeague(String League) {
        this.League = League;
        
        
        
        /**
         * Gets the Division
         * return a string containing the Division
         */
    }
    public String getDivision(){   //Here i implemented the access methods to my attribute Division
        return Division;
    }
    /**
     * sets the Division
     * @param id a String containing the Division 
     */
    public void setDivision(String Division){
        this.Division = Division;
    }
    public String getFulltime(){   //Here i implemented the access methods to my attribute fulltime
        return Fulltime;
    }
    public void setFulltime(String Fulltime){
        this.Fulltime = Fulltime;
    }

}
    
