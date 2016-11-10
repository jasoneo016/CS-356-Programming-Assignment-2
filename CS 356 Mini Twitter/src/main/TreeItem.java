/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;

/**
 *
 * @author admin
 */
public class TreeItem  {
    
    private String uniqueID;
    private List<TreeItem> treeItems;
    protected static TreeItem instance;
    boolean allowsChildren;
    protected Object userObject;

    public TreeItem() {
        this(null, true);
    }
    
    public TreeItem(Object userObject)
    {
      this(userObject, true);
    }
    
    public TreeItem(Object userObject, boolean allowsChildren)
    {
      this.userObject = userObject;
      this.allowsChildren = allowsChildren;
    }

    public static TreeItem getInstance() {
        if (instance == null) {
            synchronized(TreeItem.class) {
                if (instance == null) {
                    instance = new TreeItem();
                }
            }
        }
        return instance;
    }
        
    public String getID() {
        return uniqueID;
    }
    

    public List<TreeItem> getTreeItems() {
        return treeItems;
    }
   
}
