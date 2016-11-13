/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author admin
 */
public class User extends Observable implements Observer, TreeItem {

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

    public void follow(String user) {
        following.add(user);
    }

    public void tweet(String message) {
        messages.add(message);
        setChanged();
        notifyObservers(message);
        newsFeed.add(0, "- " + uniqueID + ": " + message);
        setChanged();
        notifyObservers(newsFeed);
        for (String word : positiveWords) {
            if (message.toLowerCase().contains(word)) {
                positiveCount++;
            }
        }
        messageCount++;
    }

    public int getMessageCount() {
        return messageCount;
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

    public void attach(User user) {
        followers.add(user);
    }

    public List<String> getNewsFeed() {
        return newsFeed;
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

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            newsFeed.add("[" + ((User) o).getID() + "] - " + (String) arg);
        }
    }
    
    public void  updateNewsFeed(String msg) {
		newsFeed.add(msg);
	}
}
