
/*

 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.control.Utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import uk.ac.kingston.co2090.k1012904.model.*;

/**
 *
 * @author k1012904
 */
public class FileReadWrite
{

    // public static Team[] readTeamsFromFile() {
    public static ArrayList<Team> readTeamsAsList(String csvFile)
    {
        //read from text file per line
        ArrayList<Team> Teams = new ArrayList<Team>();
        BufferedReader infile = null; 
        
        String csvString;
        try
        {
            // read the header line (could use this)
            infile = new BufferedReader(new FileReader(csvFile));
            csvString = infile.readLine();
            while (infile.ready())
            {
                Teams.add(new Team(infile.readLine()));

            }
        } catch (Exception e)
        {
            // for debug purposes
            e.printStackTrace();
        } finally
        {
            // close file here
            if (infile != null)
            {
                try
                {
                    infile.close();
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        return Teams;
    }
 
    public static ArrayList<Match> readMatches(String csvFile){
        String csvString;
        BufferedReader infile = null;
        ArrayList<Match> Matches = new ArrayList<Match>();
        try{
            infile = new BufferedReader(new FileReader(csvFile));
            csvString = infile.readLine();
            while (infile.ready())
            {
                csvString = infile.readLine();
                Matches.add(new Match (csvString) {});
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if (infile != null){
                try{
                    infile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        return Matches;
    }
   
    public static ArrayList<CupMatch> readcupmatches(String csvFile){
        String csvString;
        BufferedReader infile = null;
        ArrayList<CupMatch> cupmatches = new ArrayList<CupMatch>();
        try{
            infile = new BufferedReader(new FileReader(csvFile));
            csvString = infile.readLine();
            while (infile.ready())
            {
                csvString = infile.readLine();
                cupmatches.add(new CupMatch (csvString));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if (infile != null){
                try{
                    infile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        return cupmatches;
    }
   
    
      public static ArrayList<LeagueMatch> readleaguematches(String csvFile){
        String csvString;
        BufferedReader infile = null;
        ArrayList<LeagueMatch> leaguematches = new ArrayList<LeagueMatch>();
        try{
            infile = new BufferedReader(new FileReader(csvFile));
            csvString = infile.readLine();
            while (infile.ready())
            {
                csvString = infile.readLine();
                leaguematches.add(new LeagueMatch (csvString));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if (infile != null){
                try{
                    infile.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        return leaguematches;
    }
    
}
