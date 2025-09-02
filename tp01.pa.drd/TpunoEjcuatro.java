package casting;

import java.util.Scanner;

public class TpunoEjcuatro {

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int nro1;
			int nro2;
			int nro3;
			System.out.println("Ingrese 3 numeros enteros seguido de la tecla enter: ");
			nro1 = scanner.nextInt();
			nro2 = scanner.nextInt();
			nro3 = scanner.nextInt();
			if ((nro1>nro2 && nro1>nro3)) {
				System.out.println("El mayor es: "+nro1);
			} else {
				if ((nro2>nro1 && nro2>nro3)) {
					System.out.println("El mayor es: "+nro2);
				} else {
					System.out.println("El mayor es:"+nro3);
				}
			}
			
			scanner.close();
		}
	}