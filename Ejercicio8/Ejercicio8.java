// Hacer un algoritmo que determine la cantidad a pagar de N productos
import java.util.Scanner;

public class Ejercicio8 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        int cantidadProductos = 0;
        int totalPagar = 0;

        try {
            System.out.println("Ingresa la cantidad de productos");
            cantidadProductos = scanner.nextInt();

            for (int i = 1; i <= cantidadProductos; i++) {
                System.out.println("Ingresa la cantidad a pagar del producto "+i);
                totalPagar += scanner.nextInt();
            }

            System.out.println("El total a pagar por los "+cantidadProductos+" productos es: "+totalPagar);
        } finally {
            scanner.close();
        }
    }
}