package com.example.springsecuritytest.controller;

import lombok.Data;

@Data
public class Car {

    private String name;

    public Car(String name) {
        this.name = name;
    }
}
