// Hacer un algoritmo que simule un reloj durante un dia.
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String args[]) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int hora;
		int minuto;
		int segundoss;
		System.out.println("Dame la hora");
		hora = scanner.nextInt();
		System.out.println("Dame los minutos");
		minuto = scanner.nextInt();
		System.out.println("Dame los segundos");
		segundoss = scanner.nextInt();

		try {
			while (hora<=23) {
				while (minuto<=59) {
					while (segundoss<=59) {
						System.out.println("");
						if (hora>9) {
							System.out.print(hora);
						} else {
							System.out.print("0"+hora);
						}

						if (minuto>9) {
							System.out.print(":"+minuto);
						} else {
							System.out.print(":0"+minuto);
						}

						if (segundoss>9) {
							System.out.print(":"+segundoss);
						} else {
							System.out.print(":0"+segundoss);
						}
						segundoss = segundoss+1;
						Thread.sleep(1000);
					}
					segundoss = 0;
					minuto = minuto+1;
				}
				minuto = 0;
				hora = hora+1;
			}
		} finally {
			scanner.close();
		}
	}
}