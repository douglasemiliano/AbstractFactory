package br.ufpb.aps.telaprojeto;

public class BotaoWindows implements Botao {

	@Override
	public String desenhar() {
		String status = "Botão Windows";
		return status;
		
	}
	
	@Override
	public String toString() {
		return this.desenhar();
	}

}
