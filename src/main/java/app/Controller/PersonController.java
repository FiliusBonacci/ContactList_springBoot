package app.Controller;


import app.Entity.Person;
import app.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/")
    public Collection<Person> getAllPeople(){
        return personService.getAllPeople();
    }

    @RequestMapping("/{id}")
    public Optional<Person> getPerson(@PathVariable String id) {
        return personService.getPersonBy(id);
    }

    @RequestMapping(value ="/add",method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @RequestMapping(value ="/update/{id}",method = RequestMethod.PUT)
    public void updatePerson(@RequestBody Person person, @PathVariable String id) {
        personService.updatePerson(id, person);
    }
    @RequestMapping(value ="/delete/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable String id) {
        personService.deletePerson(id);
    }

}
