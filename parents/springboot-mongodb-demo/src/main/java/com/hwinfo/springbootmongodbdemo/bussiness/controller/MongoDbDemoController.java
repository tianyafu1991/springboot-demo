package com.hwinfo.springbootmongodbdemo.bussiness.controller;

import com.mongodb.DB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mongo")
public class MongoDbDemoController {


    @Autowired
    private MongoDbFactory mongoDbFactory;


    @RequestMapping(value = "/testMongoDbConnection")
    public void testMongoDbConnection(){
        DB db = mongoDbFactory.getDb();
        System.out.println(db.collectionExists("member"));
        System.out.println(db.collectionExists("m_member"));
    }
}
