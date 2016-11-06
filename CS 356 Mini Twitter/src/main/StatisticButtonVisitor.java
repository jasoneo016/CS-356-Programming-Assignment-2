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
public class StatisticButtonVisitor implements ButtonVisitor {

    private int totalUsers = 0;
    private int totalMessages = 0;
    private int totalGroups = 0;
    private double positivePercentage;
    
    @Override
    public void visitUserTotal(User user) {
        setTotalUsers(getTotalUsers() + 1);
    }

    @Override
    public void visitMessagesTotal(User user) {
        setMessagesTotal(user);
    }

    @Override
    public void visitGroupTotal(UserGroup ug) {
        setTotalGroups(ug);
    }

    @Override
    public void visitPositivePercentage(User user) {
        List<String> tweets = user.getMessages();
    }
    
    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    
    public int getTotalUsers() {
        return totalUsers;
    }
    
    public void setMessagesTotal(User user) {
        this.totalMessages = user.getMessages().size();
    }
    
    public void setTotalGroups(UserGroup ug) {
        this.totalGroups = ug.getTotalGroups();
    }
    
    public double getPositivePercentage() {
        return positivePercentage;
    }
}
