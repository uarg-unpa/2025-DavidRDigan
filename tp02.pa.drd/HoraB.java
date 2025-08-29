
public class HoraB {
	/* Modificacion de nombre para prueba debbugin de la clase "Hora" */

	private int hora, minutos, segundos;
	
	public HoraB() {
		/* Misma modificacion "Hora" a "HoraB" */
		
		hora=0; minutos=0; segundos=0;
		}
		public void setHora(int h) {
		hora=h;
		}
		public void setMinutos(int m) {
		minutos=m;
		}
		public void setSegundos(int s) {
		segundos=s;
		}
		public void imprimirHora() {
		System.out.println(hora + ":" + minutos + ":" + segundos);
		}
		public int getHora() {
		return hora;
		}
		public int getMinutos() {
		return minutos;
		}
		
/* Ejercicio Tres numero (3) - b) */
		
		public static void main(String[] args) {
/* El argumento, "h2", no esta creado como objeto */
			HoraB h1, h2;
			h1 = new HoraB();
/* Crecion del objeto "h2" */
			h2 = new HoraB();
/* El error es de escritura "setearHora()" es "setHora()" */
//			h1.setearHora(9);
			h1.setHora(9);
/* El error es de escritura "setearMinutos()" deberia ser "setMinutos()" ademas de uso de entrecomillado en enteros */
//			h1.setearMinutos(“23”);
			h1.setMinutos(23);
			h1.imprimirHora();
/* Mismo error concurrente "setearHora()" no existe */
//			h2.setearHora(8);
			h2.setHora(8);
			h2.imprimirHora();
/* El metodo "consultarHora()" no existe */
//			System.out.println(h1.consultarHora());
			}
}