package casting;

public class TpunoEjdosB {
	
	public static void main(String[] args) {
		
		int A,B,X;
		double C, D, Y;
		
		A = 5;
		B = 3;
		C = 7.5;
		D = 2.0;
		
		X = (int)(A*D)/(int)(C/A);
		Y = (double)A/B;
		
		System.out.println("Resultado de X: "+(X)+" Resultado de Y: "+(Y));		
	}

}
