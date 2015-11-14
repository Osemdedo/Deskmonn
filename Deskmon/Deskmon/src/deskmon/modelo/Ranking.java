package deskmon.modelo;

import java.util.Map;
import java.util.Scanner;

public class Ranking {

	static public void constroi(){
		
		Map<String, Map<String,String>> userHash;
		Map<String,String> myUserList;
		
		UserAccounts myUsers = new UserAccounts();
		userHash = myUsers.GetallUsers();
		
		
		for( String key : userHash.keySet()){
			myUserList = userHash.get(key);
			System.out.println("\n"+key);
			System.out.println("Nome do Monstro "+ myUserList.get("nomeMonstro"));
			System.out.println("Nivel do Monstro "+ myUserList.get("nivel")+"\n");
			
			}
		}
		
	
	
}
