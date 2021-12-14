package com.company.model;

public class User {
    private int id;
    private String name;
    private int age;
    private char gender;

    public User(int id, String name, int age, char gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

       public String getName() {
        return name;
    }

      public int getAge() {
        return age;
    }

       public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
