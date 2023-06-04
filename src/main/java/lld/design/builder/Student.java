package lld.design.builder;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.val;

@Getter
public class Student {
    private String name;
    private String email;
    private Integer age;
    private Date startDate;

    // // Step 1: create a constructor that accepts a hash map
    // public Student(StudentParams params){
    //     this.name = params.getName();
    //     this.email = params.getEmail();
    //     this.age = params.getAge();
    //     this.startDate = params.getStartDate();
    // }


    // Step 2: Hide outer constructor
    private Student(){}
    
    // Improvement: Add a static initializer
    public StudentBuilder toBuilder(){
        return new StudentBuilder();
    }
    // Step 1: Create an inner class with same fields as outer class
    @Getter
    @Setter
    public static class StudentBuilder{
        private String name;
        private String email;
        private Integer age;
        private Date startDate;

        // Step 3: Implement build method
        public Student build(){
            Student student = new Student();
            student.age = this.age;
            student.email = this.email;
            student.name = this.name;
            student.startDate = this.startDate;

            return student;
        }
    }
}
