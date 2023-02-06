package com.example.demo.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="persons")
public class Person {

@Id
    public String id;
    public String firstName;
    public  String lastName;
    public int age;
    public String city;

}
