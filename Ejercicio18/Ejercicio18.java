import java.util.Scanner;

public class Ejercicio18
{
public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Escriba un valor entero");
     int n = sc.nextInt();
     int matriz[][] = new int[n][n];
      int valor = 0;
      for (int fila = 0; fila < n; fila++) {
             for (int columna = 0; columna < n; columna++) {
                   if (fila == columna) {
                               valor++;
                               matriz[fila][columna] = valor;
                    } // fin si

               }//fin por interno 
     }//fin por externo

   for (int fila = 0; fila < n; fila++) {
        for (int columna = 0; columna < n; columna++) {

                System.out.print(matriz[fila][columna] + "\t");
       
             }//fin for interno
             System.out.println ("");
        }//fin for externo
    }
  
}
