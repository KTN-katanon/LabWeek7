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
public class TestUser {
    public static void main(String[] args) {
        User admin = new User(1,"admin","Administrator","pass@1234",'M','A');
        User user1 = new User(2,"user1","User 1","pass@1234",'F','U');
        User user2 = new User(3,"user2","User 2","pass@1234",'M','U');
        ArrayList<User> userList = new ArrayList<User>(); // Generic type
        userList.add(admin);
        userList.add(user1);
        userList.add(user2);
        for(int i =0; i < userList.size();i++){
            System.out.println(userList.get(i));
        }
        userList.remove(0);
        userList.set(0, admin);
        for(User u :userList){
            System.out.println(u);
        }
        
        UserService.addUser(admin);
        UserService.addUser(user1);
        UserService.addUser(user2);
        System.out.println("****************");
        UserService.printList();
        
        System.out.println(UserService.getUserById(3));
        UserService.deleteUser(1);
        UserService.printList();
    }
}
