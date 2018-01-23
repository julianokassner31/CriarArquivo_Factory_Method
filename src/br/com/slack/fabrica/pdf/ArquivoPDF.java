package br.com.slack.fabrica.pdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import br.com.slack.fabrica.Arquivo;
import br.com.slack.fabrica.EnumExtensaoArquivo;

public class ArquivoPDF extends Arquivo{
	
	protected Document document;
	protected PdfWriter pdfWriter;
	
	public ArquivoPDF(String nome){
		super(nome, EnumExtensaoArquivo.PDF);
		document = new Document();
	}

	@Override
	public void gravarArquivo() {
		
		try {
			
			criarArquivo();
			
			System.out.println(String.format(ESCREVENDO_NO_ARQUIVO, nomeArquivoPontoExtensao()));
			document.open();
			document.add(new Paragraph("Parágrafo Título do Documento!"));
			document.close();
			System.out.println(String.format(ARQUIVO_FINALIZADO, nomeArquivoPontoExtensao()));
			
		}catch(Exception e) {

			System.out.println(String.format(ERRO_CRIAR_ARQUIVO, nomeArquivoPontoExtensao()));
			
			e.printStackTrace();
			
		}
	}

	@Override
	public void criarArquivo() {
		try {
			
			System.out.println(String.format(CRIANDO_ARQUIVO, nomeArquivoPontoExtensao()));
			this.pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(PATH_SALVAR_ARQUIVO + nomeArquivoPontoExtensao()));
			System.out.println(String.format(ARQUIVO_CRIADO, nomeArquivoPontoExtensao()));
		
		}catch(Exception e) {
			
			System.out.println(String.format(ERRO_CRIAR_ARQUIVO, nomeArquivoPontoExtensao()));
			e.printStackTrace();
		}
	}

}