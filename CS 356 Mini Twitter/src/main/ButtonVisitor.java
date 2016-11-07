/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author admin
 */
public interface ButtonVisitor {
    
    public void visitUserTotal(User user);

    public void visitMessagesTotal(User user);
    
    public void visitGroupTotal(Group group);
    
    public void visitPositivePercentage(User user);

}
