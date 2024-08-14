import funciones.Aritmetica;

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

    public int sumar(int a, int b) {
        return Aritmetica.sumar(a, b);
    }

    public int restar(int a, int b) {
        return Aritmetica.restar(a, b);
    }

    public int multiplicar(int a, int b){
        return Aritmetica.multiplicar(a, b);
    }

    public void dividir(int a, int b){
        System.out.println((b!=0) ? Aritmetica.dividir(a, b) : "Error");
    }
}
