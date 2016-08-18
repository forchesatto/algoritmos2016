package listaUfrgsVetores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int a[] = new int[5], i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 5; i++) {
			System.out.println("Digite valor para a");
			a[i] = sc.nextInt();
		}
		int count = 0, x=0;
		int naoAchou = 1;
		for (i = 0; i < 5; i++) {
			naoAchou = 1;
			x = 0;
			while(x<5 && naoAchou == 1){
				if (i != x && a[i] == a[x]) {
					naoAchou = 0;
				}
				x++;
			}
			if (naoAchou == 1) {
				count++;
			}
		}
		System.out.printf("Total diferente: %d", count);
		sc.close();
	}
}
