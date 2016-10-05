package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Declaração de uma matriz 4 X 4
		int a[][] = new int[4][4];
		int pares[] = new int[8];
		int i, j = 0; //i = linha j = coluna
		//--> Inicio leitura de uma matriz
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		//-->Fim leitura
		//--> Valores da linha com indice par 
		int x = 0;
		for (i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < 4; j++) {
					pares[x] = a[i][j];
					x++;
				}
			}
		}
		//-->fim valores indice par
		int somaDiagonal[] = new int[4];
		x = 3;
		for (i = 0; i < 4; i++) {
			somaDiagonal[i]=a[i][i] + a[i][x];
			x--;
		}
		for(i =0; i<4;i++){
			System.out.println(somaDiagonal[i]);
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
}
