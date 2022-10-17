package com.spring.crud.mongo.springCrudMongo.repository;

import com.spring.crud.mongo.springCrudMongo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserMongoTemplateRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    //
    public List<User> findUserByField(String id, String name, int age, String privileges,
                               Pageable pageable){
        final Query query = new Query().with(pageable);

        query.fields().include("id").include("name");
        final List<Criteria> criteria = new ArrayList<>();

        if(name!=null && !name.isEmpty()){
            criteria.add(Criteria.where("name").is(name));
        }

        if(id!=null && !id.isEmpty()){
            criteria.add(Criteria.where("id").is(id));
        }

        if(age!=0){
            criteria.add(Criteria.where("age").is(age));
        }

        if(privileges!=null && !privileges.isEmpty()){
            criteria.add(Criteria.where("privileges").is(privileges));
        }

        if(!criteria.isEmpty()) query.addCriteria(new Criteria()
                        .andOperator(criteria.toArray(new Criteria[criteria.size()])));

        return mongoTemplate.find(query,User.class);

    }

    // query 1 : findByName
//    public List<User> findByName(String name, Pageable pageable){
//        final Query query = new Query().with(pageable);
//
//
//    }




}