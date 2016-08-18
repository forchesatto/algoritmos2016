package vetores;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		final int TAM_VET = 5;
		int a[] = new int[TAM_VET];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < TAM_VET; i++) {
			System.out.println("Valor A:");
			a[i] = sc.nextInt();
		}
		System.out.println("Digite o valor a ser pesquisado:");
		int valorProcurado = sc.nextInt();
		for(i=0;i<TAM_VET;i++){
			if(a[i]==valorProcurado){
				System.out.println("Encontrao na posição "+i);
				break;
			}
		}
		//outra solução
		int posicaoEncontrada = -1;
		while(posicaoEncontrada == -1 || i<TAM_VET){
			if(a[i]==valorProcurado){
				posicaoEncontrada = i;
				System.out.println("Encontrao na posição "+i);
			}
			i++;
		}
		
		sc.close();
		
	}
}
