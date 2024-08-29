package funciones;

import java.math.BigDecimal;
import java.math.MathContext;

public class Potencia {
    public static BigDecimal pow(BigDecimal base, BigDecimal exponent) {
        return base.pow(exponent.intValue());
    }

    public static BigDecimal sqrt(BigDecimal radical) {
        return radical.sqrt(new MathContext(radical.scale()));
    }

}
