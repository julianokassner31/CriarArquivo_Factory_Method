package br.com.slack.fabrica;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import br.com.slack.fabrica.pdf.ArquivoPDF;
import br.com.slack.fabrica.txt.ArquivoTXT;

/**
 * Demonstando o funcionamento do Padrao de Projetos
 * Factory Method
 * @author kassner
 */
public class FabricarArquivoMain {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
		Arquivo arquivo = new ArquivoPDF("Teste PDF");
		arquivo.gravarArquivo();
		
		arquivo = new ArquivoTXT("Teste TXT");
		arquivo.gravarArquivo();
	}

}
