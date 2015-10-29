
package deskmon.modelo;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;





public class UserAccounts {
    
    // armazena todos os usuarios cadastrados
    // é definido na função LoadAllUsers
    static Map<String, Map<String,String> > allUsers;
    static String NomedoArquivo = "Arquivo.txt";


    
    
    // essa função deve ser chamada quando se quer Adicionar um novo Usuário ou Editar um 
    //usuário existente.
    // Recebe um dicionario com todas as caracteristicas 
    public static void ChangeArquivo(Map<String,String> userdata){
        if(allUsers.containsKey(userdata)){
            AddUser(userdata);
        }
        else{
            EditUser(userdata);
        }
    }
    
    
    public static void EditUser(Map<String,String> userdata){   
        ManipulaArquivo.EditContent(userdata,NomedoArquivo);        
    }
    
    public static void AddUser(Map<String,String> userdata){
        
        ManipulaArquivo.AddContent(userdata,NomedoArquivo);
    
    }
    
    //Carrega para o Dicinonario allUsers todos os usuario do file
    public static void LoadAllUsers(){
    	
    	allUsers = ManipulaArquivo.LoadAllContent(NomedoArquivo);
                        
    }
      
    //Retorna o dicionario com todos os usuarios
    public  static Map<String, Map<String,String> > GetallUsers(){
        return allUsers;
    }
    
    //public static Jogador GetJogador(){
		//UserAccounts jogador = new UserAccounts();
    	//return jogador;
    	
    //}
    
}
