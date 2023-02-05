package me.nono.firststeps.services;

import me.nono.firststeps.exceptions.ResourceNotFoundException;
import me.nono.firststeps.models.Person;
import me.nono.firststeps.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    PersonRepository repository;

    public Person create(Person person) {

        logger.info("Creating one person!");

        return repository.save(person);
    }

    public Person update(Person person) {

        logger.info("Updating one person!");

        Person entity = repository.findById(person.getId()).
                orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
        entity.setAddress(person.getAddress());

        return repository.save(entity);
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");

        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));

        repository.delete(entity);
    }

    public List<Person> findAll() {

        logger.info("Finding all users!");

        return repository.findAll();
    }

    public Person findByID(Long id) {

        logger.info("Finding One person. ");

        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));
    }

}
