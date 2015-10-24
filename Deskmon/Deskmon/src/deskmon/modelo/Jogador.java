package deskmon.modelo;

public class Jogador {

	private String nome;
	private int idade;
	private int serie;
	private int personagem; // id da imagem a ser carregada
	private MonstroJogador monstro;

	public MonstroJogador getMonstro() {
		return monstro;
	}

	public void setMonstro(MonstroJogador monstro) {
		this.monstro = monstro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getPersonagem() {
		return personagem;
	}

	public void setPersonagem(int personagem) {
		this.personagem = personagem;
	}

	public int getTempoDeJogo() {
		return tempoDeJogo;
	}

	public void setTempoDeJogo(int tempoDeJogo) {
		this.tempoDeJogo = tempoDeJogo;
	}

	private int tempoDeJogo;

}
