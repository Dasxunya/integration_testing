import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import functions.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class TrigonometryTest {

    private static final double DELTA = 0.0001;

    @DisplayName("Test Sec (cos-mock)")
    @Test
    public void testSec() {
        Cos cos = Mockito.spy(Cos.class);
        Sec sec = new Sec(cos);

        Mockito.when(cos.calculate(eq(0d), anyDouble())).thenReturn(1.0);
        Mockito.when(cos.calculate(eq(Math.PI / 2), anyDouble())).thenReturn(1.0);
        Mockito.when(cos.calculate(eq(Math.PI), anyDouble())).thenReturn(-1.0);
        Mockito.when(cos.calculate(eq(3 * Math.PI / 2), anyDouble())).thenReturn(0.0);
        Mockito.when(cos.calculate(eq(2 * Math.PI), anyDouble())).thenReturn(1.0);

        Mockito.when(cos.calculate(eq(Math.PI / 4), anyDouble())).thenReturn(Math.sqrt(2) / 2);
        Mockito.when(cos.calculate(eq(Math.PI / 3), anyDouble())).thenReturn(0.5);
        Mockito.when(cos.calculate(eq(Math.PI / 6), anyDouble())).thenReturn(Math.sqrt(3) / 2);
        Mockito.when(cos.calculate(eq(-5.27), anyDouble())).thenReturn(0.529160608);

        assertEquals(Double.NaN, sec.calculate(Math.PI / 2, DELTA));
        assertEquals(Double.NaN, sec.calculate(-Math.PI / 2, DELTA));

        assertEquals(1.0, sec.calculate(0d, DELTA), DELTA);
        assertEquals(1.0, sec.calculate(Math.PI * 2, DELTA), DELTA);
        assertEquals(-1.0, sec.calculate(Math.PI, DELTA), DELTA);
        assertEquals(-1.0, sec.calculate(-Math.PI, DELTA), DELTA);

        assertEquals(-2.0, sec.calculate(2 * Math.PI / 3, DELTA), DELTA);
        assertEquals(2.0, sec.calculate(Math.PI / 3, DELTA), DELTA);
        assertEquals(Math.sqrt(2), sec.calculate(Math.PI / 4, DELTA), DELTA);
        assertEquals(2 * Math.sqrt(3) / 3, sec.calculate(Math.PI / 6, DELTA), DELTA);
        assertEquals(1.88978, sec.calculate(-5.27, DELTA), DELTA);
    }

    @DisplayName("Test Csc (sin-mock)")
    @Test
    public void testCsc() {
        Sin sin = Mockito.spy(Sin.class);
        Csc csc = new Csc(sin);

        Mockito.when(sin.calculate(eq(0d), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(2 * Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(Math.PI / 2), anyDouble())).thenReturn(1.0);
        Mockito.when(sin.calculate(eq(3 * Math.PI / 2), anyDouble())).thenReturn(-1.0);

        Mockito.when(sin.calculate(eq(Math.PI / 4), anyDouble())).thenReturn(Math.sqrt(2) / 2);
        Mockito.when(sin.calculate(eq(Math.PI / 3), anyDouble())).thenReturn(Math.sqrt(3) / 2);
        Mockito.when(sin.calculate(eq(Math.PI / 6), anyDouble())).thenReturn(0.5);
        Mockito.when(sin.calculate(eq(-Math.PI / 6), anyDouble())).thenReturn(-0.5);

        Mockito.when(sin.calculate(eq(-5.27), anyDouble())).thenReturn(0.8485216);

        assertEquals(Double.NaN, csc.calculate(0d, DELTA));
        assertEquals(Double.NaN, csc.calculate(Math.PI, DELTA));
        assertEquals(Double.NaN, csc.calculate(2 * Math.PI, DELTA));

        assertEquals(1.0, csc.calculate(Math.PI / 2, DELTA), DELTA);
        assertEquals(-1.0, csc.calculate(3 * Math.PI / 2, DELTA), DELTA);
        assertEquals(1.4142, csc.calculate(Math.PI / 4, DELTA), DELTA);
        assertEquals(1.1547, csc.calculate(Math.PI / 3, DELTA), DELTA);
        assertEquals(2.0, csc.calculate(Math.PI / 6, DELTA), DELTA);
        assertEquals(-2.0, csc.calculate(-Math.PI / 6, DELTA), DELTA);

        assertEquals(1.17852, csc.calculate(-5.27, DELTA), DELTA);

    }

    @DisplayName("Test Tan and Cot (sin/cos-mock)")
    @Test
    public void testTanAndCot() {

    }

    @DisplayName("Test Sin")
    @Test
    public void testCos() {

    }

    @DisplayName("Test All (sin-mock)")
    @Test
    public void testAllFunctions() {

    }

    @DisplayName("Test All (without mock)")
    @Test
    public void testAllFunctionsWithoutMock() {

    }
}
