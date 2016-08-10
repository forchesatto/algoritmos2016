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
public class ExercicioE {

	public static void main(String[] args) {
		final int TAM_VET = 6;
		int a[] = new int[TAM_VET];
		int b[] = new int[TAM_VET];
		int c[] = new int[TAM_VET];
		int d[] = new int[TAM_VET];

		int i = 0;
		Scanner sc = new Scanner(System.in);
		int x = 0, y = 0;
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
			System.out.println("Digite um valor para b:");
			b[i] = sc.nextInt();
			// usando um for com if
			if (i % 2 == 0) {
				d[x] = a[i];
				x++;
				d[x] = b[i];
				x++;
			} else {
				c[y] = a[i];
				y++;
				c[y] = b[i];
				y++;
			}
		}
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		sc.close();
	}
}
