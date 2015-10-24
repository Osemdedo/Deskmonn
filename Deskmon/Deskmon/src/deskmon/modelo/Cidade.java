package deskmon.modelo;

import java.util.List;

public class Cidade {

	private String nome;
	private boolean desbloqueada;
	private List<MonstroInimigo> lista;
	private Materia materia;

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDesbloqueada() {
		return desbloqueada;
	}

	public void setDesbloqueada(boolean desbloqueada) {
		this.desbloqueada = desbloqueada;
	}

	public List<MonstroInimigo> getLista() {
		return lista;
	}

	public void setLista(List<MonstroInimigo> lista) {
		this.lista = lista;
	}

}
