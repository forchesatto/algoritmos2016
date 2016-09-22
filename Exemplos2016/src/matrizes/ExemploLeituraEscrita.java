package matrizes;

import java.util.Scanner;

public class ExemploLeituraEscrita {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		int i,j;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.printf("Digite o valor para [%d][%d]"
						,i,j);
				a[i][j] = sc.nextInt();
			}
		}
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.printf("Valor digitado:[%d][%d]=%d\n"
						,i,j,a[i][j]);
			}
		}
		sc.close();
	}
}
