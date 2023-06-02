package oop.Student;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends User {
    // private String name;
    // private String email;
    private String batchName;
    private Integer score;
    private StudentStatus status = StudentStatus.ACTIVE; // ACTIVE, PAUSED, COMPLETED

    // Define Constructor
    public Student(String name, String email, String batchName, Integer score){
        super(name, email);
        this.batchName = batchName;
        if (score < 0 || score > 100){
            throw new RuntimeException("invalid score!!!");
        }
        this.score = score;
    }
    
    public void changeBatch(String batchName){
        this.batchName = batchName;
    }

}