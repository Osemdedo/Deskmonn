package deskmon.modelo;

import java.util.Scanner;

public class TelaPrincipal {

	private Scanner scn = new Scanner(System.in);
	private int opcao;
	

	public void inicio() {
		System.out.println("               DeskMon              \n\n\n");
		System.out.println("1-Novo Jogo  2-Continuar  3-Rankings");
		opcao = scn.nextInt();
		menuPrincipal(opcao);
	}

	public void menuPrincipal(int opcao) {
		switch (opcao) {
		case (1):
			System.out.println("---> Novo Jogo");
			NovoJogo.constroi();
			break;
		case (2):
			System.out.println("---> Continuar");
			ContinuarJogo.constroi();
			break;
		case (3):
			System.out.println("---> Rankings");
			Ranking.constroi();
			break;
		default:
			System.out.println("Favor entrar com um inteiro entre 1 e 3");
			opcao = scn.nextInt();
			menuPrincipal(opcao);
			break;
		}

	}
	
}