package br.com.slack.fabrica;

import com.itextpdf.text.DocumentException;

public abstract class Arquivo {
	
	protected static final String CRIANDO_ARQUIVO = "Criando arquivo %s...";
	protected static final String ARQUIVO_CRIADO = "Arquivo criado com sucesso!";
	protected static final String ESCREVENDO_NO_ARQUIVO = "Escrevendo no arquivo %s...";
	protected static final String ERRO_CRIAR_ARQUIVO = "Erro ao criar arquivo %s!";
	protected static final String ARQUIVO_FINALIZADO = "Arquivo %s finalizado com sucesso!";
	protected static final String ARQUIVO_FINALIZADO_ERRO = "Arquivo %s finalizado com erro!";
	protected static final String PATH_SALVAR_ARQUIVO = "/home/kassner/Documents/";
	
	private String nome;
	private EnumExtensaoArquivo extensao;
	
	public Arquivo(String nome, EnumExtensaoArquivo extensao){
		this.nome = nome;
		this.extensao = extensao;
	}
	
	public abstract void gravarArquivo() throws DocumentException;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumExtensaoArquivo getExtensao() {
		return extensao;
	}
	
	public String nomeArquivoPontoExtensao() {
		return nome + extensao.getExtensao();
	}
	
	public abstract void criarArquivo();

}
