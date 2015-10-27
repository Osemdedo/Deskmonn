package deskmon.modelo;

/**
 * @author matheus
 *
 */
public class MonstroInimigo extends Monstro {

	private int experienciaRecebida;
	private boolean chefe;
	
	
	
	
	
	
	

	public MonstroInimigo(int vida, int dano, int sprite, String nome, int experienciaRecebida, boolean chefe) {
		super(vida, dano, sprite, nome);
		this.experienciaRecebida = experienciaRecebida;
		this.chefe = chefe;
		
	}


	/*public String getNome(){
		return this.getNome();
	}*/
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



	@Override
	public String toString() {
		return "MonstroInimigo [experienciaRecebida=" + experienciaRecebida + ", chefe=" + chefe + "]";
	}
	
	

}
