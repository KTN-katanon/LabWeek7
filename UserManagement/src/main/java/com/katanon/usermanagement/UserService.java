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

    static {
        User admin = new User(1, "admin", "Administrator", "pass@1234", 'M', 'A');
        User user1 = new User(2, "user1", "User 1", "pass@1234", 'F', 'U');
        User user2 = new User(3, "user2", "User 2", "pass@1234", 'M', 'U');
        addUser(admin);
        addUser(user1);
        addUser(user2);
    }

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
        for (User u : userList) {
            if (u.getId() == id) {
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
