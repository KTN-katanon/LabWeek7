/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katanon.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author nonku
 */
public class UserService {
    private static ArrayList<User> userList = new ArrayList<>();
    private static int lastId = 1;
    
    public static User addUser(User newUser){
        newUser.setId(lastId++);
        userList.add(newUser);
        return newUser;
    }

    public static ArrayList<User> getUsers() {
        return userList;
    }
    
    public static void printList() {
        ArrayList<User> list = UserService.getUsers();
        for(User u :list){
            System.out.println(u);
        }
    }
}
