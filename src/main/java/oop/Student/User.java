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

    public void printInfo(){
        System.out.println("User: " + this.getName() + " " + this.getEmail());
    }

    public void printInfo(String salutation){
        System.out.println("User: " + salutation + " " + this.getName());
    }

    public void printInfo(String salutation, Integer roll_no){
        System.out.println("User: " + salutation + " " + this.getName() + " Roll: " + roll_no);
    }
}
