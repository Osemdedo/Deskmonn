package deskmon.modelo;

public class Chefe extends MonstroInimigo{

	public Chefe(int vida, int dano, int sprite, String nome, int experienciaRecebida, boolean chefe, Materia materia) {
		super(vida, dano, sprite, nome, experienciaRecebida, chefe);
		// TODO Auto-generated constructor stub
	}

	private boolean derrotado;

	public boolean isDerrotado() {
		return derrotado;
	}

	public void setDerrotado(boolean derrotado) {
		this.derrotado = derrotado;
	}
	
}
