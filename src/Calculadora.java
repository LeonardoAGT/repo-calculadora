import funciones.Aritmetica;
import funciones.Trigonometria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Clase principal, utiliza una instancia única de calculadora,
 * para realizar todas las operaciones solicitadas
 */
public class Calculadora {
    private static Calculadora calc;

    private Calculadora() {}

    private enum Metodos {
        
    }

    public static Calculadora getCalculadora() {
        if (calc == null) {
            calc = new Calculadora();
        }
        return calc;
    }

    public BigDecimal calcular(Opcion opcion, String... vals) {
        List<BigDecimal> lista = Arrays.stream(vals)
                .map(BigDecimal::new)
                .toList();

        Map<Opcion, Function<String[], BigDecimal>> map;

        switch (opcion) {
            case SUMAR -> {
                return Aritmetica.sumar(lista.get(0), lista.get(1));
            }
            default -> throw new UnsupportedOperationException("Operación inválida");
        }
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

    public BigDecimal sen(String val) {
        BigDecimal angulo = BigDecimal.valueOf(Double.parseDouble(val));
        return Trigonometria.sen(angulo);
    }

    public BigDecimal tan(String val) {
        BigDecimal angulo = BigDecimal.valueOf(Double.parseDouble(val));
        return Trigonometria.tan(angulo);
    }
}
