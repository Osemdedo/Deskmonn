package deskmon.modelo;

import java.util.Map;
import java.util.Scanner;

public class ContinuarJogo {

	static private Scanner scn = new Scanner(System.in);
	static private String nome;
	static private Map<String, Map<String,String>> userHash;
	static private Map<String,String> myUser;
	static private Jogador meuJogador;
	
	static public void constroi(){
		
		System.out.println("Entre com o nome do jogador a ser carregado");
		nome = scn.next();
		
		
		UserAccounts myUsers = new UserAccounts();
		userHash = myUsers.GetallUsers();
		
		for( String key : userHash.keySet()){
			if(key.equals(nome)){
				myUser = userHash.get(key);
				meuJogador = Jogador.CarregaJogador(myUser);
				break;
			}
		}
		
		IniciarJogo.comecar(meuJogador);
		
		System.out.println("Jogador "+nome+" carregado");
		
	}
	
}
