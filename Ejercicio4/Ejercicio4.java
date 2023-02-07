// Escribir un programa que indique si la suma de dos valores es positiva, negativa o cero.
import java.util.Scanner;

public class Ejercicio4 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, suma = 0;

        try {
            System.out.println("Digita el valor 1");
            numero1 = scanner.nextInt();

            System.out.println("Digita el valor 2");
            numero2 = scanner.nextInt();

            suma = (numero1 + numero2);

            if (suma > 0) {
                System.out.println("El resultado de la suma es positivo");
            } else if (suma < 0) {
                System.out.println("El resultado de la suma es negativo");
            } else {
                System.out.println("El resultado de la suma es 0");
            }
        } finally {
            scanner.close();
        }
    }
}