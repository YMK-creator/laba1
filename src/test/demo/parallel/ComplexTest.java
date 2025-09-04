package test.demo.parallel;

import static org.junit.Assert.*;

import demo.parallel.Complex;
import org.junit.Test;

public class ComplexTest {

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 7);
        Complex b = new Complex(2, 3);
        a.minus(b);
        assertEquals(3, a.getRe(), 1e-9);
        assertEquals(4, a.getIm(), 1e-9);
    }

    @Test
    public void testDiv() {
        Complex a = new Complex(4, 6);
        a.div(2.0);
        assertEquals(2, a.getRe(), 1e-9);
        assertEquals(3, a.getIm(), 1e-9);
    }
}
