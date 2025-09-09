
public class Hora {

	private int hora, minutos, segundos;
	
	public Hora() {
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
		
/* Ejercicio Tres numero (3) - a) */
		
		public static void main(String[] args) {
			Hora h1;
			h1 = new Hora();
			
			/* Error de tipeo  */
			
//			h1.setearHora();
			h1.setHora(2);
//			h1.setearMinutos(23);
			h1.setMinutos(23);
			h1.imprimirHora();
			}
}
