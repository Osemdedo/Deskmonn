package deskmon.modelo;

import java.util.Scanner;

public class NovoJogo {

	static private Scanner scn = new Scanner(System.in);
	static private String nome;
	static private int idade;
	static private int serie;
	static private int personagem;
	static private int monstro;
	static private int validator;
	static private MonstroJogador mjogador;
	
	public static int valida(int x){
		
		while (x<1 || x>5){
			System.out.println("Valor inválido, entre com um inteiro de 1 a 5");
			x = scn.nextInt();
		}
		return x;
	}

	static public void constroi() {

		System.out.println("Entre com o seu nome de Jogador");
		nome = scn.next();
		System.out.println("Entre com a sua idade");
		idade = scn.nextInt();
		System.out.println("Entre com a sua série");
		serie = scn.nextInt();
		System.out
				.println("Escolha o número correspondente ao avatar desejado(de 1 a 5)");
		validator = scn.nextInt();
		personagem = valida(validator);
		System.out
				.println("Escolha o número correspondente ao monstro desejado(de 1 a 5)");
		validator = scn.nextInt();
		monstro = valida(validator);
//		System.out.println("Nome : " + nome + "\nIdade : " + idade
//				+ "\nSérie : " + serie + "\nPersonagem : " + personagem
//				+ "\nMonstro : " + monstro);
		criaJogador();
		
	}
	
	public static void criaJogador(){
		
		criaMonstroJogador();
		
		Jogador jogador = new Jogador();
		jogador.setIdade(idade);
		jogador.setNome(nome);
		jogador.setPersonagem(personagem);
		jogador.setSerie(serie);
		jogador.setMonstro(mjogador);
		
		IniciarJogo.comecar(jogador);
	}
	
	static public void criaMonstroJogador(){
		
		mjogador = new MonstroJogador(20,20,1,"exemplo");

		
	}

}
