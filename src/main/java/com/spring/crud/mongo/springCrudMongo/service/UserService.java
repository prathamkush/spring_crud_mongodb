package com.spring.crud.mongo.springCrudMongo.service;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {

    List<User> findByName(String name);

    List<User> findAllUsers();

    int countAllUsers();

    User saveUser(User user);

    void saveAllUsers(List<User> users);

    void deleteUserById(String id);

    void deleteAllUsers();

    User getByIdQuery(String id);

    List<User> getAndQuery(String privileges, String name);

    Integer countQuery(String privileges);

    List<User> sortQuery(String privileges);

    List<User> regexQuery();
}
