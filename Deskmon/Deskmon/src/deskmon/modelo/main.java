/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deskmon.modelo;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @authors arthur, lucas & matheus
 */
public class main {
    
    
    public static void main(String[] args) {
    	Mapa meuMapa = new Mapa();
    	BancodeQuestoes meuBanco = new BancodeQuestoes();
    	Monstro monstroInimigo;
    	Cidade minhaCidade;
    	Questao minhaQuestao;
    	
    	Scanner newScanner = new Scanner(System.in);
    	
    	System.out.println("Escolha uma Cidade\n");
    	meuMapa.ListaCidades();
    	String cidade = newScanner.nextLine();
    	minhaCidade = meuMapa.GetCidade(cidade);
    	
    	System.out.println("\n\nEscolha um montro");
    	minhaCidade.ListaMonstro(cidade);
    	String monstro = newScanner.nextLine();
    	monstroInimigo = minhaCidade.Get_monstro(monstro);
    	
    	System.out.println("\n\nCombate iniciado");
    	System.out.println("Você entrou em uma batalha contra o "+ monstroInimigo.getNome() + " do clã de "+minhaCidade.getMateria()+" !!");
    	System.out.println("Para atacar, responda corretamente a seguinte pergunta:");
    	minhaQuestao = meuBanco.Get_Questao(minhaCidade.getMateria(),1);
    	minhaQuestao.ImprimeQuestao();
    	int resposta = newScanner.nextInt();
    	if(minhaQuestao.ChecaResposta(resposta)){
    		System.out.println("O monstro inimigo perdeu, o inimigo desmaiou");
    		System.out.println("Você venceu, parabéns!");
    	}
    	else
    	{
    		System.out.println("Voce errou e perdeu o jogo");
    		System.out.println("Tente novamente");
    	}
    	
    	
    	
    	
    	
    }
    
}

