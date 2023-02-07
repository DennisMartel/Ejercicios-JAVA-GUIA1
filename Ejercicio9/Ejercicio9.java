// Hacer un algoritmo que imprima la secuencia de los numero Fibonaccidel 1 a N.
import java.util.Scanner;

public class Ejercicio9 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int f = 0;
        int t1 = 1;
        int t2;

        try {
            System.out.println("Cuantos números deseas generar");
            n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                t2 = f;
                f = (t1 + f);
                t1 = t2;

                System.out.println(t1);
            }

        } finally {
            scanner.close();
        }
    }
}