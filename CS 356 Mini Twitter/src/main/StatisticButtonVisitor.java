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
public class StatisticButtonVisitor implements ButtonVisitor {

    private int totalUsers = 0;
    private int totalMessages = 0;
    private int totalGroups = 0;
    private double positivePercentage = 0.0;
    private int positiveCount = 0;
    
    @Override
    public void visitUserTotal(User user) {
        setTotalUsers(user.getTotalUsers());
    }

    @Override
    public void visitMessagesTotal(User user) {
        setMessagesTotal(user);
    }

    @Override
    public void visitGroupTotal(Group group) {
        setTotalGroups(group);
    }

    @Override
    public void visitPositivePercentage(User user) {
        List<User> users = new ArrayList();
        List<String> tweets = user.getMessages();
    }
    
    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    
    public void setMessagesTotal(User user) {
        this.totalMessages = user.getMessages().size();
    }
    
    public void setTotalGroups(Group group) {
        this.totalGroups = group.getTotalGroups();
    }
    
    public double getPositivePercentage() {
        return ((positiveCount / totalMessages) * 100.0);
    }
    
    public void setPositivePercentage(double percentage) {
        this.positivePercentage = 0.0;
    }
}
