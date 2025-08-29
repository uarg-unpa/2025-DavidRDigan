package casting;

import java.util.Scanner;

public class TpunoEjseisA {
		
		public static void main(String[] args) {
			
/* Observe que no hay diferencias en (String[] args) o (String args[]) */
					
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Indique tres numeros consecutivos con tecla enter: ");
			
/* El codigo parace insuficiente, hasta que teclea "Enter" */
			
			int num1 = entrada.nextInt();
			int num2 = entrada.nextInt();
			int num3 = entrada.nextInt();
			
			entrada.close();
			
/* No se si hay que limpiar el buffer */
			
			int prod = num1 * num2 * num3;
			
			int suma = num1 + num2 + num3;
			
			System.out.println("La suma de los numeros es: "+ suma);

			System.out.println("El producto es: "+ prod);
		}
		
}