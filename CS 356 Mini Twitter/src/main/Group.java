/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author admin
 */
public class Group implements TreeItem {
    
    private String uniqueID;
    private List<User> users = new ArrayList();
    private static DefaultMutableTreeNode root;
    private int totalGroups = 0;
    
    public Group() {
        root = new DefaultMutableTreeNode("Root");
        totalGroups++;
    }
    
    public Group(String uniqueID) {
        this.uniqueID = uniqueID;
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

    public int getTotalGroups() {
        return totalGroups;
    }
    
    public DefaultMutableTreeNode getRoot() {
        return root;
    }
}
