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
public class UserGroup implements TreeItem {
    
    private String uniqueID;
    private List<User> users;
    private int totalGroups = 0;
    
    public UserGroup() {
        users = new ArrayList();
        totalGroups++;
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

    public int getTotalGroups() {
        return 1;
    }
}
