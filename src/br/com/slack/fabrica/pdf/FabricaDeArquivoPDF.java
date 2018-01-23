package br.com.slack.fabrica.pdf;

import br.com.slack.fabrica.Arquivo;
import br.com.slack.fabrica.FabricaDeArquivo;

public class FabricaDeArquivoPDF implements FabricaDeArquivo{
	
	@Override
	public Arquivo criarArquivo(String nome){
		return new ArquivoPDF(nome);
	}

}
