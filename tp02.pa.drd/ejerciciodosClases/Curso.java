package ejerciciodosClases;

public class Curso {

	private boolean certificado;
	private int costo;
	private String materiales;
	
	public boolean getCertificado() {
		return certificado;
	}
	
	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}
	
	public int getCosto() {
		return costo;
	}
	
	public void setCosto(int costo) {
		this.costo = costo;
	}
	
	public String getMateriales() {
		return materiales;
	}
	
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	
	public static void main(String args[]) {
		
		Curso curprim;
		curprim = new Curso();
		
		curprim.setCertificado(true);
		curprim.setCosto(250);
		curprim.setMateriales("libros");
		
		System.out.println("El cusro tiene un costo de: u$s"+ curprim.getCosto());
		System.out.println("Los materiales para el curso son: "+curprim.getMateriales());
		
		if(curprim.getCertificado() == true) {
			System.out.print("Es Certificado");
		} else {
			System.out.print("No tiene certificado");
		}
	}
}
