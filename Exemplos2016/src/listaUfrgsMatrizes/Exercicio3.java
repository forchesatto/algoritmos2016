package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int resultado[][] = new int[8][3];
		int i, j = 0; // i = linha j = coluna
		// --> Inicio leitura de uma matriz
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		// -->Fim leitura
		int x = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (a[i][j] != 0) {
					resultado[x][0] = a[i][j];
					resultado[x][1] = i;
					resultado[x][2] = j;
					x++;
				}
			}
		}

		for (i = 0; i < 8; i++) {
			System.out.printf("Valor = %d Linha = %d Coluna = %d \n", resultado[i][0], resultado[i][1],
					resultado[i][2]);
		}
		sc.close();
	}

}
