package com.company.service.impl;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService  {

    UserDao userDao;

    public UserServiceImpl(UserDao usersDao) {
        this.userDao = usersDao;
    }

    @Override
    public void addUser(List<User> users, User user) {
        users.add(user);
    }

    @Override
    public void findWithId(List<User> users, int id) {
        for (User user:users) {
            if(user.getId()==id){
                System.out.println(user);
            }
        }
    }

    @Override
    public void deleteWithId(List<User> users, int id) {
        for (User user:users) {
            if(user.getId()==id){
                users.remove(user);
            }
        }
    }

    @Override
    public void getUsers(List<User> users) {
        for (User user:users) {
            System.out.println(user);
        }
    }
}

