import logarithms.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;
import utils.AccuracyException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class LogarithmsTest {
    private static final double DELTA = 0.0001;

    @Test
    @DisplayName("Tests with Ln Mock")
    public void testLog() {
        Ln ln = Mockito.spy(new Ln());
        Log2 log2 = new Log2(ln);
        Log3 log3 = new Log3(ln);
        Log10 log10 = new Log10(ln);

        Mockito.when(ln.calculate(eq(-2),anyDouble())).thenReturn(Double.NaN);
        Mockito.when(ln.calculate(eq(0), anyDouble())).thenReturn(Double.NaN);
        Mockito.when(ln.calculate(eq(Math.E), anyDouble())).thenReturn(1.0d);

        Mockito.when(ln.calculate(eq(0.1), anyDouble())).thenReturn(-2.3025);
        Mockito.when(ln.calculate(eq(0.3333), anyDouble())).thenReturn(-1.0987);
        Mockito.when(ln.calculate(eq(0.5), anyDouble())).thenReturn(-0.6931);

        Mockito.when(ln.calculate(eq(1), anyDouble())).thenReturn(0.0d);
        Mockito.when(ln.calculate(eq(2), anyDouble())).thenReturn(0.6932);
        Mockito.when(ln.calculate(eq(3), anyDouble())).thenReturn(1.0986);
        Mockito.when(ln.calculate(eq(10), anyDouble())).thenReturn(2.3025);


        //check log2
        assertEquals(Double.NaN, log2.calculate(-2, DELTA));
        assertEquals(Double.NaN, log2.calculate(0, DELTA));
        assertEquals(0, log2.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log2.calculate(Math.sqrt(2), DELTA), DELTA);
        assertEquals(1, log2.calculate(2, DELTA), DELTA);
        assertEquals(-1, log2.calculate(0.5, DELTA), DELTA);
        assertEquals(1.44269504, log2.calculate(Math.E, DELTA), DELTA);

        //check log3
        assertEquals(Double.NaN, log3.calculate(-2, DELTA));
        assertEquals(Double.NaN, log3.calculate(0, DELTA));
        assertEquals(0, log3.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log3.calculate(Math.sqrt(3), DELTA), DELTA);
        assertEquals(1, log3.calculate(3, DELTA), DELTA);
        assertEquals(-1, log3.calculate((double) 1 / 3, DELTA), DELTA);
        assertEquals(0.91023922, log3.calculate(Math.E, DELTA), DELTA);

        //check log10
        assertEquals(Double.NaN, log10.calculate(-2, DELTA));
        assertEquals(Double.NaN, log10.calculate(0, DELTA));
        assertEquals(0, log10.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log10.calculate(Math.sqrt(10), DELTA), DELTA);
        assertEquals(1, log10.calculate(10, DELTA), DELTA);
        assertEquals(-1, log10.calculate(0.1, DELTA), DELTA);
        assertEquals(0.43429, log10.calculate(Math.E, DELTA), DELTA);
    }

    @Test
    @DisplayName("Tests for Ln")
    public void testLn(){
        Ln ln = new Ln();
        assertEquals(Double.NaN, ln.calculate(0, DELTA));
        assertEquals(Double.NaN, ln.calculate(-1, DELTA));
        assertEquals(1, ln.calculate(Math.E, DELTA), DELTA);
        assertEquals(0, ln.calculate(1, DELTA), DELTA);
        assertEquals(2.30258, ln.calculate(10, DELTA / 10), DELTA);
        assertEquals(1.15129, ln.calculate(Math.sqrt(10), DELTA), DELTA);
        assertThrows(AccuracyException.class, () -> ln.calculate(2, -2));
    }

    @Test
    @DisplayName("Test without ln-mock")
    public void testWithoutMock(){
        Ln ln = Mockito.spy(new Ln());
        Log2 log2 = new Log2(ln);
        Log3 log3 = new Log3(ln);
        Log10 log10 = new Log10(ln);

        //check log2
        assertEquals(Double.NaN, log2.calculate(-2, DELTA));
        assertEquals(Double.NaN, log2.calculate(0, DELTA));
        assertEquals(0, log2.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log2.calculate(Math.sqrt(2), DELTA), DELTA);
        assertEquals(1, log2.calculate(2, DELTA), DELTA);
        assertEquals(-1, log2.calculate(0.5, DELTA), DELTA);
        assertEquals(1.44269504, log2.calculate(Math.E, DELTA), DELTA);

        //check log3
        assertEquals(Double.NaN, log3.calculate(-2, DELTA));
        assertEquals(Double.NaN, log3.calculate(0, DELTA));
        assertEquals(0, log3.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log3.calculate(Math.sqrt(3), DELTA), DELTA);
        assertEquals(1, log3.calculate(3, DELTA), DELTA);
        assertEquals(-1, log3.calculate((double) 1 / 3, DELTA), DELTA);
        assertEquals(0.91023922, log3.calculate(Math.E, DELTA), DELTA);

        //check log10
        assertEquals(Double.NaN, log10.calculate(-2, DELTA));
        assertEquals(Double.NaN, log10.calculate(0, DELTA));
        assertEquals(0, log10.calculate(1, DELTA), DELTA);
        assertEquals(0.5, log10.calculate(Math.sqrt(10), DELTA), DELTA);
        assertEquals(1, log10.calculate(10, DELTA), DELTA);
        assertEquals(-1, log10.calculate(0.1, DELTA), DELTA);
        assertEquals(0.43429, log10.calculate(Math.E, DELTA), DELTA);
    }

}
