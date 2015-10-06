/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.Viewer;

import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import uk.ac.kingston.co2090.k1012904.model.ApplicationModel;
import uk.ac.kingston.co2090.k1012904.model.control.SelectTeamControl;


/** all required imports are above here
 *a view class for viewing the currently selected student and their total marks
 * @author k1012904
 */
public class SelectTeamPanel extends JPanel{
    JLabel TeamLabel = new JLabel("Team Name");
    JLabel resultLabel = new JLabel ("Average Attendance"); //Adds a new label to display average attendance
    // new combo box and inside getTeams
    JComboBox teamCombo = new JComboBox(ApplicationModel.getTeams().toArray());
   
     public SelectTeamPanel() {
        this.setLayout(new GridLayout(1,2));
        TeamLabel.addMouseListener(new SelectTeamControl());
        // adds listener to combo box for any user interactivity
        teamCombo.addActionListener(new SelectTeamControl());
       
       
        /**
         * below the comboBox is added and the previous
         * label is commented out
         */
        this.add(teamCombo);
       this.add(TeamLabel);
        this.add(resultLabel);
       
    }
     /**
      * sets the text value of the label for displaying average attendance
      * @param Teamresult 
      */
    
    public void setResult(String Teamresult){
        this.resultLabel.setText(Teamresult);
    }
    

//    public void setTeam(String teamDetails) {
//        this.TeamLabel.setText(teamDetails);
//    }
    

public String getResult(){
    return resultLabel.getText();
//}   
//public String getTeam(){
//    return TeamLabel.getText();
//}
  
}
}

