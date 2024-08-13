public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Hola mundo!!!");
        System.out.println("Hola de nuevo!!!");

        System.out.println(sumar(2, 4));
        System.out.println(restar(4, 2));
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }
}
