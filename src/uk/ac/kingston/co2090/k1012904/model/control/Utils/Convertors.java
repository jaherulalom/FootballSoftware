/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model.control.Utils;

/**
 *
 * @author k1012904
 */
public class Convertors {
     public static String[] getStringAsArray(String t) //The getStringArray() method returns the string array value of the variable
    {        
        return getStringAsArray(t," ");  //The method returns the string array value of the variable
    }
     
       public static String[] getStringAsArray(String t, String sep)
    {
        String[] result = t.split(sep);
        return result;
    }
     
}
