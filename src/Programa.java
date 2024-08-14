public class Programa {

    public static void main(String[] args) {
        Calculadora calc = Calculadora.getCalculadora();

        System.out.println(calc.dividir("3", "8"));
    }
}
