package deskmon.modelo;

import java.util.Scanner;

public class Questao {

	private String texto;
	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	private int dificuldade;
	private int resposta;
	private boolean respondida;
	//private int porcentagemAcertos;
	private String materia;

	
	
	public Questao(String texto, String alternativa1, String alternativa2, String alternativa3, String alternativa4,
			int dificuldade, int resposta, String materia) {
		super();
		this.texto = texto;
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
		this.dificuldade = dificuldade;
		this.resposta = resposta;
		this.materia = materia;
		this.respondida = false;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
	}
	
	
	public int getResposta() {
		return resposta;
	}

	public void setResposta(int resposta) {
		this.resposta = resposta;
	}

	public boolean isRespondida() {
		return respondida;
	}

	public void setRespondida(boolean respondida) {
		this.respondida = respondida;
	}

	@Override
	public String toString() {
		return "Questao [texto=" + texto + ", alternativa1=" + alternativa1 + ", alternativa2=" + alternativa2
				+ ", alternativa3=" + alternativa3 + ", alternativa4=" + alternativa4 + ", dificuldade=" + dificuldade
				+ ", resposta=" + resposta + ", materia=" + materia + "]";
	}

	
	public void ImprimeQuestao(){
		System.out.println("");
		System.out.println("Resolva:");
		System.out.println(this.getTexto());
		System.out.println("a) "+this.getAlternativa1());
		System.out.println("b) "+this.getAlternativa2());
		System.out.println("c) "+this.getAlternativa3());
		System.out.println("d) "+this.getAlternativa4());
		System.out.println("");
	}
	
	
	
	

	
	static public String EscreveResposta(){
		
		Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
		while(!x.equals("a") && !x.equals("b") && !x.equals("c") && !x.equals("d")){
			
			System.out.println("Entre com uma letra entre a e d");
			x = scn.next();
		}
		
		return x;
	}
	public boolean ChecaResposta(String Stringresposta){
		
		int resposta =0;;
		switch(Stringresposta){
		case "a":
			resposta = 1 ;
			break;
		case "b":
			resposta = 2;
			break;
		case "c":
			resposta = 3;
			break;
		case "d":
			resposta = 4;
			break;
		default:
			return false;
		}
		
		
		if(resposta == this.getResposta()){
			System.out.println("Resposta Correta");
			return true;
		}
		System.out.println("Resposta Incorreta");
		return false;
	}
	
	/*public int getPorcentagemAcertos() {
		return porcentagemAcertos;
	}

	public void setPorcentagemAcertos(int porcentagemAcertos) {
		this.porcentagemAcertos = porcentagemAcertos;
	}
	*/
	
	
}
