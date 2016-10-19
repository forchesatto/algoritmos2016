package listaUfrgsMatrizes;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		int lugar[][] = new int[20][15];
		Scanner sc = new Scanner(System.in);
		int continua = 1;
		int fila = 0;
		int poltrona = 0;
		int countOcupado = 0;
		while(continua == 1){
			System.out.println("Qual é a fila");
			fila = sc.nextInt();
			System.out.println("Qual é a poltrona");
			poltrona = sc.nextInt();
			if(lugar[fila][poltrona] == 1){
				System.out.println("Lugar já ocupado");
			} else {
				lugar[fila][poltrona] = 1;
				countOcupado++;
			}
			System.out.println("Deseja continua (1sim/0nao)");
			continua = sc.nextInt();
		}
		System.out.println("Ocupação total:"+countOcupado);
		System.out.println("Vagos total:"+(300-countOcupado));
		
		for(int i=0;i<20;i++){
			for(int j=0;j<15;j++){
				System.out.print(lugar[i][j]+"\t");
			}
			System.out.println("");
		}
		sc.close();
	}
}
