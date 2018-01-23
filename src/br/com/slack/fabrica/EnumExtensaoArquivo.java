package br.com.slack.fabrica;

public enum EnumExtensaoArquivo {

	PDF(".pdf"),
	TXT(".txt");
	
	private String extensao;
	
	private EnumExtensaoArquivo(String extensao) {
		this.extensao = extensao;
	}
	
	public String getExtensaoById(EnumExtensaoArquivo ext) throws Exception {
		for (EnumExtensaoArquivo e : EnumExtensaoArquivo.values()) {
			if(e == ext ){
				return e.getExtensao();
			}
		}
		
		throw new Exception("Está extensão não está disponível no momento");
	}
	
	public String getExtensao() {
		return this.extensao;
	}
}
