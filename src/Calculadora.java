import funciones.Aritmetica;

import java.math.BigDecimal;

/**
 * Clase principal, utiliza una instancia única de calculadora,
 * para realizar todas las operaciones solicitadas
 */
public class Calculadora {
    private static Calculadora calc;

    private Calculadora() {}

    public static Calculadora getCalculadora() {
        if (calc == null) {
            calc = new Calculadora();
        }
        return calc;
    }

    public BigDecimal sumar(String val1, String val2) {
        BigDecimal a = BigDecimal.valueOf(Double.parseDouble(val1));
        BigDecimal b = BigDecimal.valueOf(Double.parseDouble(val2));

        return Aritmetica.sumar(a, b);
    }

    public BigDecimal restar(String val1, String val2) {
        BigDecimal a = BigDecimal.valueOf(Double.parseDouble(val1));
        BigDecimal b = BigDecimal.valueOf(Double.parseDouble(val2));

        return Aritmetica.restar(a, b);
    }

    public BigDecimal multiplicar(String val1, String val2){
        BigDecimal a = BigDecimal.valueOf(Double.parseDouble(val1));
        BigDecimal b = BigDecimal.valueOf(Double.parseDouble(val2));

        return Aritmetica.multiplicar(a, b);
    }

    public BigDecimal dividir(String val1, String val2){
        BigDecimal a = BigDecimal.valueOf(Double.parseDouble(val1));
        BigDecimal b = BigDecimal.valueOf(Double.parseDouble(val2));

        return Aritmetica.dividir(a, b);
    }
}
