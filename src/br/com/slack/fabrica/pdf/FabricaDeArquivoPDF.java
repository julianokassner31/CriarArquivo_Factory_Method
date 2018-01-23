package br.com.slack.fabrica.pdf;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

import br.com.slack.fabrica.Arquivo;
import br.com.slack.fabrica.EnumExtensaoArquivo;
import br.com.slack.fabrica.FabricaDeArquivo;

public class FabricaDeArquivoPDF implements FabricaDeArquivo{
	
	@Override
	public Arquivo criarArquivo(String nome, EnumExtensaoArquivo extensao) throws FileNotFoundException, DocumentException {
		return new ArquivoPDF(nome);
	}

}
