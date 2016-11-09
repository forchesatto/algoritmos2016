package correcaoProva2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int i = 0, j = 0, dp = 1, ds = 1, ids = 4;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		for(i = 0; i <5; i++){
			dp *= a[i][i];
			ds *= a[i][ids];
			ids--;
		}
		int determinante = dp - ds;
		System.out.println("determinante: "+determinante);
		sc.close();
	}
}
