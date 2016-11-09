package correcaoProva2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int b[][] = new int[5][5];
		int i = 0, j = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if ((i + j) % 2 == 0) {
					//é par
					b[i][j] = a[i][j];
				} else {
					b[i][j] = 0;
				}
			}
		}
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if(b[i][j] != 0){
					System.out.println(b[i][j]);
				}
			}
		}
		sc.close();
	}
}
