/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.Viewer;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
import uk.ac.kingston.co2090.k1012904.model.ApplicationModel;

/**
 *The application viewer is done by the application control once the 
 * application starts
 * if ApplicationModel has data then this is added to the viewer
 * The ApplicationViewer is updated whenever data is added or changed.
 * @author k1012904
 */
public class ApplicationViewer extends JFrame
{
    //user new TextAreaPanel

    private JTextArea TeamDisplay = new JTextArea();
    private JTabbedPane tabs = new JTabbedPane();
    private TextAreaPanel leagueMatch;
    private TextAreaPanel cupMatch;
    private TextAreaPanel teamDetails;
    private TextAreaPanel Teamresult;
   
    
    private SelectTeamPanel selectedTeam = new SelectTeamPanel();
   
    public ApplicationViewer()
    {

        this.setTitle("Football Teams Viewer");
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(TeamDisplay));
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //retrieve formatted details of teams and matches
        //create the new display panel for them
        teamDetails = new TextAreaPanel(ApplicationModel.TeamsListToString());
        teamDetails.add(selectedTeam, BorderLayout.SOUTH);
        
     //   Teamresult = new TextAreaPanel(ApplicationModel.TeamsListToString());
      leagueMatch = new TextAreaPanel(ApplicationModel.LeagueMatchToString());
      cupMatch = new TextAreaPanel (ApplicationModel.CupMatchToString());
     
      
      /**
       * Below Tabs are added to the GUI and given a 
       * name "Team Name" and then a attribute to 
       * display
       */
      tabs.add("Team Name", teamDetails);
     // tabs.add("Match Info", Teamresult);
     tabs.add("Cup Matches", cupMatch);
     tabs.add("League Matches", leagueMatch);
      this.add(tabs);
      this.setVisible(true); //visible true for user to se
    }
}
