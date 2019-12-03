package br.ufpb.aps.telaprojeto;

public class JanelaAndroid implements Janela {

	@Override
	public String desenhar() {
		String status = "Janela Android";
		return status;
	}

	@Override
	public String toString() {
		return this.desenhar();
	}
	


}
