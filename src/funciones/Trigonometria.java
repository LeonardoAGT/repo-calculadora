package funciones;

import java.math.BigDecimal;

public class Trigonometria {
    public static double sen(BigDecimal x) {
        return Math.sin(x.doubleValue());
    }

    public static double cos(BigDecimal x) {
        return Math.cos(x.doubleValue());
    }

    public static double tan(BigDecimal x) {
        return Math.tan(x.doubleValue());
    }
}
