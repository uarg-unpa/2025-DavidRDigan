package casting;

import java.util.Scanner;

public class TpunoEjseisB {

		public static void main(String args[]) {
			
/* En este ejercicio se puede ver "..args[])" sin que difiera */
			
			Scanner entrada = new Scanner(System.in);
			
			int producto;
			int suma;
			int cont;
			
			producto = 1;
			suma =0;
			cont=1;
			
			System.out.println("Indique los valores y aprete la tecla enter: ");

/* Este ejercicio no indica con respecto a numero negativos */
			
			while (cont <= 3) {
				int num= entrada.nextInt();
				suma = suma + num;
				producto = producto * num;
				cont = cont +1;
			}
			
/* Como tampoco si se debe evaluar las multiplicaciones por cero */
			
			entrada.close();
			System.out.println("La suma de los numeros es: " + suma);
			System.out.println("El producto de los numeros es: " + producto);
		}
		
		
}