package functions;

import utils.AccuracyException;
import utils.Calculatable;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_EVEN;

public class Tan implements Calculatable {
    private final Sin sin;
    private final Cos cos;

    public Tan() {
        this.sin = new Sin();
        this.cos = new Cos();
    }

    public Tan(Cos cos, Sin sin) {
        this.sin = sin;
        this.cos = cos;
    }

    public Tan(Sin sin) {
        this.sin = sin;
        this.cos = new Cos(sin);
    }

    public double calculate(double x, double eps) throws AccuracyException, ArithmeticException {
        BigDecimal calculatedCos = BigDecimal.valueOf(cos.calculate(x, eps / 10));

        if (calculatedCos.compareTo(BigDecimal.ZERO) == 0) return Double.NaN;
        else if (Math.abs(x) == Math.PI || Math.abs(x) == 2 * Math.PI) return 0.0;
        else {
            BigDecimal calculatedSin = BigDecimal.valueOf(sin.calculate(x, eps));
            return calculatedSin.divide(calculatedCos, 30, HALF_EVEN).doubleValue();
        }
    }
}
