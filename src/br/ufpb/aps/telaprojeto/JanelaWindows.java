package br.ufpb.aps.telaprojeto;

public class JanelaWindows implements Janela {

	@Override
	public String desenhar() {
		String status = "Janela Windows";
		return status;
	}
	
	@Override
	public String toString() {
		return this.desenhar();
	}
	

}
