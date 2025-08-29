
public class TpdosEjdos {
	
/* Para que la clase funcione, se anido con "static" */
	
	static class Libro {
		
		String titulo;
		int paginas;
		int copias;
		
		public Libro(String titulo, int paginas, int copias) {
			this.titulo = titulo;
			this.paginas = paginas;
			this.copias = copias;
		}
		
	}
	
	static class Curso{
		
/* El tipo "boolean", requiere de un metodo para que devuelva "Si", en vez de "true" */
		
		boolean certificado;
		int costo;
		String materiales;
		
		public Curso(boolean certificado, int costo, String materiales) {
			this.certificado = certificado;
			this.costo = costo;
			this.materiales = materiales;
		}
		
	}
	
	static class Mascota{
		
		String alimento;
		double peso;
		boolean guarida;
		
		public Mascota(String alimento, double peso, boolean guarida) {
			this.alimento = alimento;
			this.peso = peso;
			this.guarida = guarida;
		}
		
	}
	
	static class Triangulo{
		
		int base;
		int altura;
		String tipo;
		
		public Triangulo(int base, int altura, String tipo) {
			this.base = base;
			this.altura = altura;
			this.tipo = tipo;
			
		}
		
	}
	
	public static void main(String[] args) {
		
/* Se realizo la creacion de cuatro objetos distintos */
		
		Libro lib1 = new Libro("Manual de ingenieria",418,2);
		Curso cur1 = new Curso(true,250,"libros");
		Mascota masc1 = new Mascota("Hierbas",2.3,true);
		Triangulo tri1 = new Triangulo(45,23,"isoceles");
		
		System.out.println("[" + lib1.titulo + "] paginas: " + lib1.paginas + " - Copias disponibles: " + lib1.copias);
		System.out.println("Certificacion: " + cur1.certificado + " - Costo: u$s" + cur1.costo + "- Los materiales son: " + cur1.materiales);
		System.out.println("La mascota come: " + masc1.alimento + " y tiene un peso de: " + masc1.peso + "kg, Tiene guarida?: " + masc1.guarida);
		System.out.println("El triangulo tiene una base de: " + tri1.base + "cm y su altura es: " + tri1.altura + "cm, del tipo: " + tri1.tipo);
	}

}
