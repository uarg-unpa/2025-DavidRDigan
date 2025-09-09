
/* Clase Televisor */

public class Televisor {
	
	private int volumen;
	private int subirVol;
	private int bajarVol;
	private boolean encender;
	private boolean apagar;
	private int volvCanal;
	private int canal = 1;
	private int aux;

	/* Constructor */
	
		public boolean getEncender() {
			return encender;
		}
	
		public void setEncender() {
			if(encender == false) {
				System.out.print("Stand by");
			}
			this.encender = true;
		}
		
		public boolean getApagar() {
			return apagar;
		}
		
		public void setApagar() {
			if(apagar == true)
				System.out.print("Apagando");
			this.apagar = true;
		}
		
		public int getCanal() {
			aux = canal;
			return canal;
		}
		
		public void setCanal(int cana) {
			this.canal = cana;
		}
		
		public int getVolvCanal() {
			return volvCanal;
		}
		
		public void setVolvCanal(int aux) {
			System.out.print("Canal anterior:" + aux);
			this.volvCanal = aux;
		}
	
		public int getVolumen() {
			return volumen;
		}
		
		/* Con indicador de "Silenciado" y "volumen maximo" */
		
		public void setVolumen(int volum) {
			
			if(volumen < 1) {
				System.out.println("Silenciado");
			}
			if(volumen > 10) {
				System.out.println("Volumen maximo");
			}
			this.volumen = volum;
		}
		
		public int getBajarVol() {
			return bajarVol;
		}
		
		/* Condicion de ser distinto de cero */
		
		public void setBajarVol(int bajarvolv) {
			if(volumen != 0) {
				volumen = volumen -1;
		} else {
					System.out.print("Volumen 0");
					}
			bajarvolv = volumen;
			this.bajarVol = bajarvolv;
		}
		
		public int getSubirVol() {
			return subirVol;
		}
		
		/* Condicion de maximo 10 en volumen */
		
		public void setSubirVol(int subirvolv) {
			if(volumen >= 10) {
				System.out.print("Maximo 10");
			} else {
				volumen = volumen +1;
			}
			subirvolv = volumen;
			this.subirVol = subirvolv;
		}
}