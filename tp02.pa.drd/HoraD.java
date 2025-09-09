
public class HoraD {
	
private int hora, minutos, segundos;
	
	public HoraD() {
		/* Misma modificacion "Hora" a "HoraD" */
		
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
	
		public static void main(String[] args) {
			
			/* Se debio crear el objeto "h3" para que muestre la hora */
			
			HoraD h1, h2, h3;
			h1 = new HoraD();
			h2 = new HoraD();
			
			/* Objeto creado "h3" */
			
			h3 = new HoraD();
			
			/* Mismo error, no existe el metodo "setearHora()", "setearMinutos()" */
			
//			h1.setearHora(12);
//			h1.setearMinutos(0);
//			h2.setearHora(17);
//			h2.setearMinutos(30);
			
			h1.setHora(12);
			h1.setMinutos(0);
			h2.setHora(17);
			h2.setMinutos(30);
			
			h1.imprimirHora();
			
			/* Anulados porque no existe el metodo invocado */
			
//			System.out.println(h2.consultarHora()+”:”+h2.consultarMinutos());
//			System.out.println(h3.consultarHora());
			
			/* Se imprimio con "getHora()" y "getMinutos()" */
			
			System.out.println(h2.getHora() + ":" + h2.getMinutos());
			System.out.println(h3.getHora());
			
		}
}
