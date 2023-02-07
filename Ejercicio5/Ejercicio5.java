// Escribir un programa que indique si un número es divisible entre dos,tres y cinco (a la vez)
import java.util.Scanner;

public class Ejercicio5 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.println("Digita el número");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("El número "+numero+ " si es divisible entre 2, 3 y 5");
            } else {
                System.out.println("El número "+numero+ " no es divisible entre 2, 3 y 5");
            }
        } finally {
            scanner.close();
        }
    }
}