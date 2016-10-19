package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio6 {

	/*
	 * Valores da matriz
	 * 
	 * 7		9	10	15	17
	 * 8		13	11	6	1
	 * 1		2	10	5	3
	 * 6		8	17	22	6
	 * 5		0	14	1	4
	 */
	
	public static void main(String[] args) {
		int m[][] = new int[5][5];
		int i = 0, j=0;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				m[i][j]= sc.nextInt();
			}
		}
		//1
		float soma = 0;
		for(i=1;i<4;i++){
			for(j=1;j<4;j++){
				soma += m[i][j];
				count++;
			}
		}
		System.out.println("1 média = "+soma/count);
		//2
		soma = 0;
		count = 0;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if(i == j || j == 0 || j == 4){
					soma += m[i][j];
					count++;
				}
			}
		}
		System.out.println("2 média = "+soma/count);
		//3
		soma = 0;
		count = 0;
		int fimPar = 2;
		int fim = 1;
		for(i=0;i<5;i++){
			if(i%2==0){
				fim = ++fimPar;
			} else {
				fim = 1;
			}
			for(j=0;j<fim;j++){
					soma += m[i][j];
					count++;
			}
		}
		sc.close();
		System.out.println("3 média = "+soma/count);
		//4
		for(i = 0; i<4; i++){
			for(j=i+1; j<5; j++){
				soma += m[i][j];
				count++;
			}
		}
		System.out.println("4 média = "+soma/count);
		//5
		fim = 5;
		for(i = 0; i<4; i++){
			fim--;
			for(j=0; j<fim; j++){
				soma += m[i][j];
				count++;
			}
		}
		System.out.println("5 média = "+soma/count);
	}
}
