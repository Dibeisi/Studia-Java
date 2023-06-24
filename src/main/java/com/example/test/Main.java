package com.example.test;

import com.example.model.Person;
import com.example.service.PersonService;

/**
 * Klasa służąca do testowania funkcjonalności powyższych klas.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);
        PersonService personService = new PersonService();
        personService.processPerson(person);
    }
}