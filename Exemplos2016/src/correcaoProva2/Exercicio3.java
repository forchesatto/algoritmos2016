package correcaoProva2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int a[][] = new int[5][5];
		int i = 0, j = 0;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("Digite um valor");
				a[i][j] = sc.nextInt();
			}
		}
		boolean unico = true;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				unico = true;
				for (int x = 0; x < 5; x++) {
					for (int y = 0; y < 5; y++) {
						if(a[i][j] == a[x][y] 
								&& (i!=x || j!=y)){
							unico = false;
							break;
						}
					}
				}
				if(unico == true){
					System.out.println("Valor "
							+a[i][j]+" é único");
				}
			}
		}
		
		sc.close();
	}
}
