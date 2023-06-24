package com.example.service;

import com.example.model.Person;

/**
 * Odpowiada za logikę związaną z osobami.
 */
public class PersonService {
    public void processPerson(Person person) {
        // Logika przetwarzania osoby
        System.out.println("Przetwarzanie osoby: " + person.getName());
        System.out.println("Wiek: " + person.getAge());
    }
}