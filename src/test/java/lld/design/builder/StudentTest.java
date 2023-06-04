package lld.design.builder;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import lld.design.builder.Student.StudentBuilder;

public class StudentTest {

    // @Test
    // public void testBuilderInstance(){
    //     StudentParams params = new StudentParams();
    //     params.setAge(25);
    //     params.setEmail("mariner@gmail.com");
    //     params.setName("Mariner");

    //     Student student = new Student(params);
    // }
    
    @Test
    public void testBuilderInstance(){
        StudentBuilder builder = new StudentBuilder();
        builder.setAge(25);
        builder.setEmail("mariner@gmail.com");
        builder.setName("Mariner");

        Student student = builder.build();
    }
}
