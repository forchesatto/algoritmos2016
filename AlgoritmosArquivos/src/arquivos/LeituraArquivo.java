package arquivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException{
		Path caminho = Paths.get("meuArquivo.txt");

		// Somente escreve no console o valor das linhas 
		// do arquivo
		// Charset.forName("ISO-8859-1") para arquivos windows
		// ou iso
		Files.lines(caminho, 
				Charset.forName("ISO-8859-1"))
					.forEach(linha->{
					});
		
		double media = Files.lines(caminho)//ler linha
						.mapToInt(Integer::valueOf)//converte para int
						.average() //faz a media
						.getAsDouble(); //converte para double
		
		System.out.println("Media:"+media);
		
		// Para arquivos UTF-8
		Files.lines(caminho).forEach(System.out::println);

		Stream<String> lines = Files.lines(caminho);
		Iterator<String> iterator = lines.iterator();
		Integer soma = 0;
		while(iterator.hasNext()){
			String line = iterator.next();
			soma += Integer.valueOf(line);
		}
		media = soma/lines.count();
		System.out.println(media);
		lines.close();
//		
//		
//		Files.lines(caminho).forEach(linha -> {
//			if (linha.contains("teste")) {
//				System.out.println("achou");
//			}
//		});
//		
		Path arquivoInt = Paths.get("numeros.txt");
//		//versão 1
//		int soma = Files.lines(arquivoInt)
//						.mapToInt(Integer::valueOf).sum();
//		System.out.println(soma);
		
		
//		// versão 1
//		Integer soma = 0;
//		Files.lines(arquivoInt).forEach(linha->{
//			soma = soma + Integer.valueOf(linha);
//		});
//		System.out.println(soma);
		
	}
}
