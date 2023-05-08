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
    private static final double DELTA = 0.01;

    @DisplayName("all Mocks")
    @ParameterizedTest
    @CsvSource(value = {
            "-0.561, 106.872",
            "-2.591, 3.208E+8",
            "-3.756, 3.352E7",
            "-5.691, 66.534",
            "-5.808, -15.550",
            "-6.844, 106.872",
            "-8.874, 3.208E+8",
            "-10.039, 3.352E+7",
            "-11.974, 66.534",
            "-12.091, -15.550",
            "-1.216, 3.116E+8",
            "-0.2, 9.794E+2",
            "-5.15,4.976E+8",
            "-2.386, 7.027E+8",
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
        Mockito.when(sin.calculate(eq(-0.2), anyDouble())).thenReturn(-0.19866933079506);
        Mockito.when(sin.calculate(eq(-5.15), anyDouble())).thenReturn(0.9057666414687);
        Mockito.when(sin.calculate(eq(-2.386), anyDouble())).thenReturn(-0.6857201610268);

        Mockito.when(cos.calculate(eq(-0.561), anyDouble())).thenReturn(0.84672350127651);
        Mockito.when(cos.calculate(eq(-2.591), anyDouble())).thenReturn(-0.85221459989546);
        Mockito.when(cos.calculate(eq(-3.756), anyDouble())).thenReturn(-0.81711523997916);
        Mockito.when(cos.calculate(eq(-5.691), anyDouble())).thenReturn(0.82972287622421);
        Mockito.when(cos.calculate(eq(-5.808), anyDouble())).thenReturn(0.88920795825729);
        Mockito.when(cos.calculate(eq(-6.844), anyDouble())).thenReturn(0.84682207630761);
        Mockito.when(cos.calculate(eq(-8.874), anyDouble())).thenReturn(-0.85211763395807);
        Mockito.when(cos.calculate(eq(-10.039), anyDouble())).thenReturn(-0.81722205078644);
        Mockito.when(cos.calculate(eq(-11.974), anyDouble())).thenReturn(0.82961942804142);
        Mockito.when(cos.calculate(eq(-12.091), anyDouble())).thenReturn(0.88912316435712);
        Mockito.when(cos.calculate(eq(-1.216), anyDouble())).thenReturn(0.34739938456197);
        Mockito.when(cos.calculate(eq(-0.2), anyDouble())).thenReturn(0.98006657784124);
        Mockito.when(cos.calculate(eq(-5.15), anyDouble())).thenReturn(0.42377681767943);
        Mockito.when(cos.calculate(eq(-2.386), anyDouble())).thenReturn(-0.72786527651852);

        Mockito.when(tan.calculate(eq(-0.561), anyDouble())).thenReturn(-0.628343475166954);
        Mockito.when(tan.calculate(eq(-2.591), anyDouble())).thenReturn(0.61392094067594);
        Mockito.when(tan.calculate(eq(-3.756), anyDouble())).thenReturn(-0.70549945597408);
        Mockito.when(tan.calculate(eq(-5.691), anyDouble())).thenReturn(0.672725279276543);
        Mockito.when(tan.calculate(eq(-5.808), anyDouble())).thenReturn(0.514506451953606);
        Mockito.when(tan.calculate(eq(-6.844), anyDouble())).thenReturn(-0.628085035925201);
        Mockito.when(tan.calculate(eq(-8.874), anyDouble())).thenReturn(0.614176118964653);
        Mockito.when(tan.calculate(eq(-10.039), anyDouble())).thenReturn(-0.705221952223948);
        Mockito.when(tan.calculate(eq(-11.974), anyDouble())).thenReturn(0.672994482506041);
        Mockito.when(tan.calculate(eq(-12.091), anyDouble())).thenReturn(0.514740835422512);
        Mockito.when(tan.calculate(eq(-1.216), anyDouble())).thenReturn(-2.69924849002506);
        Mockito.when(tan.calculate(eq(-0.2), anyDouble())).thenReturn(-0.202710035508673);
        Mockito.when(tan.calculate(eq(-5.15), anyDouble())).thenReturn(2.13736713213483);
        Mockito.when(tan.calculate(eq(-2.386), anyDouble())).thenReturn(0.94209764244654);

        Mockito.when(cot.calculate(eq(-0.561), anyDouble())).thenReturn(-1.59148624839988);
        Mockito.when(cot.calculate(eq(-2.591), anyDouble())).thenReturn(1.6288742307747);
        Mockito.when(cot.calculate(eq(-3.756), anyDouble())).thenReturn(-1.4174355366714);
        Mockito.when(cot.calculate(eq(-5.691), anyDouble())).thenReturn(1.48649089131214);
        Mockito.when(cot.calculate(eq(-5.808), anyDouble())).thenReturn(1.94361022335668);
        Mockito.when(cot.calculate(eq(-6.844), anyDouble())).thenReturn(-1.59214110001355);
        Mockito.when(cot.calculate(eq(-8.874), anyDouble())).thenReturn(1.62819746506222);
        Mockito.when(cot.calculate(eq(-10.039), anyDouble())).thenReturn(-1.41799329536816);
        Mockito.when(cot.calculate(eq(-11.974), anyDouble())).thenReturn(1.48589628294765);
        Mockito.when(cot.calculate(eq(-12.091), anyDouble())).thenReturn(1.94272521467852);
        Mockito.when(cot.calculate(eq(-1.216), anyDouble())).thenReturn(-0.370473486859566);
        Mockito.when(cot.calculate(eq(-0.2), anyDouble())).thenReturn(-4.93315487558689);
        Mockito.when(cot.calculate(eq(-5.15), anyDouble())).thenReturn(0.467865340008849);
        Mockito.when(cot.calculate(eq(-2.386), anyDouble())).thenReturn(1.06146110014997);

        Mockito.when(sec.calculate(eq(-0.561), anyDouble())).thenReturn(1.18102308308724);
        Mockito.when(sec.calculate(eq(-2.591), anyDouble())).thenReturn(-1.17341336339775);
        Mockito.when(sec.calculate(eq(-3.756), anyDouble())).thenReturn(-1.22381758541856);
        Mockito.when(sec.calculate(eq(-5.691), anyDouble())).thenReturn(1.20522168142533);
        Mockito.when(sec.calculate(eq(-5.808), anyDouble())).thenReturn(1.1245963227318);
        Mockito.when(sec.calculate(eq(-6.844), anyDouble())).thenReturn(1.18088560510879);
        Mockito.when(sec.calculate(eq(-8.874), anyDouble())).thenReturn(-1.17354689088527);
        Mockito.when(sec.calculate(eq(-10.039), anyDouble())).thenReturn(-1.223657632632);
        Mockito.when(sec.calculate(eq(-11.974), anyDouble())).thenReturn(1.20537196478248);
        Mockito.when(sec.calculate(eq(-12.091), anyDouble())).thenReturn(1.12470357323673);
        Mockito.when(sec.calculate(eq(-1.216), anyDouble())).thenReturn(2.87853129406344);
        Mockito.when(sec.calculate(eq(-0.2), anyDouble())).thenReturn(1.02033884494119);
        Mockito.when(sec.calculate(eq(-5.15), anyDouble())).thenReturn(2.35973266653879);
        Mockito.when(sec.calculate(eq(-2.386), anyDouble())).thenReturn(-1.37388062359993);

        Mockito.when(csc.calculate(eq(-0.561), anyDouble())).thenReturn(-1.87958199577617);
        Mockito.when(csc.calculate(eq(-2.591), anyDouble())).thenReturn(-1.91134278968526);
        Mockito.when(csc.calculate(eq(-3.756), anyDouble())).thenReturn(1.73468253597567);
        Mockito.when(csc.calculate(eq(-5.691), anyDouble())).thenReturn(1.79155105145065);
        Mockito.when(csc.calculate(eq(-5.808), anyDouble())).thenReturn(2.18577691001084);
        Mockito.when(csc.calculate(eq(-6.844), anyDouble())).thenReturn(-1.88013650630808);
        Mockito.when(csc.calculate(eq(-8.874), anyDouble())).thenReturn(-1.91076607287104);
        Mockito.when(csc.calculate(eq(-10.039), anyDouble())).thenReturn(1.73513831889824);
        Mockito.when(csc.calculate(eq(-11.974), anyDouble())).thenReturn(1.79105772203959);
        Mockito.when(csc.calculate(eq(-12.091), anyDouble())).thenReturn(2.18498999076603);
        Mockito.when(csc.calculate(eq(-1.216), anyDouble())).thenReturn(-1.06641952554606);
        Mockito.when(csc.calculate(eq(-0.2), anyDouble())).thenReturn(-5.03348954767238);
        Mockito.when(csc.calculate(eq(-5.15), anyDouble())).thenReturn(1.10403712636016);
        Mockito.when(csc.calculate(eq(-2.386), anyDouble())).thenReturn(-1.45832083820111);

        FunctionsSystem system = new FunctionsSystem(cos, sin, cot, tan, csc, sec, ln, log2, log3, log10);
        assertEquals(Double.NaN, system.calculate(0, 0.000001));
        assertEquals(expectedResult, system.calculate(x, 0.0000000001), 1);
    }
}
