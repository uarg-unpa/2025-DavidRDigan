package ejerciciodosClases;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int curso;
	private char curdiv;
	private boolean comedor;
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getCurso() {
		return curso;
	}
	
	public void setCurso(int curs) {
		this.curso = curs;
	}
	
	public char getCurdiv() {
		return curdiv;
	}
	
	public void setCurdiv(char curdiv) {
		this.curdiv = curdiv;
	}
	
	public boolean getComedor() {
		return comedor;
	}
	
	public void setComedor(boolean comedor) {
		this.comedor = comedor;
	}
	
	public static void main(String[] args) {
		
		
		Alumno alumUno = new Alumno();
		
		alumUno.setNombre("Alejandro");
		alumUno.setApellido("Zupreti");
		alumUno.setCurso(5);
		alumUno.setCurdiv('B');
		alumUno.setComedor(true);
		
		System.out.println("El alumno se llama: " + alumUno.getNombre());
		System.out.println("y su apellido es: " + alumUno.getApellido());
		System.out.println("Cursa en: " + alumUno.getCurso()+"'"+alumUno.getCurdiv()+"'");
		
		/* Prueba de tipo booleano para indicar si tiene o no comedor */
		
		if(alumUno.getComedor() == true) {
			System.out.print("Tiene comedor");
		} else {
			System.out.print("No va al comedor");
		}
		
	}
}