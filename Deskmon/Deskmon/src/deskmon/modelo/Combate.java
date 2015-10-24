package deskmon.modelo;

import java.util.List;

public class Combate {

	private int respostasErradas;
	private int duracao;
	private MonstroInimigo inimigo;
	private MonstroJogador jogador;
	private List<Turno> turnos;

	public int getRespostasErradas() {
		return respostasErradas;
	}

	public void setRespostasErradas(int respostasErradas) {
		this.respostasErradas = respostasErradas;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public MonstroInimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(MonstroInimigo inimigo) {
		this.inimigo = inimigo;
	}

	public MonstroJogador getJogador() {
		return jogador;
	}

	public void setJogador(MonstroJogador jogador) {
		this.jogador = jogador;
	}
	
}
