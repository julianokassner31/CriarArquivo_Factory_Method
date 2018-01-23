package br.com.slack.fabrica.txt;

import br.com.slack.fabrica.Arquivo;
import br.com.slack.fabrica.EnumExtensaoArquivo;
import br.com.slack.fabrica.FabricaDeArquivo;

public class FabricaDeArquivoTXT implements FabricaDeArquivo{

	@Override
	public Arquivo criarArquivo(String nome, EnumExtensaoArquivo extensao){
		return new ArquivoTXT("ArquivoTXT");
	}

}
