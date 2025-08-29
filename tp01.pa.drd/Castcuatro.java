package casting;

public class Castcuatro {
	
public static void main(String[] args) {
		
		int A = 5;
		int B = 2;
		final double C = 2.5;
		final double D = 2.0;
		
		int R1;
		double R2;
		
		R1 = A*(int)D;
		B = A++;
		
		System.out.println("Resultados R1: "+(R1)+" Resultado de A++: "+(A++));
		System.out.println("Resultado de B: "+(B));

	}
}
