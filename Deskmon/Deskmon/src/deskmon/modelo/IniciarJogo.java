package deskmon.modelo;

import java.util.Scanner;

public class IniciarJogo {

	private static Mapa meuMapa ;
	private static MonstroInimigo monstroInimigo;
	private static Cidade minhaCidade;
	private static Combate meuCombate;
	
	
	
	static public void comecar(Jogador jogador){
		
		meuMapa = new Mapa();
		meuCombate = new Combate();
		String cidade;
		String monstro;
		Scanner newScanner = new Scanner(System.in);
		
    	
		do{
    	System.out.println("Escolha uma Cidade\n");
    	meuMapa.ListaCidades();
    	cidade = newScanner.nextLine();
		}while((minhaCidade = meuMapa.GetCidade(cidade))==null);
    	
    	do{
    	System.out.println("\n\nEscolha um montro");
    	minhaCidade.ListaMonstro(cidade);
    	monstro = newScanner.nextLine();
    	monstroInimigo = minhaCidade.Get_monstro(monstro);
    	}while((monstroInimigo = minhaCidade.Get_monstro(monstro))==null);
    	
    	
    	
    	meuCombate.IniciaCombate(monstroInimigo, jogador, minhaCidade.getMateria());
		
		
		
		
		
		
		
	}
	
}
