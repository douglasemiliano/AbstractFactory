package br.ufpb.aps.telaprojeto;

public class FabricaWindows implements FabricaAbstrata {
	
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	public Janela criarJanela () {
		return new JanelaWindows();
	}
	public Menu criarMenu () {
		return new MenuWindows();
	}	
	public Botao crarBotao() {
		return new BotaoWindows();
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
	@Override
	public String toString() {
		return "FabricaWindows [janela=" + janela + ", menu=" + menu + ", botao=" + botao + "]";
	}
	
	
	
}

