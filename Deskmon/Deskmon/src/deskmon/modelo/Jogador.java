package deskmon.modelo;

import java.util.Map;
import java.util.Scanner;

public class Jogador {

	private String nome;
	private int idade;
	private int serie;
	private int personagem; // id da imagem a ser carregada
	private MonstroJogador monstro;
	private int tempoDeJogo;

	
	
	public Jogador(String nome, int idade, int serie, MonstroJogador monstro, int personagem) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.serie = serie;
		this.monstro = monstro;
		this.tempoDeJogo = 0;
		this.personagem = personagem;
	}
	
	public static Jogador CreateNovoJogador(){
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome de Jogador");
		String nome = scn.next();
		System.out.println("Entre com a sua idade");
		int idade = scn.nextInt();
		System.out.println("Entre com a sua série");
		int serie = scn.nextInt();
		System.out
				.println("Escolha o número correspondente ao avatar desejado(de 1 a 5)");
		int validator = scn.nextInt();
		int personagem = valida(validator);
		System.out
				.println("Escolha o número correspondente ao monstro desejado(de 1 a 5)");
		validator = scn.nextInt();
		int monstro = valida(validator);
		System.out.println("Escolha o do seu monstro");
		String NomeMonstrojogador = scn.next();
		
		MonstroJogador monstroJogador = new MonstroJogador(NomeMonstrojogador,monstro);
		Jogador novoJogador = new Jogador(nome, idade, serie, monstroJogador, personagem);	

		return novoJogador;
	}
	
	public static Jogador CarregaJogador(Map<String,String> meuJogador){
		
		
		String nome = meuJogador.get("nome");
		String nomeMonstro = meuJogador.get("nomeMonstro");
		int idade = Integer.parseInt(meuJogador.get("idade"));
		int serie = Integer.parseInt(meuJogador.get("serie"));
		int tipoJogador= Integer.parseInt(meuJogador.get("tipoJogador"));
		int tipoMonstro = Integer.parseInt(meuJogador.get("tipoMonstro"));
		int vida = Integer.parseInt(meuJogador.get("vidaMonstro"));
		int experiencia = Integer.parseInt(meuJogador.get("experiencia"));
		int xpProximoNivel = Integer.parseInt(meuJogador.get("expericenciaProximoNivel"));
		int nivel = Integer.parseInt(meuJogador.get("nivel"));
		int dano = Integer.parseInt(meuJogador.get("danoMonstro"));

		
		MonstroJogador monstroJogador = new MonstroJogador(vida,dano,tipoMonstro,nomeMonstro,tipoMonstro,experiencia,xpProximoNivel,nivel);
		Jogador carregaJogador = new Jogador(nome, idade, serie, monstroJogador,tipoJogador);	
		
		return carregaJogador;

	}



	private static int valida(int x){
		Scanner scn = new Scanner(System.in);
		while (x<1 || x>5){
			System.out.println("Valor inválido, entre com um inteiro de 1 a 5");
			x = scn.nextInt();
		}
		return x;
	}

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

	
	
	
	
	

}
