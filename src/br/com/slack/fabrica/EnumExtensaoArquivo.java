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
		
		throw new Exception("Est� extens�o n�o est� dispon�vel no momento");
	}
	
	public String getExtensao() {
		return this.extensao;
	}
}
