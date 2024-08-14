public class Programa {

    public static void main(String[] args) {
        Calculadora calc = Calculadora.getCalculadora();

        System.out.println(calc.sumar(2, 4));
        System.out.println(calc.restar(4, 2));
    }
}
