import java.util.Scanner;

public class Ejercicio12
{
   public static void main(String[] args)
   {
      int i, num, sum=0;
      Scanner scan = new Scanner(System.in);
      try {
         for(i=0; i<25;)
         {
            System.out.print("Ingresa un numero positivo: ");
            num = scan.nextInt();
            if (num%2!=0){
                sum = sum + num;
                i=i+1; 
            }
         } 
         System.out.println("La suma de los 25 numeros impares ingresados es: "+sum);
      } finally {
         scan.close();
     }
   }
}
