import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (count < 25) {
            System.out.print("Ingrese un número: ");
            int num = scan.nextInt();

            if (num > 100) {
                count++;
                sum += num;
           }
        }

        System.out.println("La sumatoria de los 25 números mayores a 100 es: " + sum);
  }
}






