package lld.design.builder;
import java.util.Date;
import java.util.Map;

import lombok.val;

public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    // Step 1: create a constructor that accepts a hash map
    public Student(StudentParams params){
        this.name = params.getName();
        this.email = params.getEmail();
        this.age = params.getAge();
        this.startDate = params.getStartDate();
    }
}
