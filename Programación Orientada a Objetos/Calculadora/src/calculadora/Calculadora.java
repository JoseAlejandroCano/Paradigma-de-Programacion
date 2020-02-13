package calculadora;

public class Calculadora {

    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();
        System.out.println(cal.suma(5, 25));
        System.out.println(cal.resta(35, 5));
        System.out.println(cal.producto(5, 6));
        System.out.println(cal.cociente(2000, 5));
    }

    public int suma(int operando1, int operando2) {
        int suma = operando1 + operando2;
        System.out.println("La suma es: ");
        return suma;
    }

    public int resta(int operando1, int operando2) {
        int resta = operando1 - operando2;
        System.out.println("La resta es: ");
        return resta;
    }

    public int producto(int operando1, int operando2) {
        System.out.println("La multiplación es: ");
        int producto = operando1 * operando2;
        return producto;
    }

    private boolean esCero(int numero) {
        if (numero == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int cociente(int operando1, int operando2) {
        if (esCero(operando2)) {
            return 0;
        } else {
            System.out.println("La división es: ");
            return operando1 / operando2;
        }

    }
}
