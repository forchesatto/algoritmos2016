package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int t[][] = new int[3][3];
		int i, j = 0; // i = linha j = coluna
		// --> Inicio leitura de uma matriz
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		// -->Fim leitura
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				t[i][j] = a[j][i];
			}
		}
		System.out.println("Matriz A");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d \t",a[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("Matriz T");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.printf("%d \t",t[i][j]);
			}
			System.out.println("");
		}
		
		sc.close();
	}

}
