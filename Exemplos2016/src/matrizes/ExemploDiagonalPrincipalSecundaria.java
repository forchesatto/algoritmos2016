package matrizes;

import java.util.Scanner;

public class ExemploDiagonalPrincipalSecundaria {

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
		int x = 2;
		for(i=0;i<3;i++){
			System.out.println("Diagonal p:"+a[i][i]);
			System.out.println("Diagonal s:"+a[i][x]);
			x--;
		}
		
		
		sc.close();
	}
}
