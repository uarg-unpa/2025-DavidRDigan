
public class HoraC {

private int hora, minutos, segundos;
	
	public HoraC() {
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
		
		public static void main(String[] args) {
			
			/* No existe el objeto h3 */
			
			HoraC h1, h2, h3;
			
			/* El tipo "char" es incompatible con el valor "int" de la "clase HoraC" */
			
//			char valor;
			int aux;
			
			h1 = new HoraC();
			h2 = new HoraC();
			
			/* Se agrega el objeto "h3" */
			
			h3 = new HoraC();
			
			
//			System.out.println(h2.consultarHora());
			/* Se anulo el argumento porque no existe el metodo "consultarHora()" */
//			h1.setearHora(3);
			
			/* El Setter Minutos solo soporta la inclusion de un valor en su varaible */
			
//			h1.setearMinutos(4, 5);
//			h2.setearHora(11);
//			h2.setearH(23);
			
			/* Valores corregidos */
			
			h1.setHora(3);
			h1.setMinutos(5);
			
			/* El objeto "h2" tiene dos valores y el ultimo es el que queda */
			
			h2.setHora(11);
			h2.setHora(23);
			
			/* La inexistencia de "consultarHora()" como metodo cae en error */
			
//			valor=h1.consultarMinutos();
			
//			aux=h2.consultarHora();
			
			/* Para que funcione el auxiliar se le indico que tome la hora del objeto "h2" */
			
			aux = h2.getHora();
			
			h1.imprimirHora();
			h2.imprimirHora();
			System.out.println(aux);
			
			/* El objeto "h3" tampoco puede utilizar un metodo inexistente */
			
//			h3.consultaHora();
			}
}
