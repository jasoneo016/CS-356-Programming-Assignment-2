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
public class Group extends TreeItem {
    
    private String uniqueID;
    private List<User> users = new ArrayList();
    private int totalGroups = 0;
    private Group root = new Group("Root");
    
    public Group(String uniqueID) {
        this.uniqueID = uniqueID;
        totalGroups++;
    }

    public int getTotalGroups() {
        return totalGroups;
    }
    
    public Group getRoot() {
        return root;
    }
}
