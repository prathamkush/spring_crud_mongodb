package com.spring.crud.mongo.springCrudMongo.repository;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserQueryRepository extends MongoRepository<User, String> {


}
