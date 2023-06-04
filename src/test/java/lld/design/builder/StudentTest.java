package lld.design.builder;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class StudentTest {

    @Test
    public void testBuilderInstance(){
        StudentParams params = new StudentParams();
        params.setAge(25);
        params.setEmail("mariner@gmail.com");
        params.setName("Mariner");

        Student student = new Student(params);
    }
}
