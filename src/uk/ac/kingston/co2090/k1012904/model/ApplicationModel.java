/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model;

import java.util.ArrayList;



/**
 * This is the organising class for the data viewer application
 * all attributes will be static because it does not require multiple instances
 * of this class
 * @author k1012904
 */
public class ApplicationModel {

    private static ArrayList<Team> Teams; // holds a list of Team objects
    
     private static ArrayList<Match> matches; //holds Match objects
     

    private static ArrayList<CupMatch> cupmatches; // holds CupMatch objects
     
     private static ArrayList<LeagueMatch> leaguematches; //holds LeagueMatch objects
   
 /**
      * Access to array list holding cup match objects
      * @return  attributes in array list
      */
    public static ArrayList<CupMatch> getCupmatches() {
        return cupmatches;
    }
/**
     * set the value of cup matches 
     * @param cupmatches new value
     */
    public static void setCupmatches(ArrayList<CupMatch> cupmatches) {
        ApplicationModel.cupmatches = cupmatches;
    }

    public static ArrayList<LeagueMatch> getLeaguematches() {
        return leaguematches;
    }

    public static void setLeaguematches(ArrayList<LeagueMatch> leaguematches) {
        ApplicationModel.leaguematches = leaguematches;
    }

    public static ArrayList<Match> getMatches() {
        return matches;
    }

    public static void setMatches(ArrayList<Match> matches) {
        ApplicationModel.matches = matches;
    }
      
    /**
     * Get the value of Teams
     *
     * @return the value of Teams
     */
    public static ArrayList<Team> getTeams()
    {
        return Teams;
    }

    /**
     * Set the value of Teams
     *
     * @param Teams new value of Teams
     */
  public static void setTeams(ArrayList<Team> Teams)
    {
        ApplicationModel.Teams = Teams;
    }
  
  
public static String MatchToString()
{
    String result = "";
    for (Match one : matches)
    {
        result = result + one.toString();
    }
    return result;   
}

/**
 * for all teams in the model
 * @return teams as string
 */
public static String TeamsListToString(){
    String result = "";
    for (Team one : Teams)
    {
        result = result + one.textArea();
    }
    return result;
}
public static String CupMatchToString()
{
    String result = "";
    for (Match one : cupmatches)
    {
        result = result + one.toString();
    }
    return result;
}
public static String LeagueMatchToString()
{
    String result = "";
    for (Match one : leaguematches)
    {
        result = result + one.toString();
    }
    return result;
}




  
public static double getTeamAvAttendence (String TeamName)
{
    /**
     * go through big list of teams
     * build a new list containing the attendance value
     */
    ArrayList<Integer> Attendance = new ArrayList<Integer>();
    ArrayList<CupMatch> attList = new ArrayList<CupMatch>();
    attList.addAll(cupmatches);
    for (Match mat : matches)
    {
        //this is the team
        if (mat.getTeamName().equals(TeamName))
        {
            //add the fixture attendance to their list
            Attendance.add(mat.getAttendance());
        }
    }
    // go through all the teams games and calculate their
    //overall attendance
    int total = 0; //start off with attendance of 0
    
    for (int Attendances : Attendance)
    {
        
   
       
     //   float multiplier = (res.getAttendance()/100F);
      
        total = total + Attendances;
    }
    
    double average = total / Attendance.size();
    return average;
}
}
   




   
   







