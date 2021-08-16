/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAccount.UserDirectory;

/**
 *
 * @author Syuu
 */
public class Date {
    
    private String year;
    private String month;
    private String day;

    public Date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    
    public boolean sameDay(Date day1, Date day2){
        if(day1.getYear() == day2.getYear()&&day1.getMonth() == day2.getMonth()&&day1.getDay() == day2.getDay()){
            return true;
        }else{
            return false;
        }
    }
    
}
