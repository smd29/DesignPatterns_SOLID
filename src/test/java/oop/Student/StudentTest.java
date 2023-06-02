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

        assertEquals("If name is passed to ctor, the instance should have the same name", "Shreyas", student.getName());

        assertEquals("If no status is passed, default is ACTIVE", StudentStatus.ACTIVE, student.getStatus());
    }

    @Test(expected = RuntimeException.class)
    public void testScoreValidation(){
        Student student = new Student("Shreyas", "mariner@gmail.com", "Batch1", 200);
        assertNotNull("If constructor is called, then object must be returned", student);
    }

    @Test
    public void testUserFields(){
        Student student = new Student("Shreyas", "mariner@gmail.com", "Batch1", 80);
        assertEquals("If name is passed to ctor, the instance should have the same name", "Shreyas", student.getName());

        student.changeEmail("change@email.com");
        assertEquals("If changeEmail is called, new email should be set", "change@email.com", student.getEmail());
    }
}
