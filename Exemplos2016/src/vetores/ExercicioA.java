package vetores;

import java.util.Scanner;

/**
 * Ler 8 elementos em vetor A. Construir uma vetor B com os elementos do vetor A
 * multiplicados por 3. O elemento B[1] deve ser implicado pelo elemento A[1]*3.
 * o elemento B[2] implicado pelo elemento A[2]*3 e assim por diante, até 8.
 * Apresentar o vetor B.
 * 
 * @author forchesatto
 *
 */
public class ExercicioA {

	public static void main(String[] args) {
		int a[] = new int[8];
		int b[] = new int[8];
		int i = 0;

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 8; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
			b[i] = a[i] * 3;
		}
		for (i = 0; i < 8; i++) {
			System.out.println("B=" + b[i]);
		}
		sc.close();
	}
}
