package vetores;

import java.util.Scanner;

/**
 * Ler um vetor A com 10 elementos positivos. Construir um vetor B de mesmo tipo
 * e dimensão, e cada elemento do vetor B deve ser o valor negativo do elemento
 * correspondente do vetor A. Desta forma, se em B[1] o valor –8, e assim por
 * diante. Apresentar os elementos do vetor B.
 * 
 * @author forchesatto
 *
 */
public class ExercicioD {

	public static void main(String[] args) {
		final int TAM_A = 10;
		final int TAM_B = 10;
		int a[] = new int[TAM_A];
		int b[] = new int[TAM_B];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_A; i++) {
			System.out.println("Digite um valor para a:");
			a[i] = sc.nextInt();
			b[i] = a[i] * -1;
		}
		for (i = 0; i < TAM_A; i++) {
			System.out.println("[" + i + "] = " + b[i]);
		}
		sc.close();
	}
}
