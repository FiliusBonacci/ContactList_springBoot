package app.Service;

import app.Data.PersonData;
import app.Entity.Person;
import app.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonService {

    @Autowired
    private PersonData personData;

    @Autowired
    private PersonRepository personRepository;

    public Collection<Person> getAllPeople(){

        List<Person> personList = new ArrayList<>();
        personRepository.findAll()
                        .forEach(personList::add);
        return personList;
    }

    public Optional<Person> getPersonBy(String id){

        Optional<Person> person = personRepository.findById(Integer.valueOf(id));
        return person;

//        return personData.getAllPeople().stream()
//                .filter(p -> p.getId() == Integer.valueOf(id))
//                .findFirst()
//                .get();

    }

    public String addPerson(Person person) {
        personRepository.save(person);
        return "added";
    }
    
    public void updatePerson(String id, Person person) {
        personRepository.save(person); // metoda save() moze rowniez zrobic update na rekordzie jesli rekord o podanym id juz istnieje
    }

    public void deletePerson(String id) {
        personRepository.deleteById(Integer.valueOf(id));
    }
}
