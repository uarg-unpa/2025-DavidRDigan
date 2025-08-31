package ejerciciodosClases;

public class Triangulo {

	private int base;
	private int altura;
	private String clasificacion;
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String getClasificacion() {
		return clasificacion;
	}
	
	public void setClasificacion(String clasif) {
		this.clasificacion = clasif;
	}
	
	public static void main(String[] args) {
		
		Triangulo triUno = new Triangulo();
		
		triUno.setBase(5);
		triUno.setAltura(7);
		triUno.setClasificacion("isoceles");

		System.out.println("El trianguno uno tiene una base de: " +triUno.getBase()+ "cm");
		System.out.println(" y una altura de: "+triUno.getAltura()+"cm");
		System.out.println("Se clasifica como: "+triUno.getClasificacion());
	}
	
}
