// Hacer un algoritmo que sume las parte 1 
// todos los elementos que seencuentra en la parte superior de la diagonal principal. 
// Según la matriz del problema 18

import java.util.Scanner;

public class Ejercicio19
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int value = 1;
        System.out.println("ingresar los valores de la matriz");
        int n = scanner.nextInt();
        int matriz[][] = new int[n][n];
        int suma = 0;

        try {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = value;
                    value++;
                }
            }  

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("\t"+ matriz[i][j]);
                }
                System.out.println("");
            }   

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i < j) {
                        suma = suma + matriz[i][j];
                    }
                }
            }
            System.out.println("\n"+"El resultado de la suma de los elementos que se");
            System.out.println("encuentran en la parte superior de la diagonal es: "+suma);
        } finally {
            scanner.close();
        }
    }
}