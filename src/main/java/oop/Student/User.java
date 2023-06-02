package oop.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private String name;
    private String email;

    public void changeEmail(String email){
        this.email = email;
    }
}
