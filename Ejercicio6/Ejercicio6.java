// Escribir un programa que imprima los impares del 7 al 51
import java.util.Scanner;

public class Ejercicio6 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int impares;

        try {
            for (int i = 7; i <= 51; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        } finally {
            scanner.close();
        }
    }
}