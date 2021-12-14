package com.company.dao;

import com.company.model.User;

import java.util.List;


public class UserDao {
  private List<User>users;

    public UserDao(List<User> userList) {
        this.users = userList;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
