package HoraEjercicio;

public class Hora {
	
	private int hora;
	private int minutos;
	private int segundos;
//	private int hormin;
	/* Se encuentra anulado*/
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		if(hora >= 24) {
			hora = 0;
		}
		if(hora <= 0) {
			hora = 0;
		}
		this.hora = hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		if(minutos >= 60) {
			minutos = 00;
		} 
		if(minutos <= 0) {
			minutos = 00;
		}
		this.minutos = minutos;
	}
	
	public int getSegundos() {
		return segundos;
	}
	
	public void setSegundos(int segundos) {
		if(segundos >= 60) {
			segundos = 00;
		}
		if(segundos <= 0) {
			segundos = 00;
		}
		this.segundos = segundos;
	}

	// Anulado por ser una prueba
	// es
	
	/*	
	public int getHormin() {
		return hormin;
	}
	
	public void setHormin(int hormin) {
		this.hormin = this.getHora() * 60 + this.getMinutos();
	}
	
	*/
	
}