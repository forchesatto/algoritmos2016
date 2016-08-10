package vetores;

import java.util.Scanner;

/**
 * Ler dois vetores, sendo A com 20 elementos e B com 30 elementos. Construir um
 * vetor C, sendo esta a junção dos dois outros vetores. Desta forma, C deve
 * ter a capacidade de armazenar 50 elementos. Apresentar o vetor C.
 * 
 * @author forchesatto
 *
 */
public class ExercicioC {

	public static void main(String[] args) {
		final int TAM_A = 20;
		final int TAM_B = 30;
		final int TAM_C = 50;
		int a[] = new int[TAM_A];
		int b[] = new int[TAM_B];
		int c[] = new int[TAM_C];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_A; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < TAM_B; i++) {
			System.out.println("Digite um valor para b:");
			b[i] = sc.nextInt();
		}
		for (i = 0; i < TAM_A; i++) {
			c[i] = a[i];
		}
		for (i = 0; i < TAM_B; i++) {
			c[i + TAM_A] = b[i];
		}
		for (i = 0; i < TAM_C; i++) {
			System.out.println("[" + i + "] = " + c[i]);
		}
		sc.close();
	}
}
