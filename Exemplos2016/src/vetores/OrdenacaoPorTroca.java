package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoPorTroca {

	public static void main(String[] args) {
		final int TAM_VET = 5;
		int a[] = new int[TAM_VET];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Valor A:");
			a[i] = sc.nextInt();
		}
//		for(i=0;i<TAM_VET;i++){
//			for(int j=i+1;j<TAM_VET;j++){
//				if(a[i] > a[j]){
//					int aux = a[i];
//					a[i] = a[j];
//					a[j] = aux;
//				}
//			}
//		}
		//Ordenação de um vetor
		Arrays.sort(a);
		//Busca em um vetor
		int posicao = Arrays.binarySearch(a, 1);
		
		for(i=0;i<TAM_VET;i++){
			System.out.println(a[i]);
		}
		sc.close();
	}
	
}
