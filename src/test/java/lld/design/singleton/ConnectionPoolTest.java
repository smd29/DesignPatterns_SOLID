package lld.design.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ConnectionPoolTest {
    
    @Test
    public void testSingleInstance(){
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        assertNotNull("If getInstance is called, the returned instance shouldn't be null",connectionPool);

        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        assertEquals("If instance is called twice, each instance should be the same", connectionPool, connectionPool2);
    }
}
