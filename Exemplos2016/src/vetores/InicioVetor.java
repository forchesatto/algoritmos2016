package vetores;

import java.util.Scanner;

public class InicioVetor {

	public static void main(String[] args) {
		//Vetor com tamanho de 4 posições
		int a[] = new int[4];
		//Primeira maneira de popular o vetor
		//0,1,2,3 serão os indices do vetor,
		//ou seja a posição do valor no vetor.
		a[0] = 10; // armazena o número 10 no indice 0
		a[1] = 11; // armazena o número 11 no indice 1
		a[2] = 28; // armazena o número 28 no indice 2
		a[3] = 30; // armazena o número 30 no indice 3
		
		// Usando um for para buscar os valores do vetor
		for(int i=0;i<4;i++){
			//i é o indice do vetor. 0,1,2,3
			System.out.println("a["+i+"]= "+a[i]);
		}
		
		//Cria um vetor com 5 posições já com valores iniciais.
		int b[] = new int[]{-10,-15,-30,-1,-8};
		//b[0] = 10;
		//b[1] = 15;
		//b[2] = 30;
		//b[3] = 1;
		//b[4] = 8;
		int maior = b[0];
		for(int i=1;i<5;i++){
			if(b[i] > maior){
				maior = b[i];
			}
		}
		System.out.println("Maior = "+maior);
		
		//Ler valores digitados pelo usuário
		//Inicia a leitura do teclado
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<4;i++){
			System.out.println("Digite um número");
			a[i] = sc.nextInt();//Ler um valor inteiro
		}
		//Imprime os valores digitados
		for (int i = 0; i < 4; i++) {
			System.out.println("Valor digitado:"+a[i]);
		}
		//Fecha a leitura do teclado
		sc.close();
	}
}
