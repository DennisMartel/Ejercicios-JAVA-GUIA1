import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un valor entero");
		int n = sc.nextInt();
		int vectorA[] = new int[n];
		int vectorB[] = new int[n];
		int vectorC[] = new int[n+n];
		int sumaVectorC = (n+n);
		int contador = 0;
		System.out.println("Ingresa los valores del vectorA");
		for (int i = 0; i < n; i++){
          	System.out.println("Ingresa el numero "+ (i+1));
          	vectorA[i] = sc.nextInt();
		}
		System.out.println("Ingresa los valores del vectorB");
		for (int i = 0; i < n; i++){
          	System.out.println("Ingresa el numero "+ (i+1));
          	vectorB[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++){
          	vectorC[contador++] = vectorA[i];
 	   }
 	   for (int i = 0; i < n; i++){
          	vectorC[contador++] = vectorB[i];
 	   }
 	  for (int i = 0; i < sumaVectorC; i++){
			System.out.print (vectorC[i]+" ");
 	   } 
 	   System.out.println("");
 	}
	
}