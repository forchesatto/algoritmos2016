package listaUfrgsVetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int TAM = 9;
		int vet[] = new int[TAM];
		int valor = -1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(valor < 0 && i < 9){
			System.out.println("Digite um valor positivo");
			valor = sc.nextInt();
			if(valor < 0){
				System.out.println("Erro: digite um valor positivo");
			} else {
				vet[i] = valor;
				valor = -1;
				i++;
			}
		}
		System.out.println("Valores letra A");
		for(i=0;i<9;i++){
			System.out.printf("vet[%d]=%d\n",i,vet[i]);
		}
		//b
		int aux[] = new int[9];
		for(i=0;i<9;i++){
			aux[i] = vet[i];
		}
		vet[0] = 0;
		for(i=1;i<9;i++){
			vet[i] = aux[i-1];
		}
		System.out.println("Valores letra B");
		for(i=0;i<9;i++){
			System.out.printf("vet[%d]=%d\n",i,vet[i]);
		}
		//c
		System.out.println("Valores letra C");
		for(i=0;i<9;i++){
			vet[i] = vet[i] + i;
			System.out.printf("vet[%d]=%d\n",i,vet[i]);
		}
		//d
		System.out.println("Digite um valor para ser pesquisado");
		int valorLido = sc.nextInt();
		int count = 0;
		for(i=0;i<9;i++){
			if(valorLido == vet[i]){
				count++;
			}
		}
		System.out.println(count+" Valores iguais");
		sc.close();
	}
}
