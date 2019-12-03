package br.ufpb.aps.telaprojeto;

public class BotaoAndroid implements Botao {

	@Override
	public String desenhar() {
		String status = "Botão Android";
		return status;
	}
	
	@Override
	public String toString() {
		return this.desenhar();
	}

}
