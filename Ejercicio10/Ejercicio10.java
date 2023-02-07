// Hacer un algoritmo que determine de n numero la cantidad de pares e impares.
import java.util.Scanner;

public class Ejercicio10 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int imparesContador = 0;
        int paresContador = 0;
        int valorNumero = 0;

        try {
            System.out.println("Ingresa la cantidad de números");
            valorNumero = scanner.nextInt();

            for (int i = 1; i <= valorNumero; i++) {
                if (i % 2 == 0) {
                    paresContador+=1;
                } else {
                    imparesContador+=1;
                }
            }
            System.out.println("La cantidad de números pares es: "+paresContador);
            System.out.println("La cantidad de números impares es: "+imparesContador);
            
        } finally {
            scanner.close();
        }
    }
}