package br.ufpb.aps.telaprojeto;

public interface FabricaAbstrata {
	
	public Janela criarJanela();	
	public Menu criarMenu();
	public Botao crarBotao();
	public String toString();

}
