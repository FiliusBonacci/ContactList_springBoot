package app.Service;

import app.Data.PersonData;
import app.Entity.Person;
import app.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonData personData;

    @Autowired
    private PersonRepository personRepository;

    public Collection<Person> getAllPeople(){
//        return personData.getAllPeople();
        List<Person> personList = new ArrayList<>();
        personRepository.findAll()
                        .forEach(personList::add);
        return personList;
    }

    public Person getPersonBy(String id){
        return personData.getAllPeople().stream()
                .filter(p -> p.getId() == Integer.valueOf(id))
                .findFirst()
                .get();
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }
    
    public void updatePerson(String id, Person person) {
        for (int i = 0; i < personData.getAllPeople().size(); i++) {

        }
    }

    public void deletePerson(String id) {
        System.out.println("Removed");
    }
}
