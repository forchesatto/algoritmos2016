package vetores;

import java.util.Scanner;

/**
 * Ler dois vetores A e B com 15 elementos cada. Construir um vetor C, sendo
 * esta a junção dos outros dois vetores. Desta forma, C deve ter o dobro de
 * elementos, ou seja, 30. Apresentar o vetor C.
 * 
 * @author forchesatto
 *
 */
public class ExercicioB {

	public static void main(String[] args) {
		int a[] = new int[15];
		int b[] = new int[15];
		int c[] = new int[30];
		int i = 0;

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < 15; i++) {
			System.out.println("Digite um valor para b:");
			b[i] = sc.nextInt();
		}
		for (i = 0; i < 15; i++) {
			c[i] = a[i];
			c[i + 15] = b[i];
		}

		for (i = 0; i < 30; i++) {
			System.out.println("[" + i + "] = " + c[i]);
		}

		sc.close();
	}
}
