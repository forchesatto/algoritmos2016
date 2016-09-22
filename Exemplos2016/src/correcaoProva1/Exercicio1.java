package correcaoProva1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int g[] = new int[]{1,2,3,2,3,1,1,2,3,3,2,1,3};
		int resposta[] = new int[13];
		int i;
		Scanner sc = new Scanner(System.in);
		int continua = 1;
		while(continua == 1){
			System.out.println("Digite o número do cartão");
			int numero = sc.nextInt();
			int acertos = 0;
			for(i = 0; i<13;i++){
				System.out.println("Digite um número apostado");
				resposta[i] = sc.nextInt();
				if(resposta[i] == g[i]){
					acertos++;
				}
			}
			if(acertos == 13){
				System.out.println("Cartão"+numero+" Ganhou, Parabéns");
			} else {
				System.out.println("Cartão"+numero+"Acertou "+acertos);
			}
		}
		
		sc.close();
	}
}
