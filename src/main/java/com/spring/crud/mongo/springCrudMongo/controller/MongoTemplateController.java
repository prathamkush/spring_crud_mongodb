package com.spring.crud.mongo.springCrudMongo.controller;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.service.UserMongoTemplateServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mongotemplate")
public class MongoTemplateController {

    @Autowired
    UserMongoTemplateServiceImplementation mongoTemplateServiceImplementation;


    @GetMapping("/getByFields")
    public ResponseEntity<?> findUserByField(@RequestParam(required = false) String id,
                                             @RequestParam(required = false) String name,
                                             @RequestParam(required = false) int age,
                                             @RequestParam(required = false) String privileges,
                                             @RequestParam int page) {

        return ResponseEntity.ok().body(mongoTemplateServiceImplementation.findUserByField(id,name,age,privileges,page));
    }
}
