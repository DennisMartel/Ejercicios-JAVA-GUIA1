// Escribir un programa que indique ni un número es par o impar.
import java.util.Scanner;

public class Ejercicio3 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Ingresa un número");
            numero = scanner.nextInt();
    
            if (numero % 2 == 0) {
                System.out.println("El número "+numero+" es par");
            } else {
                System.out.println("El número "+numero+" es impar");
            }
        } finally {
            scanner.close();
        }
    }
}