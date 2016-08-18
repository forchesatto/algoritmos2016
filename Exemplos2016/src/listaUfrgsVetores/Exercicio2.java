package listaUfrgsVetores;

import java.util.Scanner;

/**
 * Fazer um programa que leia dois vetores A e B, com tamanho 8, e realize a
 * troca dos elementos destes vetores; ou seja, após a execução do programa o
 * vetor B deverá conter os valores fornecidos para o vetor A, e vice-versa.
 * 
 * @author forchesatto
 *
 */
public class Exercicio2 {
	public static void main(String[] args) {
		final int TAM_VET = 8;
		int a[] = new int[TAM_VET];
		int b[] = new int[TAM_VET];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Valor A:");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Valor B:");
			b[i] = sc.nextInt();
		}
		int aux;
		for (i = 0; i < TAM_VET; i++) {
			aux = a[i];
			a[i] = b[i];
			b[i] = aux;
		}
		for (i = 0; i < TAM_VET; i++) {
			System.out.printf("Valor B[%d]=%d",i,b[i]);
			System.out.printf("Valor A[%d]=%d",i,a[i]);
		}
		
		sc.close();
	}
}
