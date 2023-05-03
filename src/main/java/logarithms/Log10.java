package logarithms;

import utils.AccuracyException;
import utils.Calculatable;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Log10 implements Calculatable {
    private final Ln ln;

    public Log10() {
        this.ln = new Ln();
    }

    public Log10(Ln ln) {
        this.ln = ln;
    }

    public double calculate(double x, double eps) throws AccuracyException, ArithmeticException {
        if (x <= 0) return Double.NaN;
        double base = 10.0;
        return BigDecimal.valueOf(ln.calculate(x, eps)).divide(BigDecimal.valueOf(ln.calculate(base, eps)), 30, RoundingMode.HALF_UP).doubleValue();
    }
}
