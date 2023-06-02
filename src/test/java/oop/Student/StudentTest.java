package oop.Student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class StudentTest {
    
    @Test
    public void testStudentInstance(){
        Student student = new Student("Shreyas", "mariner@gmail.com", "Batch1", 80);
        assertNotNull("If constructor is called, then object must be returned", student);
        // assertNull("If default constructor is called, name should be null", student.getName());
        
        student.setName("Shreyas");
        student.setEmail("mariner@gmail.com");

        assertEquals("If name is passed to ctor, the instance should have the same name", "Shreyas", student.getName());

        assertEquals("If no status is passed, default is ACTIVE", StudentStatus.ACTIVE, student.getStatus());
    }

    @Test(expected = RuntimeException.class)
    public void testScoreValidation(){
        Student student = new Student("Shreyas", "mariner@gmail.com", "Batch1", 200);
        assertNotNull("If constructor is called, then object must be returned", student);
    }
}
