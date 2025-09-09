package casting;

public class Castdos {
	
	public static void main(String[] args) {
		
		final int A = 5;
		final int B = 2;
		final double C = 2.5;
		final double D = 2.0;
		
		int R1;
		double R2;
		
		R1 = A*(int)D;
		R2 = A*D;
		
		System.out.println("Resultados R1: "+(R1)+" Resultado R2: "+(R2));
		
	}

}