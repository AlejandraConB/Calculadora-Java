class Calculadora {
    public static void main(String[] args) {

        int a = 13;
        int b = 3;
        int c = 5;
        int d = 2;

        int suma = a + b + c;
        int resta = a - b;
        int multiplicacion = d * a * b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
    }
}