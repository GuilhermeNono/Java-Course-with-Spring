package me.nono.firststeps.controllers;

import me.nono.firststeps.data.vo.v1.PersonVO;
import me.nono.firststeps.data.vo.v2.PersonVOV2;
import me.nono.firststeps.models.Person;
import me.nono.firststeps.services.PersonService;
import me.nono.firststeps.util.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML , MediaType.APPLICATION_YAML})
    public List<PersonVO> findAll() {
        return personService.findAll();
    }

    @GetMapping(value = "/{id}", produces = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML})
    public PersonVO findById(@PathVariable(value = "id") Long id) {
        return personService.findByID(id);
    }

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML},
            consumes = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML}
    )
    public PersonVO create(@RequestBody PersonVO person) {
        return personService.create(person);
    }

    @PostMapping(
            value = "/v2",
            produces = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML},
            consumes = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML}
    )
    public PersonVOV2 createV2(@RequestBody PersonVOV2 person) {
        return personService.createV2(person);
    }

    @PutMapping(
            produces = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML},
            consumes = {MediaType.APPLICATION_JSON , MediaType.APPLICATION_XML ,  MediaType.APPLICATION_YAML}
    )
    public PersonVO update(@RequestBody PersonVO person) {
        return personService.update(person);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
        personService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
