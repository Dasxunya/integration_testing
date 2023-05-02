package functions;

import utils.AccuracyException;
import utils.Calculatable;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sin implements Calculatable {
    public double calculate(double x, double eps) throws AccuracyException, ArithmeticException {
        if (eps <= 0 || eps >= 1)
            throw new AccuracyException("Проверьте, что значение eps удовлетворяет условию: 0 < eps < 1");
        else if (Double.POSITIVE_INFINITY == x || Double.NEGATIVE_INFINITY == x)
            throw new ArithmeticException("x не может быть +∞ или -∞");

        x = normalizeAngle(x);

        if (Math.abs(x) == Math.PI || Math.abs(x) == Math.PI * 2) return 0;
        else if (Math.abs(x) == Math.PI / 2) return 1;
        else if (Math.abs(x) == Math.PI / 2 * 3) return -1;

        BigDecimal result = BigDecimal.ZERO;
        BigDecimal term = BigDecimal.valueOf(x);
        int n = 1;

        do{
            result = result.add(term);
            term = term.multiply(BigDecimal.valueOf(-1 * x * x)).divide(BigDecimal.valueOf(2 * n), 30, RoundingMode.HALF_UP).divide(BigDecimal.valueOf(2 * n + 1), 30, RoundingMode.HALF_UP);
            n++;
        } while(term.abs().compareTo(BigDecimal.valueOf(eps)) >= 0);

//        while (Math.abs(term) >= eps) {
//            result += term;
//            term = -term * x * x / (2 * n) / (2 * n + 1);
//            n++;
//        }
        return result.doubleValue();
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