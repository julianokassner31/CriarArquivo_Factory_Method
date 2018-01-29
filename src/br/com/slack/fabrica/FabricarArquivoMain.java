package br.com.slack.fabrica;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import br.com.slack.fabrica.pdf.FabricaDeArquivoPDF;
import br.com.slack.fabrica.txt.FabricaDeArquivoTXT;

/**
 * Demonstando o funcionamento do Padrao de Projetos
 * Factory Method
 * @author kassner
 */
public class FabricarArquivoMain {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		FabricaDeArquivo fabricaDeArquivoPDF = new FabricaDeArquivoPDF();
		Arquivo arquivo = fabricaDeArquivoPDF.criarArquivo("Teste PDF");
		arquivo.gravarArquivo();
		
		System.out.println("");
		System.out.println("##########################################################");
		System.out.println("");
		
		FabricaDeArquivo fabricaDeArquivoTXT = new FabricaDeArquivoTXT();
		arquivo = fabricaDeArquivoTXT.criarArquivo("Teste TXT");
		arquivo.gravarArquivo();
	}

}
