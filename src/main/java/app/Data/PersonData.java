package app.Data;

import app.Entity.Person;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static app.Entity.Category.*;

@Repository
public class PersonData {


    private static List<Person> personList = new ArrayList<>(Arrays.asList(
            new Person(1,"Adam", "Nowak", "anowak@mail.com", "123", 500100200, "Prywatny", LocalDate.of(1990,2,12)),
            new Person("Ania", "Kowalska", "akowalska@mail.com", "123", 500100200, "Biznesowy", LocalDate.of(1990,2,12))
    ));



    public Collection<Person> getAllPeople(){
        return this.personList;
    }

    public void add(Person person) {
        this.personList.add(person);
    }
}
