package deskmon.modelo;

import java.io.LineNumberInputStream;
import java.util.List;
import java.util.Scanner;

public class Combate {

	private int respostasErradas;
	private int duracao;
	private String Materia;
	private MonstroInimigo inimigo;
	private Jogador jogador;
	private List<Turno> turnos;
	private BancodeQuestoes meuBanco;
	private static Questao minhaQuestao;
	
	public Combate(){
		meuBanco = new BancodeQuestoes();
		
	}

	public int getRespostasErradas() {
		return respostasErradas;
	}

	public void setRespostasErradas(int respostasErradas) {
		this.respostasErradas = respostasErradas;
	}

	public int getDuracao() {
		return duracao;
	}

	

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public MonstroInimigo getInimigo() {
		return inimigo;
	}

	public void setInimigo(MonstroInimigo inimigo) {
		this.inimigo = inimigo;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	

	public void SetCombate(MonstroInimigo inimigo, Jogador jogador, String Materia) {
		this.respostasErradas = 0;
		this.duracao = 0;
		this.inimigo = inimigo;
		this.jogador = jogador;	
		this.Materia = Materia;
	}
	
	

	
	public void IniciaCombate(MonstroInimigo inimigo, Jogador jogador, String Materia){
		
		this.SetCombate(inimigo, jogador, Materia);
		Scanner newScanner = new Scanner(System.in);
		boolean finalBatalha = true;
		System.out.println("\n\nCombate iniciado");
    	System.out.println("Você entrou em uma batalha contra o "+ inimigo.getNome() + " do clã de "+Materia+" !!");
		
		while(finalBatalha){
			
			GeraPergunta();
			String resposta;

	    	resposta = Questao.EscreveResposta();	

	    	
	    	
	    	if(minhaQuestao.ChecaResposta(resposta)){
	    		
	    		RespostaCorreta();
	    		if(inimigo.getVida()<=0){
		    		System.out.println("O monstro inimigo desmaiou");
		    		System.out.println("Você venceu, parabéns!");
		    		finalBatalha = false;
	    		}
	    	}
	    	else
	    	{
	    		RespostaIncorreta();
	    		System.out.println(inimigo.getVida());
	    		if(jogador.getMonstro().getVida()<=0){	    		
		    		System.out.println("Seu monstro zerou a vida e voce perdeu o jogo");
		    		System.out.println("Tente novamente");
		    		finalBatalha = false;
	    		}
	    	}
		}
	}
	
	public void GeraPergunta(){
		
		System.out.println("Para atacar, responda corretamente a seguinte pergunta:");
    	minhaQuestao = meuBanco.Get_Questao(Materia,1);
    	minhaQuestao.ImprimeQuestao();

	}
	
	
	public void RespostaCorreta(){
		System.out.println("Vida anterior do inimigo: "+inimigo.getVida());
		System.out.println("O seu dano no inimigo foi: "+jogador.getMonstro().getDano());
		int novaVida = inimigo.getVida() - jogador.getMonstro().getDano();
		inimigo.setVida(novaVida);
		System.out.println("Sua vida final: "+jogador.getMonstro().getVida()+" Vida final do Inimigo"+inimigo.getVida());
		
	};
	public void RespostaIncorreta(){
		System.out.println("Vida anterior do seu monstro: "+jogador.getMonstro().getVida());
		System.out.println("O dano do inimigo foi: "+inimigo.getDano());
		int novaVida = jogador.getMonstro().getVida() -  inimigo.getDano();
		jogador.getMonstro().setVida(novaVida);
		System.out.println("Sua vida final: "+jogador.getMonstro().getVida()+" Vida final do Inimigo"+inimigo.getVida());
		
	};
	
}
