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

    public static User addUser(User newUser) {
        newUser.setId(lastId++);
        userList.add(newUser);
        return newUser;
    }

    public static ArrayList<User> getUsers() {
        return userList;
    }

    public static User getUser(int index) {
        return userList.get(index);
    }

    public static User getUserById(int id) {
        for(User u: userList){
            if(u.getId() == id){
                return u;
            } 
        }
        return null;
    }

    public static int getSize() {
        return userList.size();
    }

    public static User updateUser(int index, User user) {
        userList.set(index, user);
        return user;
    }

    public static User deleteUser(int index) {
        return userList.remove(index);

    }

    public static void printList() {
        ArrayList<User> list = UserService.getUsers();
        for (User u : list) {
            System.out.println(u);
        }
    }
}
