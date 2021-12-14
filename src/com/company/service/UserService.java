package com.company.service;

import com.company.model.User;

import java.util.List;

public interface UserService {


    void addUser(List<User>users,User user);

    void findWithId(List<User>users,int id);

    void deleteWithId(List<User>users,int id);

    void getUsers(List<User>users);
}
