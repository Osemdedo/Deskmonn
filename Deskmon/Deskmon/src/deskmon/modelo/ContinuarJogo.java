package deskmon.modelo;

import java.util.Scanner;

public class ContinuarJogo {

	static private Scanner scn = new Scanner(System.in);
	static private String nome;
	
	static public void constroi(){
		
		System.out.println("Entre com o nome do jogador a ser carregado");
		nome = scn.next();
		
		System.out.println("Jogador "+nome+" carregado");
		
	}
	
}
