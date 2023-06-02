package oop.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class User {
    private String name;
    private String email;

    public void changeEmail(String email){
        this.email = email;
    }
}
