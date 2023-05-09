import logarithms.*;
import functions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class FunctionTest {
    @DisplayName("all Mocks")
    @ParameterizedTest
    @CsvSource(value = {
            "-0.561, 106.872",
            "-2.591, 320700000",
            "-3.756, 33521063",
            "-6.844, 106.872",
            "-8.874, 320800000",
            "-10.039, 33520000",
            "-1.216, 311600000",
            "-0.2, 979.4",
            "-5.15, 497600000",
            "-2.386, 702700000",
            "0.911, 4.895",
            "1.69, -0.869",
            "1, NaN"
    })
    public void tableValuesTest(double x, double expectedResult) {
        Ln ln = Mockito.spy(Ln.class);
        Log2 log2 = Mockito.spy(Log2.class);
        Log3 log3 = Mockito.spy(Log3.class);
        Log10 log10 = Mockito.spy(Log10.class);

        Sin sin = Mockito.spy(Sin.class);
        Cos cos = Mockito.spy(Cos.class);
        Csc csc = Mockito.spy(Csc.class);
        Sec sec = Mockito.spy(Sec.class);
        Tan tan = Mockito.spy(Tan.class);
        Cot cot = Mockito.spy(Cot.class);

        //logs
        Mockito.when(ln.calculate(eq(0.911), anyDouble())).thenReturn(-0.093212381722179);
        Mockito.when(ln.calculate(eq(1.69), anyDouble())).thenReturn(0.52472852893498);
        Mockito.when(ln.calculate(eq(1), anyDouble())).thenReturn(0.0);

        Mockito.when(log2.calculate(eq(0.911), anyDouble())).thenReturn(-0.13447704086);
        Mockito.when(log2.calculate(eq(1.69), anyDouble())).thenReturn(0.7570232465);
        Mockito.when(log2.calculate(eq(1), anyDouble())).thenReturn(0.0);

        Mockito.when(log3.calculate(eq(0.911), anyDouble())).thenReturn(-0.0848455662508415);
        Mockito.when(log3.calculate(eq(1.69), anyDouble())).thenReturn(0.477628490366816);
        Mockito.when(log3.calculate(eq(1), anyDouble())).thenReturn(0.0);

        Mockito.when(log10.calculate(eq(0.911), anyDouble())).thenReturn(-0.0404816230270017);
        Mockito.when(log10.calculate(eq(1.69), anyDouble())).thenReturn(0.227886704613674);
        Mockito.when(log10.calculate(eq(1), anyDouble())).thenReturn(0.0);

        //trigonometry
        Mockito.when(sin.calculate(eq(-0.561), anyDouble())).thenReturn(-0.53203);
        Mockito.when(sin.calculate(eq(-2.591), anyDouble())).thenReturn(-0.52319);
        Mockito.when(sin.calculate(eq(-3.756), anyDouble())).thenReturn(0.57647);
        Mockito.when(sin.calculate(eq(-5.691), anyDouble())).thenReturn(0.55818);
        Mockito.when(sin.calculate(eq(-5.808), anyDouble())).thenReturn(0.45750);
        Mockito.when(sin.calculate(eq(-6.844), anyDouble())).thenReturn(-0.53188);
        Mockito.when(sin.calculate(eq(-8.874), anyDouble())).thenReturn(-0.52335);
        Mockito.when(sin.calculate(eq(-10.039), anyDouble())).thenReturn(0.57632);
        Mockito.when(sin.calculate(eq(-11.974), anyDouble())).thenReturn(0.55833);
        Mockito.when(sin.calculate(eq(-12.091), anyDouble())).thenReturn(0.45767);
        Mockito.when(sin.calculate(eq(-1.216), anyDouble())).thenReturn(-0.93772);
        Mockito.when(sin.calculate(eq(-0.2), anyDouble())).thenReturn(-0.19867);
        Mockito.when(sin.calculate(eq(-5.15), anyDouble())).thenReturn(0.90577);
        Mockito.when(sin.calculate(eq(-2.386), anyDouble())).thenReturn(-0.68572);

        Mockito.when(cos.calculate(eq(-0.561), anyDouble())).thenReturn(0.84672);
        Mockito.when(cos.calculate(eq(-2.591), anyDouble())).thenReturn(-0.85221);
        Mockito.when(cos.calculate(eq(-3.756), anyDouble())).thenReturn(-0.81712);
        Mockito.when(cos.calculate(eq(-5.691), anyDouble())).thenReturn(0.829723);
        Mockito.when(cos.calculate(eq(-5.808), anyDouble())).thenReturn(0.88921);
        Mockito.when(cos.calculate(eq(-6.844), anyDouble())).thenReturn(0.84682);
        Mockito.when(cos.calculate(eq(-8.874), anyDouble())).thenReturn(-0.85212);
        Mockito.when(cos.calculate(eq(-10.039), anyDouble())).thenReturn(-0.81722);
        Mockito.when(cos.calculate(eq(-11.974), anyDouble())).thenReturn(0.829619);
        Mockito.when(cos.calculate(eq(-12.091), anyDouble())).thenReturn(0.889123);
        Mockito.when(cos.calculate(eq(-1.216), anyDouble())).thenReturn(0.347399);
        Mockito.when(cos.calculate(eq(-0.2), anyDouble())).thenReturn(0.980067);
        Mockito.when(cos.calculate(eq(-5.15), anyDouble())).thenReturn(0.423777);
        Mockito.when(cos.calculate(eq(-2.386), anyDouble())).thenReturn(-0.72787);

        Mockito.when(tan.calculate(eq(-0.561), anyDouble())).thenReturn(-0.62834);
        Mockito.when(tan.calculate(eq(-2.591), anyDouble())).thenReturn(0.613921);
        Mockito.when(tan.calculate(eq(-3.756), anyDouble())).thenReturn(-0.7054995);
        Mockito.when(tan.calculate(eq(-5.691), anyDouble())).thenReturn(0.6727253);
        Mockito.when(tan.calculate(eq(-5.808), anyDouble())).thenReturn(0.5145065);
        Mockito.when(tan.calculate(eq(-6.844), anyDouble())).thenReturn(-0.628085);
        Mockito.when(tan.calculate(eq(-8.874), anyDouble())).thenReturn(0.61417612);
        Mockito.when(tan.calculate(eq(-10.039), anyDouble())).thenReturn(-0.705222);
        Mockito.when(tan.calculate(eq(-11.974), anyDouble())).thenReturn(0.6729945);
        Mockito.when(tan.calculate(eq(-12.091), anyDouble())).thenReturn(0.5147408);
        Mockito.when(tan.calculate(eq(-1.216), anyDouble())).thenReturn(-2.6992485);
        Mockito.when(tan.calculate(eq(-0.2), anyDouble())).thenReturn(-0.20271004);
        Mockito.when(tan.calculate(eq(-5.15), anyDouble())).thenReturn(2.137367);
        Mockito.when(tan.calculate(eq(-2.386), anyDouble())).thenReturn(0.9420976);

        Mockito.when(cot.calculate(eq(-0.561), anyDouble())).thenReturn(-1.59149);
        Mockito.when(cot.calculate(eq(-2.591), anyDouble())).thenReturn(1.62887);
        Mockito.when(cot.calculate(eq(-3.756), anyDouble())).thenReturn(-1.41744);
        Mockito.when(cot.calculate(eq(-5.691), anyDouble())).thenReturn(1.48649);
        Mockito.when(cot.calculate(eq(-5.808), anyDouble())).thenReturn(1.94361);
        Mockito.when(cot.calculate(eq(-6.844), anyDouble())).thenReturn(-1.59214);
        Mockito.when(cot.calculate(eq(-8.874), anyDouble())).thenReturn(1.628197);
        Mockito.when(cot.calculate(eq(-10.039), anyDouble())).thenReturn(-1.41799);
        Mockito.when(cot.calculate(eq(-11.974), anyDouble())).thenReturn(1.485896);
        Mockito.when(cot.calculate(eq(-12.091), anyDouble())).thenReturn(1.942725);
        Mockito.when(cot.calculate(eq(-1.216), anyDouble())).thenReturn(-0.3704735);
        Mockito.when(cot.calculate(eq(-0.2), anyDouble())).thenReturn(-4.9331549);
        Mockito.when(cot.calculate(eq(-5.15), anyDouble())).thenReturn(0.46786534);
        Mockito.when(cot.calculate(eq(-2.386), anyDouble())).thenReturn(1.0614611);

        Mockito.when(sec.calculate(eq(-0.561), anyDouble())).thenReturn(1.181023);
        Mockito.when(sec.calculate(eq(-2.591), anyDouble())).thenReturn(-1.1734134);
        Mockito.when(sec.calculate(eq(-3.756), anyDouble())).thenReturn(-1.2238176);
        Mockito.when(sec.calculate(eq(-5.691), anyDouble())).thenReturn(1.2052217);
        Mockito.when(sec.calculate(eq(-5.808), anyDouble())).thenReturn(1.124596);
        Mockito.when(sec.calculate(eq(-6.844), anyDouble())).thenReturn(1.1808856);
        Mockito.when(sec.calculate(eq(-8.874), anyDouble())).thenReturn(-1.173547);
        Mockito.when(sec.calculate(eq(-10.039), anyDouble())).thenReturn(-1.22366);
        Mockito.when(sec.calculate(eq(-11.974), anyDouble())).thenReturn(1.205372);
        Mockito.when(sec.calculate(eq(-12.091), anyDouble())).thenReturn(1.1247036);
        Mockito.when(sec.calculate(eq(-1.216), anyDouble())).thenReturn(2.87853);
        Mockito.when(sec.calculate(eq(-0.2), anyDouble())).thenReturn(1.0203388);
        Mockito.when(sec.calculate(eq(-5.15), anyDouble())).thenReturn(2.3597327);
        Mockito.when(sec.calculate(eq(-2.386), anyDouble())).thenReturn(-1.37388);

        Mockito.when(csc.calculate(eq(-0.561), anyDouble())).thenReturn(-1.879582);
        Mockito.when(csc.calculate(eq(-2.591), anyDouble())).thenReturn(-1.911343);
        Mockito.when(csc.calculate(eq(-3.756), anyDouble())).thenReturn(1.734683);
        Mockito.when(csc.calculate(eq(-5.691), anyDouble())).thenReturn(1.7915511);
        Mockito.when(csc.calculate(eq(-5.808), anyDouble())).thenReturn(2.1857769);
        Mockito.when(csc.calculate(eq(-6.844), anyDouble())).thenReturn(-1.8801365);
        Mockito.when(csc.calculate(eq(-8.874), anyDouble())).thenReturn(-1.910766);
        Mockito.when(csc.calculate(eq(-10.039), anyDouble())).thenReturn(1.7351383);
        Mockito.when(csc.calculate(eq(-11.974), anyDouble())).thenReturn(1.7910577);
        Mockito.when(csc.calculate(eq(-12.091), anyDouble())).thenReturn(2.184989991);
        Mockito.when(csc.calculate(eq(-1.216), anyDouble())).thenReturn(-1.06641953);
        Mockito.when(csc.calculate(eq(-0.2), anyDouble())).thenReturn(-5.03348955);
        Mockito.when(csc.calculate(eq(-5.15), anyDouble())).thenReturn(1.10403713);
        Mockito.when(csc.calculate(eq(-2.386), anyDouble())).thenReturn(-1.458321);

        FunctionsSystem system = new FunctionsSystem(cos, sin, cot, tan, csc, sec, ln, log2, log3, log10);
        double DELTA = Math.abs(Math.abs(expectedResult / 100));
        if (!Double.isNaN(expectedResult)){
            assertEquals(expectedResult, system.calculate(x, 0.000001), DELTA);assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
        else {
            assertEquals(expectedResult, system.calculate(x, 0.000001), 0.00001);
            assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
    }

    @DisplayName("trigonometry Mocks")
    @ParameterizedTest
    @CsvSource(value = {
            "-0.561, 106.872",
            "-2.591, 320000000",
            "-3.756, 33521063",
            "-6.844, 106.872",
            "-8.874, 320800000",
            "-10.039, 33520000",
            "-1.216, 311600000",
            "-0.2, 979.4",
            "-5.15, 497600000",
            "-2.386, 702700000",
            "0.911, 4.895",
            "1.69, -0.869",
            "1, NaN"
    })
    public void integrateLn(double x, double expectedResult) {
        Cos cos = Mockito.spy(Cos.class);
        Sin sin = Mockito.spy(Sin.class);
        Csc csc = Mockito.spy(Csc.class);
        Sec sec = Mockito.spy(Sec.class);
        Tan tan = Mockito.spy(Tan.class);
        Cot cot = Mockito.spy(Cot.class);

        //trigonometry
        Mockito.when(sin.calculate(eq(-0.561), anyDouble())).thenReturn(-0.53203);
        Mockito.when(sin.calculate(eq(-2.591), anyDouble())).thenReturn(-0.52319);
        Mockito.when(sin.calculate(eq(-3.756), anyDouble())).thenReturn(0.57647);
        Mockito.when(sin.calculate(eq(-5.691), anyDouble())).thenReturn(0.55818);
        Mockito.when(sin.calculate(eq(-5.808), anyDouble())).thenReturn(0.45750);
        Mockito.when(sin.calculate(eq(-6.844), anyDouble())).thenReturn(-0.53188);
        Mockito.when(sin.calculate(eq(-8.874), anyDouble())).thenReturn(-0.52335);
        Mockito.when(sin.calculate(eq(-10.039), anyDouble())).thenReturn(0.57632);
        Mockito.when(sin.calculate(eq(-11.974), anyDouble())).thenReturn(0.55833);
        Mockito.when(sin.calculate(eq(-12.091), anyDouble())).thenReturn(0.45767);
        Mockito.when(sin.calculate(eq(-1.216), anyDouble())).thenReturn(-0.93772);
        Mockito.when(sin.calculate(eq(-0.2), anyDouble())).thenReturn(-0.19867);
        Mockito.when(sin.calculate(eq(-5.15), anyDouble())).thenReturn(0.90577);
        Mockito.when(sin.calculate(eq(-2.386), anyDouble())).thenReturn(-0.68572);

        Mockito.when(cos.calculate(eq(-0.561), anyDouble())).thenReturn(0.84672);
        Mockito.when(cos.calculate(eq(-2.591), anyDouble())).thenReturn(-0.85221);
        Mockito.when(cos.calculate(eq(-3.756), anyDouble())).thenReturn(-0.81712);
        Mockito.when(cos.calculate(eq(-5.691), anyDouble())).thenReturn(0.829723);
        Mockito.when(cos.calculate(eq(-5.808), anyDouble())).thenReturn(0.88921);
        Mockito.when(cos.calculate(eq(-6.844), anyDouble())).thenReturn(0.84682);
        Mockito.when(cos.calculate(eq(-8.874), anyDouble())).thenReturn(-0.85212);
        Mockito.when(cos.calculate(eq(-10.039), anyDouble())).thenReturn(-0.81722);
        Mockito.when(cos.calculate(eq(-11.974), anyDouble())).thenReturn(0.829619);
        Mockito.when(cos.calculate(eq(-12.091), anyDouble())).thenReturn(0.889123);
        Mockito.when(cos.calculate(eq(-1.216), anyDouble())).thenReturn(0.347399);
        Mockito.when(cos.calculate(eq(-0.2), anyDouble())).thenReturn(0.980067);
        Mockito.when(cos.calculate(eq(-5.15), anyDouble())).thenReturn(0.423777);
        Mockito.when(cos.calculate(eq(-2.386), anyDouble())).thenReturn(-0.72787);

        Mockito.when(tan.calculate(eq(-0.561), anyDouble())).thenReturn(-0.62834);
        Mockito.when(tan.calculate(eq(-2.591), anyDouble())).thenReturn(0.613921);
        Mockito.when(tan.calculate(eq(-3.756), anyDouble())).thenReturn(-0.7054995);
        Mockito.when(tan.calculate(eq(-5.691), anyDouble())).thenReturn(0.6727253);
        Mockito.when(tan.calculate(eq(-5.808), anyDouble())).thenReturn(0.5145065);
        Mockito.when(tan.calculate(eq(-6.844), anyDouble())).thenReturn(-0.628085);
        Mockito.when(tan.calculate(eq(-8.874), anyDouble())).thenReturn(0.61417612);
        Mockito.when(tan.calculate(eq(-10.039), anyDouble())).thenReturn(-0.705222);
        Mockito.when(tan.calculate(eq(-11.974), anyDouble())).thenReturn(0.6729945);
        Mockito.when(tan.calculate(eq(-12.091), anyDouble())).thenReturn(0.5147408);
        Mockito.when(tan.calculate(eq(-1.216), anyDouble())).thenReturn(-2.6992485);
        Mockito.when(tan.calculate(eq(-0.2), anyDouble())).thenReturn(-0.20271004);
        Mockito.when(tan.calculate(eq(-5.15), anyDouble())).thenReturn(2.137367);
        Mockito.when(tan.calculate(eq(-2.386), anyDouble())).thenReturn(0.9420976);

        Mockito.when(cot.calculate(eq(-0.561), anyDouble())).thenReturn(-1.59149);
        Mockito.when(cot.calculate(eq(-2.591), anyDouble())).thenReturn(1.62887);
        Mockito.when(cot.calculate(eq(-3.756), anyDouble())).thenReturn(-1.41744);
        Mockito.when(cot.calculate(eq(-5.691), anyDouble())).thenReturn(1.48649);
        Mockito.when(cot.calculate(eq(-5.808), anyDouble())).thenReturn(1.94361);
        Mockito.when(cot.calculate(eq(-6.844), anyDouble())).thenReturn(-1.59214);
        Mockito.when(cot.calculate(eq(-8.874), anyDouble())).thenReturn(1.628197);
        Mockito.when(cot.calculate(eq(-10.039), anyDouble())).thenReturn(-1.41799);
        Mockito.when(cot.calculate(eq(-11.974), anyDouble())).thenReturn(1.485896);
        Mockito.when(cot.calculate(eq(-12.091), anyDouble())).thenReturn(1.942725);
        Mockito.when(cot.calculate(eq(-1.216), anyDouble())).thenReturn(-0.3704735);
        Mockito.when(cot.calculate(eq(-0.2), anyDouble())).thenReturn(-4.9331549);
        Mockito.when(cot.calculate(eq(-5.15), anyDouble())).thenReturn(0.46786534);
        Mockito.when(cot.calculate(eq(-2.386), anyDouble())).thenReturn(1.0614611);

        Mockito.when(sec.calculate(eq(-0.561), anyDouble())).thenReturn(1.181023);
        Mockito.when(sec.calculate(eq(-2.591), anyDouble())).thenReturn(-1.1734134);
        Mockito.when(sec.calculate(eq(-3.756), anyDouble())).thenReturn(-1.2238176);
        Mockito.when(sec.calculate(eq(-5.691), anyDouble())).thenReturn(1.2052217);
        Mockito.when(sec.calculate(eq(-5.808), anyDouble())).thenReturn(1.124596);
        Mockito.when(sec.calculate(eq(-6.844), anyDouble())).thenReturn(1.1808856);
        Mockito.when(sec.calculate(eq(-8.874), anyDouble())).thenReturn(-1.173547);
        Mockito.when(sec.calculate(eq(-10.039), anyDouble())).thenReturn(-1.22366);
        Mockito.when(sec.calculate(eq(-11.974), anyDouble())).thenReturn(1.205372);
        Mockito.when(sec.calculate(eq(-12.091), anyDouble())).thenReturn(1.1247036);
        Mockito.when(sec.calculate(eq(-1.216), anyDouble())).thenReturn(2.87853);
        Mockito.when(sec.calculate(eq(-0.2), anyDouble())).thenReturn(1.0203388);
        Mockito.when(sec.calculate(eq(-5.15), anyDouble())).thenReturn(2.3597327);
        Mockito.when(sec.calculate(eq(-2.386), anyDouble())).thenReturn(-1.37388);

        Mockito.when(csc.calculate(eq(-0.561), anyDouble())).thenReturn(-1.879582);
        Mockito.when(csc.calculate(eq(-2.591), anyDouble())).thenReturn(-1.911343);
        Mockito.when(csc.calculate(eq(-3.756), anyDouble())).thenReturn(1.734683);
        Mockito.when(csc.calculate(eq(-5.691), anyDouble())).thenReturn(1.7915511);
        Mockito.when(csc.calculate(eq(-5.808), anyDouble())).thenReturn(2.1857769);
        Mockito.when(csc.calculate(eq(-6.844), anyDouble())).thenReturn(-1.8801365);
        Mockito.when(csc.calculate(eq(-8.874), anyDouble())).thenReturn(-1.910766);
        Mockito.when(csc.calculate(eq(-10.039), anyDouble())).thenReturn(1.7351383);
        Mockito.when(csc.calculate(eq(-11.974), anyDouble())).thenReturn(1.7910577);
        Mockito.when(csc.calculate(eq(-12.091), anyDouble())).thenReturn(2.184989991);
        Mockito.when(csc.calculate(eq(-1.216), anyDouble())).thenReturn(-1.06641953);
        Mockito.when(csc.calculate(eq(-0.2), anyDouble())).thenReturn(-5.03348955);
        Mockito.when(csc.calculate(eq(-5.15), anyDouble())).thenReturn(1.10403713);
        Mockito.when(csc.calculate(eq(-2.386), anyDouble())).thenReturn(-1.458321);

        FunctionsSystem system = new FunctionsSystem();
        double DELTA = Math.abs(Math.abs(expectedResult / 100));
        if (!Double.isNaN(expectedResult)){
            assertEquals(expectedResult, system.calculate(x, 0.000001), DELTA);assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
        else {
            assertEquals(expectedResult, system.calculate(x, 0.000001), 0.00001);
            assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
    }

    @DisplayName("only Sin Mock")
    @ParameterizedTest
    @CsvSource(value = {
            "-0.561, 106.872",
            "-2.591, 320000000",
            "-3.756, 33521063",
            "-6.844, 106.872",
            "-8.874, 320800000",
            "-10.039, 33520000",
            "-1.216, 311600000",
            "-0.2, 979.4",
            "-5.15, 497600000",
            "-2.386, 702700000",
            "0.911, 4.895",
            "1.69, -0.869",
            "1, NaN"
    })
    public void integrateTrigonometry(double x, double expectedResult) {
        Sin sin = Mockito.spy(Sin.class);
        //trigonometry
        Mockito.when(sin.calculate(eq(-0.561), anyDouble())).thenReturn(-0.53203);
        Mockito.when(sin.calculate(eq(-2.591), anyDouble())).thenReturn(-0.52319);
        Mockito.when(sin.calculate(eq(-3.756), anyDouble())).thenReturn(0.57647);
        Mockito.when(sin.calculate(eq(-5.691), anyDouble())).thenReturn(0.55818);
        Mockito.when(sin.calculate(eq(-5.808), anyDouble())).thenReturn(0.45750);
        Mockito.when(sin.calculate(eq(-6.844), anyDouble())).thenReturn(-0.53188);
        Mockito.when(sin.calculate(eq(-8.874), anyDouble())).thenReturn(-0.52335);
        Mockito.when(sin.calculate(eq(-10.039), anyDouble())).thenReturn(0.57632);
        Mockito.when(sin.calculate(eq(-11.974), anyDouble())).thenReturn(0.55833);
        Mockito.when(sin.calculate(eq(-12.091), anyDouble())).thenReturn(0.45767);
        Mockito.when(sin.calculate(eq(-1.216), anyDouble())).thenReturn(-0.93772);
        Mockito.when(sin.calculate(eq(-0.2), anyDouble())).thenReturn(-0.19867);
        Mockito.when(sin.calculate(eq(-5.15), anyDouble())).thenReturn(0.90577);
        Mockito.when(sin.calculate(eq(-2.386), anyDouble())).thenReturn(-0.68572);

        FunctionsSystem system = new FunctionsSystem();
        double DELTA = Math.abs(Math.abs(expectedResult / 100));
        if (!Double.isNaN(expectedResult)){
            assertEquals(expectedResult, system.calculate(x, 0.000001), DELTA);assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
        else {
            assertEquals(expectedResult, system.calculate(x, 0.000001), 0.00001);
            assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
    }

    @DisplayName("without Mocks")
    @ParameterizedTest
    @CsvSource(value = {
            "-0.561, 106.872",
            "-2.591, 320000000",
            "-3.756, 33521063",
            "-6.844, 106.872",
            "-8.874, 320800000",
            "-10.039, 33520000",
            "-1.216, 311600000",
            "-0.2, 979.4",
            "-5.15, 497600000",
            "-2.386, 702700000",
            "0.911, 4.895",
            "1.69, -0.869",
            "1, NaN"
    })
    public void integrateTest(double x, double expectedResult) {
        FunctionsSystem system = new FunctionsSystem();
        double DELTA = Math.abs(Math.abs(expectedResult / 100));
        if (!Double.isNaN(expectedResult)){
            assertEquals(expectedResult, system.calculate(x, 0.000001), DELTA);assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
        else {
            assertEquals(expectedResult, system.calculate(x, 0.000001), 0.00001);
            assertEquals(Double.NaN, system.calculate(0, 0.0001));
        }
        }
    }
