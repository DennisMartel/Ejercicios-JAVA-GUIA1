// Hacer un algoritmo que almacene en un vector todos los numero positivos de N leídos
import java.util.Scanner;

public class Ejercicio16 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de números");
        int quantity = scanner.nextInt();
        int vector[] = new int[quantity];
        
        try {
            for (int i = 0; i < quantity; i++) {
                System.out.println("Ingresa el valor del número " + i);
                vector[i] = scanner.nextInt();
            }
            
            System.out.print("\n");
            for (int i = 0; i < quantity; i++) {
                if (vector[i] > 0) {
                    System.out.print(vector[i] + " ");
                }
            }
        } finally {
            scanner.close();
        }
    }
}