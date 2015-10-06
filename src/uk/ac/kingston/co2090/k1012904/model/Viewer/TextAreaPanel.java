 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.Viewer;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *a viewer container to display application model data
 * this will be team data or match data
 * to display data it will need to be in a formatted string
 * the JPanel is to add to other containers on the application viewer
 * @author k1012904
 */
public class TextAreaPanel extends JPanel{
   
   private JTextArea dataTable = new JTextArea();
  
   /**
    * Parameterised constructor created using a formatted String
    * derived from an ArrayList in the application model
    * 
    * methods teamListToString written to provide this formatted data
    * @param data 
    */
    public TextAreaPanel(String data){
        this.setLayout(new BorderLayout());
        this.setDataTable(data);
        this.add(new JScrollPane(dataTable));
    }

    private void setDataTable(String data) {
     dataTable.setText(data);
    }
   
}
