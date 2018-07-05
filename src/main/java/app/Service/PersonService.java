package app.Service;

import app.Data.PersonData;
import app.Entity.Person;
import app.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PersonService {

    @Autowired
    private PersonData personData;

    @Autowired
    private PersonRepository personRepository;

    public Collection<Person> getAllPeople(){
        return personData.getAllPeople();
    }

    public Person getPersonBy(String id){
        return personData.getAllPeople().stream()
                .filter(p -> p.getId() == Integer.valueOf(id))
                .findFirst()
                .get();
    }

    public void addPerson(Person person) {
        personData.add(person);
    }
    
    public void updatePerson(String id, Person person) {
        for (int i = 0; i < personData.getAllPeople().size(); i++) {

        }
    }

    public void deletePerson(String id) {
        System.out.println("Removed");
    }
}
