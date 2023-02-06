package com.example.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.models.Person;

import java.util.List;

public interface PersonRepository extends MongoRepository<Person,String> {


    List<Person> findByAge(int age);
}
