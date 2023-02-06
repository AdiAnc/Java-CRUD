package com.example.demo.controllers;


import com.example.demo.models.Person;
import com.example.demo.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServices services;

    @GetMapping
    public List<Person> getAllPersons()
    {
        return services.getAllPersons();
    }
    @GetMapping({"/{id}"})
    public Optional<Person> getPerson(@PathVariable(value = "id") String perid)
    {
        return services.getPerson(perid);
    }
    @PostMapping
    public Person createPerson(@RequestBody Person newPer)
    {
        return services.addPerson(newPer);
    }
    @PutMapping({"/{id}"})
    public Person updatePerson(@PathVariable(value = "id") String perid, @RequestBody Person per)
    {
        return services.updatePerson(per);
    }

    @DeleteMapping({"/{id}"})
    public String deletePerson(@PathVariable(value="id") String id)
    {
        services.deletePerson(id);
        return "Deleted!!";
    }

    @GetMapping({"/age/{age}"})
    public List <Person> getPersonByAge(@PathVariable(value = "age") int age)

    {
        return services.getAllPersonByAge(age);
    }



}
