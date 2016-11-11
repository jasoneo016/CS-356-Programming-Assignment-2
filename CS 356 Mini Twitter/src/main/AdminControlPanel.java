/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author admin
 */
public class AdminControlPanel extends javax.swing.JFrame {

    protected static AdminControlPanel instance;

    private ArrayList<TreeItem> users;
    private ArrayList<TreeItem> groups;

    public ArrayList<String> uniqueUserIDs;
    public ArrayList<String> uniqueGroupIDs;
    
    private String selectedUser;

    Group group = new Group();
    private DefaultMutableTreeNode root = new DefaultMutableTreeNode(group.getRoot());
    private DefaultTreeModel model = new DefaultTreeModel(root);

    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
        uniqueUserIDs = new ArrayList();
        uniqueGroupIDs = new ArrayList();
        users = new ArrayList();
        groups = new ArrayList();
        uniqueGroupIDs.add("Root");
        groups.add(new Group("Root"));
        initComponents();
    }

    public static AdminControlPanel getInstance() {
        if (instance == null) {
            synchronized (AdminControlPanel.class) {
                if (instance == null) {
                    instance = new AdminControlPanel();
                }
            }
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTreeView = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane(groupIDTextArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        groupIDTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane(userIDTextArea, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        userIDTextArea = new javax.swing.JTextArea();
        addUserButton = new javax.swing.JButton();
        addGroupButton = new javax.swing.JButton();
        openUserViewButton = new javax.swing.JButton();
        showUserTotalButton = new javax.swing.JButton();
        showMessagesTotalButton = new javax.swing.JButton();
        showGroupTotalButton = new javax.swing.JButton();
        showPositivePercentageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTreeView.setModel(model);
        jTreeView.setCellRenderer(new MyTreeCellRenderer());
        jScrollPane1.setViewportView(jTreeView);

        groupIDTextArea.setColumns(20);
        groupIDTextArea.setLineWrap(true);
        groupIDTextArea.setRows(5);
        groupIDTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(groupIDTextArea);

        userIDTextArea.setColumns(20);
        userIDTextArea.setLineWrap(true);
        userIDTextArea.setRows(5);
        jScrollPane3.setViewportView(userIDTextArea);

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        addGroupButton.setText("Add Group");
        addGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupButtonActionPerformed(evt);
            }
        });

        openUserViewButton.setText("Open User View");
        openUserViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewButtonActionPerformed(evt);
            }
        });

        showUserTotalButton.setText("Show User Total");
        showUserTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserTotalButtonActionPerformed(evt);
            }
        });

        showMessagesTotalButton.setText("Show Messages Total");
        showMessagesTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesTotalButtonActionPerformed(evt);
            }
        });

        showGroupTotalButton.setText("Show Group Total");
        showGroupTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupTotalButtonActionPerformed(evt);
            }
        });

        showPositivePercentageButton.setText("Show Positive Percentage");
        showPositivePercentageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPositivePercentageButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(openUserViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showUserTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showMessagesTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showGroupTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(showPositivePercentageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openUserViewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showUserTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showGroupTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessagesTotalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPositivePercentageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        if (userIDTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please type a user to add.", "Add User Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!uniqueUserIDs.contains(userIDTextArea.getText())) {
                if (jTreeView.getSelectionPath() == null) {
                    User user = new User(userIDTextArea.getText());
                    DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);
                    users.add(user);
                    uniqueUserIDs.add(userIDTextArea.getText());
                    root.add(userNode);
                } else {
                    DefaultMutableTreeNode selectedElement = (DefaultMutableTreeNode) jTreeView.getSelectionPath().getLastPathComponent();
                    if (selectedElement == root) {
                        User user = new User(userIDTextArea.getText());
                        DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);
                        users.add(user);
                        uniqueUserIDs.add(userIDTextArea.getText());
                        root.add(userNode);
                    } else if (selectedElement.getUserObject() instanceof Group) {
                        User user = new User(userIDTextArea.getText());
                        DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);
                        users.add(user);
                        uniqueUserIDs.add(userIDTextArea.getText());
                        selectedElement.add(userNode);
                    } else if (selectedElement.getUserObject() instanceof User) {
                        User user = new User(userIDTextArea.getText());
                        DefaultMutableTreeNode userNode = new DefaultMutableTreeNode(user, false);
                        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectedElement.getParent();
                        users.add(user);
                        uniqueUserIDs.add(userIDTextArea.getText());
                        parentNode.add(userNode);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "This user already exists.", "Add User Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        model.reload(root);
        expandAllNodes(jTreeView, 0, jTreeView.getRowCount());
        userIDTextArea.setText("");
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupButtonActionPerformed
        if (groupIDTextArea.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please type a group to add.", "Add Group Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!uniqueGroupIDs.contains(groupIDTextArea.getText())) {
                if (jTreeView.getSelectionPath() == null) {
                    group = new Group(groupIDTextArea.getText());
                    DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group);
                    groups.add(group);
                    uniqueGroupIDs.add(groupIDTextArea.getText());
                    root.add(groupNode);
                } else {
                    DefaultMutableTreeNode selectedElement = (DefaultMutableTreeNode) jTreeView.getSelectionPath().getLastPathComponent();
                    if (selectedElement == root) {
                        group = new Group(groupIDTextArea.getText());
                        DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group);
                        groups.add(group);
                        uniqueGroupIDs.add(groupIDTextArea.getText());
                        root.add(groupNode);
                    } else if (uniqueGroupIDs.contains(selectedElement.getUserObject().toString())) {
                        group = new Group(groupIDTextArea.getText());
                        DefaultMutableTreeNode groupNode = new DefaultMutableTreeNode(group);
                        groups.add(group);
                        uniqueGroupIDs.add(groupIDTextArea.getText());
                        selectedElement.add(groupNode);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "This group already exists.", "Add Group Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        model.reload(root);
        expandAllNodes(jTreeView, 0, jTreeView.getRowCount());
        groupIDTextArea.setText("");
    }//GEN-LAST:event_addGroupButtonActionPerformed

    private void openUserViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewButtonActionPerformed
        if (jTreeView.getSelectionPath() == null) {
            JOptionPane.showMessageDialog(null, "Please select a user to view.", "User View Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            DefaultMutableTreeNode selectedElement = (DefaultMutableTreeNode) jTreeView.getSelectionPath().getLastPathComponent();
            if (selectedElement.getUserObject() instanceof Group || selectedElement.getUserObject().toString().equals("Root")) {
                JOptionPane.showMessageDialog(null, "Please select a user to view.", "User View Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedElement.getUserObject() instanceof User) {
                selectedUser = selectedElement.getUserObject().toString();
                User user = new User(selectedUser);
                UserView userView = new UserView(user, uniqueUserIDs);
                userView.setVisible(true);
                userView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        }
    }//GEN-LAST:event_openUserViewButtonActionPerformed

    private void showUserTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserTotalButtonActionPerformed
        JOptionPane.showMessageDialog(null, "Show User Total", "Show User Error", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_showUserTotalButtonActionPerformed

    private void showGroupTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupTotalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showGroupTotalButtonActionPerformed

    private void showMessagesTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesTotalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMessagesTotalButtonActionPerformed

    private void showPositivePercentageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPositivePercentageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPositivePercentageButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGroupButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextArea groupIDTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTreeView;
    private javax.swing.JButton openUserViewButton;
    private javax.swing.JButton showGroupTotalButton;
    private javax.swing.JButton showMessagesTotalButton;
    private javax.swing.JButton showPositivePercentageButton;
    private javax.swing.JButton showUserTotalButton;
    private javax.swing.JTextArea userIDTextArea;
    // End of variables declaration//GEN-END:variables
    
    public ArrayList<String> getUniqueIDs() {
        return uniqueUserIDs;
    }
    
    private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
    }

    private static class MyTreeCellRenderer extends DefaultTreeCellRenderer {

        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

            // decide what icons you want by examining the node
            if (value instanceof DefaultMutableTreeNode) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                if (node.getUserObject().toString() == "Root") {
                    // your root node, since you just put a String as a user obj                    
                    setIcon(UIManager.getIcon("FileView.computerIcon"));
                } else if (node.getUserObject() instanceof Group) {
                    // decide based on some property of your Contact obj
                    Group groupObject = (Group) node.getUserObject();
                    if (groupObject.isSomeProperty()) {
                        setIcon(UIManager.getIcon("FileChooser.homeFolderIcon"));
                    } else {
                        setIcon(UIManager.getIcon("FileChooser.hardDriveIcon"));
                    }
                }
            }

            return this;
        }

    }
}
