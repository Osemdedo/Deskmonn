package deskmon.modelo;

import java.util.List;

public class Cidade {

	private String nome;
	//private boolean desbloqueada;
	private List<MonstroInimigo> lista;
	private String materia;
	
	

	public Cidade(String nome, List<MonstroInimigo> lista, String materia) {
		super();
		this.nome = nome;
		this.lista = lista;
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public boolean isDesbloqueada() {
		return desbloqueada;
	}

	public void setDesbloqueada(boolean desbloqueada) {
		this.desbloqueada = desbloqueada;
	}*/

	public List<MonstroInimigo> getLista() {
		return lista;
	}

	public void setLista(List<MonstroInimigo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", lista=" + lista + ", materia=" + materia + "]";
	}

}
