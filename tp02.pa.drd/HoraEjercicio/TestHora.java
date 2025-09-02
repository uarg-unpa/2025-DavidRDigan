package HoraEjercicio;

import java.time.*;

/* Java tiene un paquete para el formato hora pero los convierte en "String" */
// import java.time.format.DateTimeFormatter;

public class TestHora {

	/* El mismo no funciono para concatenar el doble "00" para imprimir en pantalla un valor nulo */
//	static String zeros  = String.format(":%02d", 00);
	
	public static void main(String[] args) {
		
		Hora horun = new Hora();
		Hora hordo = new Hora();
		
		horun.setHora(22);
		horun.setMinutos(-2);
		horun.setSegundos(22);
		
		hordo.setHora(23);
		hordo.setMinutos(3);
		hordo.setSegundos(45);
		
		int hormin = horun.getHora() * 60 + horun.getMinutos();
		int hormindo = hordo.getHora() * 60 + hordo.getMinutos();
		
		LocalTime horas = LocalTime.now().withNano(0);
		LocalTime horda = LocalTime.now().withNano(0);
		LocalTime horauno = horas.withHour(horun.getHora()).withMinute(horun.getMinutos()).withSecond(horun.getSegundos());
		LocalTime hordos = horda.withHour(hordo.getHora()).withMinute(hordo.getMinutos()).withSecond(hordo.getSegundos());
		
		System.out.println("Hora defindida por un paquete importado: " +horauno +" y en minutos: " + hormin);
		System.out.println("Segundo objeto Hora: " + hordos +" y en minutos: " + hormindo);
		
		}
}
