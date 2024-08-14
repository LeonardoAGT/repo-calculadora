package funciones;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Funciones aritméticas
 */
public class Aritmetica {
    public static BigDecimal sumar(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

    public static BigDecimal restar(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

    public static BigDecimal multiplicar(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }

    public static BigDecimal dividir(BigDecimal a, BigDecimal b) {
        return a.divide(b, RoundingMode.DOWN);
    }
}
