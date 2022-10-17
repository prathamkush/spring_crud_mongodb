package com.spring.crud.mongo.springCrudMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

// using for database related mapping
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private String privileges;
    private List<Integer> finished;
    private List<String> badges;


    // phone


    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    public List<Integer> getFinished() {
        return finished;
    }

    public void setFinished(List<Integer> finished) {
        this.finished = finished;
    }

    public List<String> getBadges() {
        return badges;
    }

    public void setBadges(List<String> badges) {
        this.badges = badges;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", privileges='" + privileges + '\'' +
                ", finished=" + finished +
                ", badges=" + badges +
                '}';
    }
}
