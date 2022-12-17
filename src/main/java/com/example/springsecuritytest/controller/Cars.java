package com.example.springsecuritytest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Cars {

    List<Car> list = new ArrayList<>();

    @GetMapping(("api/v1/cars"))
    public List<Car> listAll() {
        return list;
    }


    @PostMapping(("api/v1/cars"))
    public void save(String name){
        list.add(new Car(name));
    }

    @GetMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

}

