package br.com.slack.fabrica;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

public interface FabricaDeArquivo {
	
	public Arquivo criarArquivo(String nome, EnumExtensaoArquivo extensao) throws FileNotFoundException, DocumentException;

}
