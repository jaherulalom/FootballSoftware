/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.control;

import java.util.HashSet;
import java.util.Set;
import uk.ac.kingston.co2090.k1012904.model.ApplicationModel;
import uk.ac.kingston.co2090.k1012904.model.Viewer.ApplicationViewer;
import uk.ac.kingston.co2090.k1012904.model.control.Utils.FileReadWrite;
/**
 * this will be the entry point to my application and will create the 
 * main application view window and put the data into the model if present
 * @author k1012904
 */
public class ConsoleControl {

   /* private static ApplicationViewer mainView;*/
   
    
    public static void main(String[] args) {
        //test readTeamsAsList method
        //test ApplicationModel class
        //add data to the model
        //create a new viewer
     ApplicationModel.setTeams(FileReadWrite.readTeamsAsList("/Users/jaherulalom/Desktop/FootballSoftware/football_co2090.csv"));     
     ApplicationModel.setMatches(FileReadWrite.readMatches("/Users/jaherulalom/Desktop/FootballSoftware/football-matches.csv"));
       ApplicationModel.setCupmatches(FileReadWrite.readcupmatches("/Users/jaherulalom/Desktop/FootballSoftware/football-cupmatches.csv"));
       ApplicationModel.setLeaguematches(FileReadWrite.readleaguematches("/Users/jaherulalom/Desktop/FootballSoftware/football-leaguematches.csv")) ;
       ApplicationViewer appViewer = new ApplicationViewer();
       
       
       
       
        }
 /*   public static ApplicationViewer getMainView(){
        return mainView;
    }*/
    }

