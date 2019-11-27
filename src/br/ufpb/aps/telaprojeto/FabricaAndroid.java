package br.ufpb.aps.telaprojeto;

public class FabricaAndroid implements FabricaAbstrata {
	
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	public Janela criarJanela () {
		return new JanelaAndroid();
	}
	public Menu criarMenu () {
		return new MenuAndroid();
	}	
	public Botao crarBotao() {
		return new BotaoAndroid();
	}
	public Janela getJanela() {
		return janela;
	}
	public void setJanela(Janela janela) {
		this.janela = janela;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public Botao getBotao() {
		return botao;
	}
	public void setBotao(Botao botao) {
		this.botao = botao;
	}

	
	
}

