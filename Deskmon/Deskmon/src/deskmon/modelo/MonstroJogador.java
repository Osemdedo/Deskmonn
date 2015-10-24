package deskmon.modelo;

import java.util.List;

public class MonstroJogador extends Monstro{

	private int experiencia;
	private int xpProximoNivel;
	private int nivel;
	private List<HabilidadePassiva> listaPassivas;
	private List<HabilidadeAtiva> listaAtivas;

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
