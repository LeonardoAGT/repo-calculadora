package funciones;

import java.math.BigDecimal;

public class Trigonometria {
    public static BigDecimal sen(BigDecimal x) {
        return BigDecimal.valueOf(Math.sin(x.doubleValue()));
    }

    public static BigDecimal cos(BigDecimal x) {
        return BigDecimal.valueOf(Math.cos(x.doubleValue()));
    }

    public static BigDecimal tan(BigDecimal x) {
        return BigDecimal.valueOf(Math.tan(x.doubleValue()));
    }
}
