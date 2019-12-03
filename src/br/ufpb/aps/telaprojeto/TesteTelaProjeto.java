package br.ufpb.aps.telaprojeto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	void test() {
		TelaProjeto tela = new TelaProjeto();
		tela.setFabrica(new FabricaWindows());
		tela.montar();
		tela.desenhar();
		assertEquals(		"Janela Windows{Menu Windows, Botão Windows}", tela.desenhar()); 
		
	}

}
