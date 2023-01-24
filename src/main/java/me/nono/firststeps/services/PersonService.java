package me.nono.firststeps.services;

import me.nono.firststeps.models.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person create(Person person) {

        logger.info("Creating one person!");
        return  person;
    }

    public Person update(Person person) {

        logger.info("Updating one person!");
        return  person;
    }

    public void delete(String id) {
        logger.info("Deleting one person!");
    }

    public List<Person> findAll() {

        logger.info("Finding all users!");

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.getAndIncrement());
        person.setFirstName("Person name " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Some address in Brasil " + i);
        person.setGender("Male");
        return person;
    }

    public Person findByID(String id) {

        logger.info("Finding One person. ");
        Person person = new Person();
        person.setId(counter.getAndIncrement());
        person.setFirstName("Guilherme");
        person.setLastName("Nono");
        person.setGender("Male");
        person.setAddress("Igaraçu do Tietê - SP - Brasil");

        return person;
    }

}
