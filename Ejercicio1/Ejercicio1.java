// Escribir un programa que indique cuál es el mayor de cuatro números enteros.
import java.util.Scanner;

public class Ejercicio1 
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int numeroMayor = 0;

        try {
            for(int i = 1; i <= 4; i++) {
                System.out.println("Digita el número "+ i);
                int tmp = scanner.nextInt();
    
                if (i == 1) {
                    numeroMayor = tmp;
                }
    
                if(tmp > numeroMayor) {
                    numeroMayor = tmp;
                }
            }
    
            System.out.println("El número mayor es: "+numeroMayor);
        } finally {
            scanner.close();
        }
    }
}