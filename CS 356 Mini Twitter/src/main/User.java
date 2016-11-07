/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public abstract class User implements TreeItem{
    
     private String uniqueID;
     private List<String> followers;
     private List<String> following;
     private List<String> messages;
     private int totalUsers = 0;
     
     public User(String uniqueID) {
         this.uniqueID = uniqueID;
         followers = new ArrayList();
         following = new ArrayList();
         messages  = new ArrayList();
         totalUsers++;
     }
     
     @Override
     public String getID() {
         return uniqueID;
     } 
     
     @Override
     public void setID(String uniqueID) {
         this.uniqueID = uniqueID;
     }

    @Override
    public void add() {
    }
    
    public void follow() {
        
    }
    
    public void tweet(String message) {
        messages.add(message);
    }
    
    public List<String> getMessages() {
        return messages;
    }
     
    public int getTotalUsers() {
        return totalUsers;
    }
    
}