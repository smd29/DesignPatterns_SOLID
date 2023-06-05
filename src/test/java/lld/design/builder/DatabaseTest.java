package lld.design.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DatabaseTest {
    
    @Test
    public void testBuilderMethod(){
        Database database = Database.builder()
        .withName("testName").withUrl("host", 3000).withPassword("Pass").hana().build();


        assertNotNull("If builder is called, instance shouldn't be null", database);
        assertEquals("If instance is returned, then password should match the input", "Pass", database.getPassword());
        
    }
}
