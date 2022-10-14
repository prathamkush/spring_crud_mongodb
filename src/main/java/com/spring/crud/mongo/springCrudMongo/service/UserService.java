package com.spring.crud.mongo.springCrudMongo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.repository.UserRepository;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

@Service
public class UserService {

    private UserRepository userRepo;
    private User user;

    @Autowired
    public UserService(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    public UserService(){}

    public String saveUser(User user, HttpServletResponse response) throws JsonProcessingException {

    }



}
