package oop;

import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.ModuleElement.UsesDirective;

import oop.Student.Student;
import oop.Student.User;
import oop.subtyping.Mentor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student student = new Student("Student1", "student_old@email.com", "batch", 100);
        Mentor mentor = new Mentor("mentor1", "mentor_old@email.com", new ArrayList<Student>(), "Dream");
        List<User> users = new ArrayList<>();
        users.add(student);
        users.add(mentor);
        resetEmail(users);
        student.printInfo(); //Inheritence
        student.printInfo("Mr."); // polymorphism  --> method overloading
        student.printInfo("Mr.", 10); // another valid method overloading   
    }

    public static void resetEmail(List<User> users){
        for (User user: users){
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            user.changeEmail("null@gmail.com");
            System.out.println(user.getEmail());

            if (user instanceof Student){
                Student student = (Student) user;
                System.out.println("Before Score is: " + student.getScore());
                student.setScore(0);
                System.out.println("After Score is: " + student.getScore());

            }
        }
        
    }
}
