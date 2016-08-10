package vetores;

import java.util.Scanner;

/**
 * Ler 6 elementos (valores inteiros) para a A e B. Construir os vetores C e D
 * de mesmo tipo . o vetor C deve ser formada pelos elementos de índice impar
 * das matrizes A e B, e o vetor D deve ser formada pelos elementos de índice
 * par dos vetores A e B. Apresentar os vetores C e D.
 * 
 * @author forchesatto
 *
 */
public class ExercicioE2 {

	public static void main(String[] args) {
		final int TAM_VET = 6;
		int a[] = new int[TAM_VET];
		int b[] = new int[TAM_VET];
		int c[] = new int[TAM_VET];
		int d[] = new int[TAM_VET];

		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
			System.out.println("Digite um valor para b:");
			b[i] = sc.nextInt();
		}
		for (i = 0; i < TAM_VET; i += 2) {
			d[i] = a[i];
			d[i + 1] = b[i];
		}

		for (i = 0; i < 5; i += 2) {
			c[i] = a[i + 1];
			c[i + 1] = b[i + 1];
		}

		for (i = 0; i < TAM_VET; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}

		int soma = 0;
		for (i = 0; i < TAM_VET; i++) {
			soma += c[i];
		}
		System.out.println(soma);
		for (int valor : c) {
			soma += valor;
		}
		System.out.println(soma);

		sc.close();
	}
}
