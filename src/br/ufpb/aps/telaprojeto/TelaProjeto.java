package br.ufpb.aps.telaprojeto;

public class TelaProjeto {
	
	private FabricaAbstrata fabrica;
	private String janela;
	private String menu;
	private String botao;
	
	
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
		
	}


	public String desenhar() {
		String status = "";
		status += janela + "{";
		status += menu + ", ";
		status += botao + "}";
		return status;
	}


	public void montar() {
		this.janela = fabrica.criarJanela().toString();
		this.menu = fabrica.criarMenu().toString();
		this.botao = fabrica.crarBotao().toString();	
		
		System.err.println(this.janela);
		System.err.println(this.menu);	
		System.err.println(this.botao);
	}

}
