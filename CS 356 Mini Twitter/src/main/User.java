/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author admin
 */
public class User implements TreeItem, Observer  {

    private String uniqueID;
    private List<String> following;
    private List<String> messages;
    private List<String> newsFeed;
    private List<User> followers;
    private boolean someProperty;

    private int totalUsers = 0;
    private int positiveCount = 0;
    private int messageCount = 0;
    private String[] positiveWords = {"good", "great", "excellent", "dope", "fam",
        "brackin", "dench", "chill", "hella", "lit"};

    public User(String uniqueID) {
        this(uniqueID, false);
        followers = new ArrayList();
        following = new ArrayList();
        messages = new ArrayList();
        newsFeed = new ArrayList();
        totalUsers++;
    }

    public User(String uniqueID, boolean property) {
        this.uniqueID = uniqueID;
        this.someProperty = property;
        followers = new ArrayList();
        following = new ArrayList();
        messages = new ArrayList();
        newsFeed = new ArrayList();
        totalUsers++;
    }

    public void follow(String uniqueID) {
        following.add(uniqueID);
    }

    public void tweet(String message) {
        messages.add(message);
        newsFeed.add(0, "- " + uniqueID + ": " + message);
        for (String word : positiveWords) {
            if (message.toLowerCase().contains(word)) {
                positiveCount++;
            }
        }
        messageCount++;
    }
    
    public List<User> getObserver() {
        return followers;
    }

    public List<String> getMessages() {
        return messages;
    }

    public List<String> getFollowing() {
        return following;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public int getPositiveCount() {
        return positiveCount;
    }

    @Override
    public void attach(User user) {
        followers.add(user);
    }

    @Override
    public void detach(Observer observer) {
        followers.remove(observer);
    }

    @Override
    public void notifyObservers(String newUpdate) {
        for (Observer ob : followers) {
            ob.update(this, newUpdate);
        }
    }

    public List<String> getNewsFeed() {
        return newsFeed;
    }

    @Override
    public void update(User user1, String newUpdate) {
        newsFeed.add(0, "- " + user1.getID() + ": " + newUpdate);
    }

    @Override
    public String getID() {
        return uniqueID;
    }

    @Override
    public boolean isSomeProperty() {
        return someProperty;
    }

    @Override
    public String toString() {
        return uniqueID;
    }
}
