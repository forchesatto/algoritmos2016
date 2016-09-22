package correcaoProva1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int a[] = new int[6];
		int b[] = new int[6];
		int c[] = new int[6];
		int i = 0;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<6;i++){
			System.out.println("Digite valor para a");
			a[i] = sc.nextInt();
			System.out.println("Digite valor para b");
			b[i] = sc.nextInt();
		}
		int posc = 0;
		for(i=0;i<6;i++){
			boolean achou = false;
			int x = 0;
			while(x < 6 && achou == false){
				if(a[i] == b[x]){
					achou = true;
				}
				x++;
			}
			if(!achou){
				c[posc] = a[i];
				posc++;
			}
		}
		System.out.print("Valor a: ");
		for(i=0;i<6;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.print("Valor b: ");
		for(i=0;i<6;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println("");
		System.out.print("Valor c: ");
		for(i=0;i<6;i++){
			System.out.print(c[i]+" ");
		}


		sc.close();
	}
}
