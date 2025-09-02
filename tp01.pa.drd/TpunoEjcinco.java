package casting;

import java.util.Scanner;

public class TpunoEjcinco {
		
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			
			String day;
			
			System.out.println("Indicar el dia para saber si hay resolución en una sola letra mayuscula: ");
			
			day = scanner.nextLine();
			
			switch (day) {
		      case "L":
		        System.out.println("El Lunes hay Resolucion");
		        break;
		      case "M":
		        System.out.println("El Martes hay Resolucion");
		        break;
		      case "I":
		        System.out.println("El Miercoles hay Resolucion");
		        break;
		      case "J":
		        System.out.println("El Jueves hay Resolucion");
		        break;
		      case "V":
		        System.out.println("No hay clases de resolucion");
		        break;
		      case "S":
		        System.out.println("No hay clases de resolucion");
		        break;
		      case "D":
		        System.out.println("No hay clases de resolucion");
		        break;
	default:
		  System.out.println("Valor invalido");
		    }
			scanner.close();
		}
	}
