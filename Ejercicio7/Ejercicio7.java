// Escribir un algoritmo que determine si un número es numero primo
import java.util.Scanner;

public class Ejercicio7 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        try {
            System.out.println("Ingresa un número");
            numero = scanner.nextInt();

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    contador++;
                }
            }

            if (contador == 2) {
                System.out.println(numero+" es un número primo");
            } else {
                System.out.println(numero+" no es un número primo");
            }
        } finally {
            scanner.close();
        }
    }
}