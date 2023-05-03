package me.nono.firststeps.services;

import me.nono.firststeps.data.vo.v1.PersonVO;
import me.nono.firststeps.data.vo.v2.PersonVOV2;
import me.nono.firststeps.exceptions.ResourceNotFoundException;
import me.nono.firststeps.mapper.DozerMapper;
import me.nono.firststeps.mapper.PersonMapper;
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
    @Autowired

    PersonMapper personMapper;

    public PersonVO create(PersonVO person) {

        logger.info("Creating one person!");
        var entity = DozerMapper.parseObject(person, Person.class);
        return DozerMapper.parseObject(repository.save(entity), PersonVO.class);

    }

    public PersonVOV2 createV2(PersonVOV2 person) {

        logger.info("Creating one person!");
        var entity = personMapper.convertVoToEntity(person);
        return personMapper.convertEntityToVo(repository.save(entity));
    }

    public PersonVO update(PersonVO person) {

        logger.info("Updating one person!");

        Person entity = repository.findById(person.getId()).
                orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
        entity.setAddress(person.getAddress());
        PersonVO personVO = DozerMapper.parseObject(repository.save(entity), PersonVO.class);
        return personVO;
    }

    public void delete(Long id) {
        logger.info("Deleting one person!");

        Person entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));

        repository.delete(entity);
    }

    public List<PersonVO> findAll() {

        logger.info("Finding all users!");

        return DozerMapper.parseListObjects(repository.findAll(), PersonVO.class);
    }

    public PersonVO findByID(Long id) {

        logger.info("Finding One person. ");

        Person person = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID."));

        return DozerMapper.parseObject(person, PersonVO.class);
    }

}
