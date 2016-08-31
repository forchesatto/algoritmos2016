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
		boolean naoAchou = true;
		for (i = 0; i < 5; i++) {
			naoAchou = true;
			x = 0;
			while(x<5 && naoAchou){
				if (i != x && a[i] == a[x]) {
					naoAchou = false;
				}
				x++;
			}
			if (naoAchou) {
				count++;
			}
		}
		System.out.printf("Total diferente: %d", count);
		sc.close();
	}
}
