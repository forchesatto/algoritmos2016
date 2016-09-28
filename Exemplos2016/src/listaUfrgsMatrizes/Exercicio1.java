package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int a[][] = new int[6][3];
		int maiorLinha[] = new int[6];
		int i, j;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<6;i++){
			for(j=0;j<3;j++){
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		//a
		for(i=0;i<6;i++){
			for(j=0;j<3;j++){
				if(a[i][j] > maiorLinha[i]){
					maiorLinha[i] = a[i][j];
				}
			}
		}
		for(i=0;i<6;i++){
			System.out.printf("Maior da linha [%d] = %d \n"
					,i,maiorLinha[i]);
		}
		//b
		sc.close();
	}
}
