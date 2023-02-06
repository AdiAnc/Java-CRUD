package com.example.demo.services;


import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServices {
@Autowired
    private PersonRepository repository;

public List<Person> getAllPersons()
{
    return repository.findAll();
}

public Optional<Person> getPerson(String id)
{
    return repository.findById(id);
}

public Person addPerson(Person per)
{
    return repository.save(per);
}

public Person updatePerson(Person per)
{
    return  repository.save(per);
}
public void deletePerson(String id)
{
    repository.deleteById(id);
}

public  List<Person> getAllPersonByAge(int age)
{
    return repository.findByAge(age);
}
}
