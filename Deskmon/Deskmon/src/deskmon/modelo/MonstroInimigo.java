package deskmon.modelo;

public class MonstroInimigo extends Monstro {

	private int experienciaRecebida;
	private boolean chefe;
	private Materia materia;

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public boolean isChefe() {
		return chefe;
	}

	public void setChefe(boolean chefe) {
		this.chefe = chefe;
	}

	public int getExperienciaRecebida() {
		return experienciaRecebida;
	}

	public void setExperienciaRecebida(int experienciaRecebida) {
		this.experienciaRecebida = experienciaRecebida;
	}

}
