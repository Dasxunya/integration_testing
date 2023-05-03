import logarithms.*;
import functions.*;
import utils.Calculatable;

public class FunctionsSystem implements Calculatable {
    private final Cos cos;
    private final Sin sin;
    private final Cot cot;
    private final Tan tan;
    private final Csc csc;
    private final Sec sec;
    private final Ln ln;
    private final Log2 log2;
    private final Log3 log3;
    private final Log10 log10;

    public FunctionsSystem() {
        this.cos = new Cos();
        this.sin = new Sin();
        this.cot = new Cot();
        this.csc = new Csc();
        this.sec = new Sec();
        this.tan = new Tan();

        this.ln = new Ln();
        this.log2 = new Log2();
        this.log3 = new Log3();
        this.log10 = new Log10();
    }

    public FunctionsSystem(Cos cos, Sin sin, Cot cot, Tan tan, Csc csc, Sec sec, Ln ln, Log2 log2, Log3 log3, Log10 log10) {
        this.cos = cos;
        this.sin = sin;
        this.cot = cot;
        this.tan = tan;
        this.csc = csc;
        this.sec = sec;
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log10 = log10;
    }

    public double calculate(double x, double eps) {
        try {
            double lnx = ln.calculate(x, eps);
            double log2x = log2.calculate(x, eps);
            double log3x = log3.calculate(x, eps);
            double log10x = log10.calculate(x, eps);

            if (x > 0) {
                return ((((log10x * log2x) / log3x) / log2x) / (log10x - log3x)) * (log3x / (lnx + lnx));
            } else {
                double secx = sec.calculate(x, eps);
                double cscx = csc.calculate(x, eps);
                double cosx = cos.calculate(x, eps);
                double sinx = sin.calculate(x, eps);
                double cotx = cot.calculate(x, eps);
                double tanx = tan.calculate(x, eps);

                double bracket1 = ((cosx / cosx) * cosx + cscx) / cosx;
                double bracket2 = bracket1 + (cotx - cscx);
                double bracket3 = Math.pow(bracket2 + (tanx - cscx), 3);
                double bracket4 = bracket3 / cscx / (Math.pow(tanx * cotx, 2));
                double bracket5 = bracket4 * sinx + tanx;
                double bracket6 = bracket5 / Math.pow(cosx, 3) / (cosx / cotx);

                double bracket7 = bracket6 - (cotx + cscx);
                double bracket8 = Math.pow(bracket7 - (Math.pow(cosx, 3)), 3);
                double bracket9 = bracket8 - (cosx + Math.pow(cscx, 2));

                double innerRightBracket1 = ((sinx + cscx + sinx) * cotx) / ((sinx + sinx) * (sinx - ((cosx - cscx + Math.pow(sinx, 2)) * (Math.pow(cotx, 2)))));
                double innerRightBracket2 = innerRightBracket1 - secx * secx;
                double innerRightBracket3 = innerRightBracket2 * cotx * cscx * tanx;

                return bracket9 + innerRightBracket3;
            }
        } catch (ArithmeticException e) {
            return Double.NaN;
        }
    }
}
