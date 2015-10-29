package deskmon.modelo;

import java.util.List;

public class MonstroJogador extends Monstro{

	

	private int experiencia;
	private int xpProximoNivel;
	private int nivel;
	private int tipo;
	private List<HabilidadePassiva> listaPassivas;
	private List<HabilidadeAtiva> listaAtivas;
	
	
	
	public MonstroJogador(int vida, int dano, int sprite, String nome) {
		super(vida, dano, sprite, nome);
		// TODO Auto-generated constructor stub
	}


	public MonstroJogador(String nome,int tipo) {	
		super(300, 100, 1, nome);
		this.tipo = tipo;
		this.experiencia = 0;
		this.xpProximoNivel = 0;
		this.nivel = 1;
	}	
	
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getXpProximoNivel() {
		return xpProximoNivel;
	}

	public void setXpProximoNivel(int xpProximoNivel) {
		this.xpProximoNivel = xpProximoNivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
