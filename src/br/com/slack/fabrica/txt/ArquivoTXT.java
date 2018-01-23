package br.com.slack.fabrica.txt;

import java.io.FileWriter;
import java.io.PrintWriter;

import br.com.slack.fabrica.Arquivo;
import br.com.slack.fabrica.EnumExtensaoArquivo;

public class ArquivoTXT extends Arquivo{

	FileWriter arq;
	
	public ArquivoTXT(String nome){
		super(nome, EnumExtensaoArquivo.TXT);
	}

	@Override
	public void gravarArquivo() {
		
		try {
			
			criarArquivo();
			
			System.out.println(String.format(ESCREVENDO_NO_ARQUIVO, nomeArquivoPontoExtensao()));
			
			System.out.println(String.format(ARQUIVO_FINALIZADO, nomeArquivoPontoExtensao()));
			
		}catch(Exception e) {

			System.out.println(String.format(ERRO_CRIAR_ARQUIVO, nomeArquivoPontoExtensao()));
			
		}
	}
	
	@Override
	public void criarArquivo() {
		try {
			System.out.println(String.format(CRIANDO_ARQUIVO, nomeArquivoPontoExtensao()));
			arq = new FileWriter(PATH_SALVAR_ARQUIVO + nomeArquivoPontoExtensao());
			PrintWriter gravarArq = new PrintWriter(arq);
			gravarArq.printf("Teste txt");
			arq.close();
			System.out.println(String.format(ARQUIVO_CRIADO, nomeArquivoPontoExtensao()));
		}catch(Exception e) {
			System.out.println(String.format(ERRO_CRIAR_ARQUIVO, nomeArquivoPontoExtensao()));
		}
	}

}
