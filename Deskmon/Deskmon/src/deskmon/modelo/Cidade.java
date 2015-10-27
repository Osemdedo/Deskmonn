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
	
	public void ListaMonstro(String nomeCidade){
		
		if(nomeCidade.equals(this.getNome())){
				
				for(Monstro monstro: this.getLista()){
				System.out.println( monstro.getNome());
				}
		}
	
	}
	
	public MonstroInimigo Get_monstro(String nomeMonstro){
		
		for(MonstroInimigo monstro : lista){
			if(nomeMonstro.equals(monstro.getNome())){
				return monstro;
			}
		}
		return null;
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
