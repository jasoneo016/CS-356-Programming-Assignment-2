/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author admin
 */
public abstract class TreeItem extends DefaultMutableTreeNode {
    
        private String uniqueID;

        public String getID() {
        return uniqueID;
    }
   
}
