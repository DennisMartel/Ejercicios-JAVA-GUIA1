import java.util.Scanner;

public class Ejercicio11
{
   public static void main(String[] args)
   {
      int i, num, sum=0;
      Scanner scan = new Scanner(System.in);
      try {
         for(i=0; i<25; i++)
         {
            System.out.print("Ingresa un numero positivo: ");
            num = scan.nextInt();
            sum = sum + num;
         } 
         System.out.println("La suma de los 25 numeros ingresados es: "+sum);
      } finally {
         scan.close();
     }
   }
}
