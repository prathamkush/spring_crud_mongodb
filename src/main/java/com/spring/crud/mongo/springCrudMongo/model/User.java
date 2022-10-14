package com.spring.crud.mongo.springCrudMongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

// using for database related mapping
@Document(collection = "user")
public class User {

    @Id
    private String id;
    private String name;
    private int age;
    private List<Integer> finished;
    private List<String> badges;

    public User(){

    }

    public User(String id, String name, int age, List<Integer> finished, List<String> badges) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.finished = finished;
        this.badges = badges;
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
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", finished=" + finished +
                ", badges=" + badges +
                '}';
    }
}
