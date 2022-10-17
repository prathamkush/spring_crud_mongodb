package com.spring.crud.mongo.springCrudMongo.controller;

import com.spring.crud.mongo.springCrudMongo.model.User;
import com.spring.crud.mongo.springCrudMongo.service.UserMongoTemplateServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Map;

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

    @PostMapping("/findByName")
    public ResponseEntity<?> findByName(@RequestBody Map<String,Object> obj) {
        return ResponseEntity.ok().body(mongoTemplateServiceImplementation.findByName(obj.get("name").toString()));
    }

    @GetMapping("/query2")
    public ResponseEntity<?> query2() {
        return ResponseEntity.ok().body(mongoTemplateServiceImplementation.query2());
    }

    @GetMapping("/query3")
    public ResponseEntity<?> query3(){
        return ResponseEntity.ok().body(mongoTemplateServiceImplementation.query3());
    }

    @GetMapping("/query4")
    public ResponseEntity<?> query4(){
        return ResponseEntity.ok().body(mongoTemplateServiceImplementation.query4());
    }
}
