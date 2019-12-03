package br.ufpb.aps.telaprojeto;

public class MenuAndroid implements Menu {

	public String desenhar() {
		String status  = "Menu Android";
		return status;
	}
	
	@Override
	public String toString() {
		return this.desenhar();
	}
	

}
