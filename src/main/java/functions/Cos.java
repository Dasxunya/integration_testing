package functions;

import utils.AccuracyException;
import utils.Calculatable;

import java.math.BigDecimal;
import java.math.MathContext;

import static java.math.MathContext.DECIMAL128;
import static java.math.RoundingMode.HALF_EVEN;

public class Cos implements Calculatable {
    private final Sin sin;

    public Cos(Sin sin) {
        this.sin = sin;
    }

    public Cos() {
        this.sin = new Sin();
    }

    public double calculate(double x, double eps) throws AccuracyException, ArithmeticException {
        x = normalizeAngle(x);

        final MathContext mathContext = new MathContext(DECIMAL128.getPrecision(), HALF_EVEN);
        BigDecimal withoutSign = BigDecimal.ONE.subtract(BigDecimal.valueOf(sin.calculate(x, eps)).pow(2)).sqrt(mathContext).abs();

        if (Math.abs(x) > Math.PI / 2 && Math.abs(x) < 3 * Math.PI / 2) {
            return withoutSign.multiply(BigDecimal.valueOf(-1)).doubleValue();
        } else {
            return withoutSign.doubleValue();
        }
    }

    public static double normalizeAngle(double x) {
        if (x >= 0) {
            while (x > 2 * Math.PI) {
                x -= 2 * Math.PI;
            }
        } else {
            while (x < -2 * Math.PI) {
                x += 2 * Math.PI;
            }
        }
        return x;
    }
}
