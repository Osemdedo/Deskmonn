package deskmon.modelo;

import java.util.Scanner;

public class IniciarJogo {

	static private MonstroInimigo inimigo;
	static private Materia materia;
	static private Scanner scn = new Scanner(System.in);
	static private String resposta;
	
	static public void valida(String x){
		
		while(!x.equals("a") && !x.equals("b") && !x.equals("c") && !x.equals("d")){
			
			System.out.println("Resposta inválida. Entre com uma letra entre a e d");
			x = scn.next();
		}
		
		resposta = x;
	}
	
	static public void monsterBuilder(){
		
		
		inimigo = new MonstroInimigo(20,100,1,"Inimigo",1,true);
		
		
	}
	
	static public void comecar(Jogador jogador){
	
		monsterBuilder();
		
		System.out.println("Você entrou em uma batalha contra o "+ inimigo.getNome() + " do clã de Matematica !!");
		System.out.println("Para atacar, responda corretamente a seguinte pergunta:");
		System.out.println("2+8*7/4");
		System.out.println("a) 20");
		System.out.println("b) 16");
		System.out.println("c) 14");
		System.out.println("d) 18");
		
		resposta = scn.next();
		valida(resposta);
		
		if (resposta.equals("b")){
			System.out.println("ok");
			inimigo.setVida(inimigo.getVida() - jogador.getMonstro().getDano());
			System.out.println("O monstro inimigo perdeu "+ jogador.getMonstro().getDano()+" pontos de vida e desmaiou");
			System.out.println("Você venceu, parabéns!");
		}
		
		
		
	}
	
}
