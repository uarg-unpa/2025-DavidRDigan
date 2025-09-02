package ejerciciodosClases;

public class Libro {
	
	private String titulo;
	private int paginas;
	private int copias;
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public int getPaginas() {
			return paginas;
		}
		
		public void setPaginas(int paginas) {
			this.paginas = paginas;
		}
		
		public int getCopias() {
			return copias;
		}
		
		public void setCopias(int copias) {
			this.copias = copias;
		}
	
	public static void main(String[] args) {
		
		Libro libUno = new Libro();
		
		libUno.setTitulo("Manual de ingenieria");
		libUno.setPaginas(456);
		libUno.setCopias(2);
		
		System.out.println("Titulo del libro: "+ libUno.getTitulo() + " de: " +libUno.getPaginas()+ " paginas, con existencia de: "+ libUno.getCopias()+" copias.");
	}
}
