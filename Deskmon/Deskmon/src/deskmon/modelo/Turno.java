package deskmon.modelo;

public class Turno {

	private boolean acertou;
	private int tempoParaResponder;
	private Questao questao;

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

	public boolean isAcertou() {
		return acertou;
	}

	public void setAcertou(boolean acertou) {
		this.acertou = acertou;
	}

	public int getTempoParaResponder() {
		return tempoParaResponder;
	}

	public void setTempoParaResponder(int tempoParaResponder) {
		this.tempoParaResponder = tempoParaResponder;
	}

}
