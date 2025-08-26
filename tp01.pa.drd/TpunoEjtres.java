package casting;

import java.util.Scanner;

public class TpunoEjtres {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a;
			int aux;
			int b;
			int c;
			System.out.println("Indicar el valor de a: ");
			a = scanner.nextInt();
			System.out.println("Indicar el valor de b: ");
			b = scanner.nextInt();
			System.out.println("Indicar el valor de c: ");
			c = scanner.nextInt();
			aux = c;
			c = a;
			b = a;
			a = aux;
			System.out.println("El valor de a ahora es: "+a);
			System.out.println("El valor de b ahora es: "+b);
			System.out.println("El valor de c ahora es: "+c);

			scanner.close();
		}
	}