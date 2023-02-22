import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        // Pedir al usuario el rango A y B
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de A: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el valor de B: ");
        int b = sc.nextInt();
        
        // Iterar sobre los números en el rango A y B
        for (int i = a; i <= b; i++) {
            System.out.printf("Tabla de multiplicar del %d:%n", i);
            
            // Iterar sobre los múltiplos de i del 1 al 10
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.printf("%d x %d = %d%n", i, j, resultado);
            }
            
            // Imprimir una línea en blanco para separar las tablas de multiplicar
            System.out.println();
        }
        
        sc.close();
  }
}