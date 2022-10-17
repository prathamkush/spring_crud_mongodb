package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserMongoTemplateService {

    List<User> findUserByField(String id, String name, int age, String privilege, int page);
}
