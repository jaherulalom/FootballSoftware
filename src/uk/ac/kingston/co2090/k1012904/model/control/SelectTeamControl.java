/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import uk.ac.kingston.co2090.k1012904.model.ApplicationModel;
import uk.ac.kingston.co2090.k1012904.model.Team;
import uk.ac.kingston.co2090.k1012904.model.Viewer.SelectTeamPanel;

/**
 *This class implements the interface MouseListener and ActionListener
 * The listener interface for receiving mouse events
 * @author k1012904
 */
public class SelectTeamControl implements MouseListener, ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {  //when a mouse event occurs the relevant method in the listener object is invoked and the ActionEvent is passed to do it
          JComboBox clicked = (JComboBox) e.getSource();
          Team selected = (Team)clicked.getSelectedItem ();
          
        String teamDetails, Teamresult;
        SelectTeamPanel stp = (SelectTeamPanel)clicked.getParent();
        teamDetails = selected.getName();
        if (teamDetails != null) {
            Teamresult = String.valueOf(ApplicationModel.getTeamAvAttendence(teamDetails));
        //    stp.setTeam(teamDetails);
            stp.setResult(Teamresult);
        }
    }
 
    
    @Override //Indicates that a method declaration is intended to override a method declaration in a superclass.
    public void mouseClicked(MouseEvent me) { //When a mouse event occurs, the relevant method in the listener object is invoked, and the MouseEvent is passed to it. 

        JLabel clicked = (JLabel) me.getSource();
        String teamDetails, Teamresult;
        SelectTeamPanel stp = (SelectTeamPanel)clicked.getParent();
        teamDetails = JOptionPane.showInputDialog("Enter Team Name");
        if (teamDetails != null) {
            Teamresult = String.valueOf(ApplicationModel.getTeamAvAttendence(teamDetails));
      //      stp.setTeam(teamDetails);
            stp.setResult(Teamresult);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
