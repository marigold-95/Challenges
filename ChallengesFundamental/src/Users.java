import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Users implements Serializable {
    private String FirstName;
    private String Surname;
    private String Email;
    private int Age;
public Users(){}
    public Users(String firstName, String surname, String email, int age) {
        this.FirstName = firstName;
        this.Surname = surname;
        this.Email = email;
        this.Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "users Details{ " +
                "FirstName='" + FirstName + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Email='" + Email + '\'' +
                ", Age=" + Age +
                '}';
    }
}

