package functions;

import utils.AccuracyException;
import utils.Calculatable;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;

public class Cot implements Calculatable {
    private final Cos cos;
    private final Sin sin;

    public Cot() {
        this.sin = new Sin();
        this.cos = new Cos();
    }

    public Cot(Cos cos, Sin sin) {
        this.sin = sin;
        this.cos = cos;
    }

    public Cot(Sin sin) {
        this.sin = sin;
        this.cos = new Cos(sin);
    }
    public double calculate(double x, double eps) throws AccuracyException, ArithmeticException {
        double DELTA = .1e-5;

        BigDecimal calculatedSin = BigDecimal.valueOf(sin.calculate(x, eps));
        if (calculatedSin.compareTo(BigDecimal.ZERO) == 0) return Double.NaN;
        else if (Math.abs(x - Math.PI) <= DELTA || Math.abs(x - 2 * Math.PI) <= DELTA)
            return Double.NaN;
        else {
            BigDecimal calculatedCos = BigDecimal.valueOf(cos.calculate(x, eps));
            return calculatedCos.divide(calculatedSin, 30, HALF_EVEN).doubleValue();
        }
    }
}
