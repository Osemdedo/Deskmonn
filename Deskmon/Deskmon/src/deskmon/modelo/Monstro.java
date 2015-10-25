package deskmon.modelo;

public class Monstro {

	private int vida;
	private int dano;
	private int sprite; //id da sprite a ser carregada
	private String nome;

	
	
	
	public Monstro(int vida, int dano, int sprite, String nome) {
		this.vida = vida;
		this.dano = dano;
		this.sprite = sprite;
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getSprite() {
		return sprite;
	}

	public void setSprite(int sprite) {
		this.sprite = sprite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
