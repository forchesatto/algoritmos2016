package listaUfrgsVetores;

public class Exercicio04 {

	public static void main(String[] args) {
		int TAM = 10;
		int x[] = {7,9,5,1,3,15,21,13,6,29};
		int y[] = {7,10,5,9,23,27,31,39,6,17};
		int it[] = new int[10];
		int un[] = new int[20];
		int posicaoIt = 0;
		for(int i=0;i<TAM;i++){
			for(int w=0;w<TAM;w++){
				if(x[i] == y[w]){
					it[posicaoIt] = x[i];
					posicaoIt++;
					break;
				}
			}
		}
		System.out.println("Intersecção");
		for(int i=0;i<10;i++){
			System.out.println("it["+i+"]="+it[i]);
		}
		int posicaoUn = 0;
		for(int i=0;i<TAM;i++){
			boolean achou = false;
			for(int w=0;w<20;w++){
				if(x[i] == un[w]){
					achou = true;
				}
			}
			if(!achou){
				un[posicaoUn] = x[i];
				posicaoUn++;
			}
			achou = false;
			for(int w=0;w<20;w++){
				if(y[i] == un[w]){
					achou = true;
				}
			}
			if(!achou){
				un[posicaoUn] = y[i];
				posicaoUn++;
			}
		}
		System.out.println("União");
		for(int i=0;i<20;i++){
			System.out.println("uj["+i+"]="+un[i]);
		}
	}
}
