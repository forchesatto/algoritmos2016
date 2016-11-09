package correcaoProva2;

public class Exercicio4 {
	public static void main(String[] args) {

		int a[] = new int[10];
		int b[] = new int[10];
		int c[][] = new int[10][3];
		
		for(int i =0; i<10; i++){
			c[i][0] = a[i] * b[i];
			c[i][1] = a[i] + b[i];
			c[i][2] = a[i] / b[i];
		}
		
		
	}
}
