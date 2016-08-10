package vetores;

public class Exemplo01 {

	//main método principal mesma função main do C.
	public static void main(String[] args) {
		//Escreve no console e pula 1 linha.
		System.out.println("Olá mundo");
		//Declaração de variáveis
		int a = 0;
		//Comando SE
		if(a > 0){
			System.out.println("Não é maior que zero");
		} else { // comando Senão
			System.out.println("É maior que zero");
		}
		
		for(int i =1; i<=10;i++){
			for(int x=1; x<=10; x++){
				int multiplicacao = i*x;
				System.out.println(i+" X "+x+" = "+multiplicacao);
				System.out.printf("%d X %d = %d \n", i,x,multiplicacao);
			}
		}
	}
}
