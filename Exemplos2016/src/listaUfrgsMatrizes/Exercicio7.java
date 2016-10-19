package listaUfrgsMatrizes;

public class Exercicio7 {

	public static void main(String[] args) {
		final int TAML = 12;
		final int TAMC = 13;
		
		int a[][] = new int[TAML][TAMC];
		
		for(int i =0; i<TAML; i++){
			int maior = a[i][0];
			for(int j =0; j<TAMC; j++){
				if(a[i][j] > maior){
					maior = a[i][j];
				}
			}
			for(int j =0; j<TAMC; j++){
				a[i][j] = a[i][j]/maior;
			}
		}
	}
}
