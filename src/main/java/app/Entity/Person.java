package app.Entity;



import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
public class Person {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int phone;
    private String category;
    private LocalDate dob;


    public Person(int id, String firstname, String lastname, String email, String password, int phone, String category, LocalDate dob) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.category = category;
        this.dob = dob;
    }

    public Person(String firstname, String lastname, String email, String password, int phone, String category, LocalDate dob) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.category = category;
        this.dob = dob;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
