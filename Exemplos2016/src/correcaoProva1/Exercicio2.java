package correcaoProva1;

public class Exercicio2 {
	public static void main(String[] args) {
		final int TAM_VET = 10;
		int a[] = new int[TAM_VET];
		int i = 0;
		for(i=0;i<TAM_VET;i++){
			for(int j=i+1;j<TAM_VET;j++){
				if(a[i] > a[j]){
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		System.out.printf("Maiores: %d, %d, %d",a[7], a[8], a[9]);
	}
}
