package arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EscritaArquivo {
	
	public static void main(String[] args) throws IOException {
		//Imutavel nao deixa mudar os valores
//		List<String> s = Arrays
//					.asList("Teste", "Teste 4", "Teste 3");
		
//		//Mutavel deixa mudar os valores
		List<String> s1 = new ArrayList<>();
		s1.add("Teste");
		s1.add("Teste 4");
		s1.add("Teste 3");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um nome");
		String nome = sc.nextLine();
		s1.add(nome);
		
		Path caminhoNovo = Paths.get("novo.txt");
		if(Files.exists(caminhoNovo)){
			Files.write(caminhoNovo, s1, 
					StandardOpenOption.TRUNCATE_EXISTING);	
		} else {
			Files.write(caminhoNovo, s1, 
					StandardOpenOption.CREATE_NEW);
		}
		sc.close();
		
		Files.lines(caminhoNovo).forEach(linha->{System.out.println(linha);});
	}
	
}