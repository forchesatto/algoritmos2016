package listaUfrgsVetores;

public class Exercicio05 {

	public static void main(String[] args) {
		double a[] = {7.9,9.0,5.8,1.0,3.0};
		double maior = 0;
		for(int i=0;i<4;i++){
			double diferenca = a[i] - a[i+1];
			if(diferenca < 0){
				diferenca = diferenca * -1;
			}
			if(diferenca > maior){
				maior = diferenca;
			}
		}
		System.out.println("Maior diferença:"+maior);
	}
}
