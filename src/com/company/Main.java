package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<User>userList=new ArrayList<>(Arrays.asList(
                new User(1,"User1",18,'M'),
                new User(2,"User2",19,'F'),
                new User(3,"User3",20,'M')));

        UserDao userDao=new UserDao(userList);
        UserService userService=new UserServiceImpl(userDao);
        userService.findWithId(userList,1);
        System.out.println("-------------------------------");
        userService.getUsers(userList);
        System.out.println("-------------------------------");
        userService.deleteWithId(userList, 2);
        System.out.println(userList);
        userService.addUser(userList,new User(4,"User4",20,'M'));
        System.out.println(userList);

    }
}
