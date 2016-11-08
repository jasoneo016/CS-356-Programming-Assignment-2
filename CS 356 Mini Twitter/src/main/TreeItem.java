/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author admin
 */
public class TreeItem extends DefaultMutableTreeNode {
    
    private String uniqueID;
    private List<TreeItem> treeItems;
    protected static TreeItem instance;
    private Group root = new Group("Root");
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
    
    public DefaultTreeModel getTreeModel() {
        return getTree(root);
    }
        
    public DefaultTreeModel getTree(Group group) {
        configureTree(root, group.getTreeItems());
        return new DefaultTreeModel(root);
    }
        
    public void configureTree(TreeItem parentItem, List<TreeItem> items) {
        for (TreeItem treeItem: items) {
            TreeItem item = new TreeItem(treeItem.getID());
            parentItem.add(item);
            
            if (treeItem instanceof Group) {
                configureTree(item, treeItem.getTreeItems());
            }
        }
    }
    
    public List<TreeItem> getTreeItems() {
        return treeItems;
    }
   
}
