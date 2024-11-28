package com.example.aplikacjeinternetowe;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private List<Person> persons = new ArrayList<>();

    @PostConstruct
    public void init() {
        Person person1 = new Person();
        person1.setFirstName("Jan");
        person1.setFamilyName("Kowalski");
        persons.add(person1);

        Person person2 = new Person();
        person2.setFirstName("Anna");
        person2.setFamilyName("Nowak");
        persons.add(person2);
    }

    public List<Person> getPeople() {
        return persons;
    }

    public Person getPerson(int index) {
        if (index >= 0 && index < persons.size()) {
            return persons.get(index);
        }
        return null;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void setPerson(int index, Person person) {
        if (index >= 0 && index < persons.size()) {
            persons.set(index, person);
        }
    }

    public void removePerson(int index) {
        if (index >= 0 && index < persons.size()) {
            persons.remove(index);
        }
    }
}
