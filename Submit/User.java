/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

/**
 *
 * @author MyPC
 */
import java.io.Serializable;
public class User implements Serializable{
    String email;
    String firstName;
    String lastName;
    String birthday;
    String way;
    String[] announcements;
    String contact;
    
    
    public User(){
        email = "";
        firstName = "";
        lastName = "";
        birthday = "";
        way = "";
        announcements = new String[]{};
        contact = "";
    }
    
    public User(String email,String firstName,String lastName,String birthday,String way,String[] announcements,String contact){
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.way = way;
        this.announcements = announcements;
        this.contact = contact;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    
    public String getBirthday(){
        return birthday;
    }
    
    public void setBirthday (String birthday){
        this.birthday = birthday;
    }
    
    public String getWay(){
        return way;
    }
    
    public void setWay (String way){
        this.way = way;
    }
    
     public String[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String[] announcements) {
        this.announcements = announcements;
    }
    
    public String getContact(){
        return contact;
    }
    
    public void setContact (String contact){
        this.contact = contact;
    }
}



