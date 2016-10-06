package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[5][5];
		int i, j = 0; // i = linha j = coluna
		// --> Inicio leitura de uma matriz
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		// -->Fim leitura
		int maior = a[0][0];
		int linhaMaior = 0;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if(a[i][j] > maior){
					maior = a[i][j];
					linhaMaior = i;
				}
			}
		}
		int menor = a[linhaMaior][0];
		for (i = 0; i < 5; i++) {
			if(a[linhaMaior][i] < menor){
				menor = a[linhaMaior][i];
			}
		}
		System.out.println("Minimax: "+menor);
		sc.close();
	}

}
