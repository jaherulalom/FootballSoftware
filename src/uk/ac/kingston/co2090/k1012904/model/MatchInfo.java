/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.co2090.k1012904.model;

import uk.ac.kingston.co2090.k1012904.model.control.Utils.Convertors;

/**
 *
 * @author k1012904
 *//*
public class MatchInfo {

    private String TeamName;
    private String Result;
    private String Date;
    private String Opponent;
    private int Attendance;

    public MatchInfo(String csvString) {
        String[] attributes = Convertors.getStringAsArray(csvString, ",");
        for (int i = 0; i < attributes.length; i++) {
            String value = attributes[i];
            switch (i) {
                case 0:
                    this.setTeamName(value);
                    break;
                case 1:
                    this.setResult(value);
                    break;
                case 2:
                    this.setDate(value);
                    break;
                case 3:
                    this.setOpponent(value);
                    break;
                case 4:
                    this.setAttendance(Integer.parseInt(value));
                    break;
            }
        }
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String TeamName) {
        this.TeamName = TeamName;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getOpponent() {
        return Opponent;
    }

    public void setOpponent(String Opponent) {
        this.Opponent = Opponent;

    }

    public Integer getAttendance() {
        return Attendance;
    }

    public void setAttendance(Integer Attendance) {
        this.Attendance = Attendance;
    }

    @Override
    public String toString() {
        return TeamName + "\t" + Result + "\t"
                + Date + "\t" + Opponent + "\t"
                + Attendance + "\n";
    }
}*/