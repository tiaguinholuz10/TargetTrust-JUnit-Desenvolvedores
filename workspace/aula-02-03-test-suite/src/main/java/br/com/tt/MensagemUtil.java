package br.com.tt;

public class MensagemUtil {

	private String mensagem;
	
	public MensagemUtil(String mensagem){
		this.mensagem = mensagem;
	}
	
	public String mostraMensagem(){
		return mensagem;
		
	}
	
	public String saudacaoMensagem(){
		return "Ola " + mensagem;
		
	}
	
	
}
