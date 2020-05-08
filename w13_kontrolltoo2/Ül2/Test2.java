package app;

import static org.junit.Assert.assertEquals;

public class Test2 {
    final Ion ion1 = new Ion("H", 1.0, 1);
    final Ion ion2 = new Ion ("NO", 62.0, -1);
    
    @Test

    public void test1(){
        assertEquals(63.0, ion3.getMassSum());
    }

    public void test2(){
        assertEquals("HNO", ion3.getName());
    }

