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
public interface Subject {
	
	public void attach(User follower);
       
	
	public void detach(Observer observer);
        
	
	public void notifyObservers(String tweet); 
        
        
}