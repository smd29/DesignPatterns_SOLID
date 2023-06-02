package oop.subtyping;

import java.util.ArrayList;
import java.util.List;

import oop.Student.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import oop.Student.User;

@Getter
@Setter
@AllArgsConstructor
public class Mentor extends User{
    private List<Student> mentees = new ArrayList<>();
    private String company;

    public Mentor(String name, String email, List<Student> mentees, String company){
        super(name, email);
        this.mentees = mentees;
        this.company = company;
    }
}
