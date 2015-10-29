package deskmon.modelo;

import java.util.Scanner;

public class NovoJogo {

	static private Jogador novoJogador;
	
	static public void constroi() {

		novoJogador = Jogador.CreateJogador();
		IniciarJogo.comecar(novoJogador);
	}
		
	

}
