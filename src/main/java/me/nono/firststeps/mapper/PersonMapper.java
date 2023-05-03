package me.nono.firststeps.mapper;

import me.nono.firststeps.data.vo.v2.PersonVOV2;
import me.nono.firststeps.models.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonVOV2 convertEntityToVo(Person person) {
        PersonVOV2 vo = new PersonVOV2();
        vo.setId(person.getId());
        vo.setFirstName(person.getFirstName());
        vo.setLastName(person.getLastName());
        vo.setBirthday(new Date());
        vo.setGender(person.getGender());
        vo.setAddress(person.getAddress());

        return vo;
    }

    public Person convertVoToEntity(PersonVOV2 personVOV2) {
        Person entity = new Person();
        entity.setId(personVOV2.getId());
        entity.setFirstName(personVOV2.getFirstName());
        entity.setLastName(personVOV2.getLastName());
//        entity.setBirthday(new Date());
        entity.setGender(personVOV2.getGender());
        entity.setAddress(personVOV2.getAddress());

        return entity;
    }

}
