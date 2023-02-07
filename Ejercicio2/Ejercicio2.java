// Escribir un programa que indique si un número es múltiplo de 6
import java.util.Scanner;

public class Ejercicio2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Ingresa un número");
            numero = scanner.nextInt();
    
            if (numero % 6 == 0) {
                System.out.println(numero + " es multiplo de 6");
            } else {
                System.out.println("No es múltiplo de 6");
            }
        } finally {
            scanner.close();
        }
    }
}