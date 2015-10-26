
package deskmon.modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/*
Esta classe tem como função manipular um arquivo de texto(txt) para gerenciar os registros de todos 
os jogadores.
Esta função é realizada por uma estrutura de tags no documento(arquivo.txt) e por uma estrutura de 
dicionarios na classe UserAccounts.
Tal estrutura de Dicionario tem a seguinte caracteristica:
Map<String, Map<String,String> >
Onde a sua key é o nome do usuário e leva a outro dicionário
Neste outro dicionário tem-se como key a tag que foi definida no file e sua definição como conteúdo.

O Documento é formado por tag, qualquer tag é aceitavel, porém algumas regas devem ser tomadas
Regras:
A primeira tag de um usuário deve ser seu nome e depois de todas as tags 
a string ">>>" deve ser adicionada para a separacção dos elementos

*/

public class ManipulaArquivo {
	
	
	public static List<String> ReadFile(String fileName) {
	      
        String line = null;
        List<String> readLines = new ArrayList<String>();

        try {

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                readLines.add(line);
            }           
            bufferedReader.close(); 
            
            return readLines;
        }
       
        catch(FileNotFoundException ex) {
        	
            System.out.println("Unable to open file '" + fileName + "'"); 
            return null;
        }
        catch(IOException ex) {
        	
            System.out.println("Error reading file '" + fileName + "'");  
            return null;
        }      
    }
   
	
	//Recebe o dicionario com os dados do usuario e insere no documento
    //Ao editar um usuario, ele é removido de sua posição e adicionado no final com os novos valores
	public static void AddContent(Map<String,String> userdata,String newfile){
    
        
        try{
            
        	File file = new File(newfile);
        	
            if(!file.exists())
               file.createNewFile();
            

            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            
            for( String key : userdata.keySet()){
            bw.newLine();   
            bw.write(key+":"+userdata.get(key));
            //System.out.println(userdata.get(key));              
            }
            bw.newLine();   
            bw.write(">>>");        
            //Closing BufferedWriter Stream
            bw.close();
            System.out.println("Salvo com sucesso no arquivo");

        }
        catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
       }
    
    }
	


public static void EditContent(Map<String,String> userdata,String newfileName){
    
    
    File fileName = new File(newfileName);
    File tempFile = new File("temp.txt");
    String line = null;
    int aux=0;
    String[] splitLine;

    try {
              
        FileWriter fileWriter = new FileWriter(tempFile);
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bw = new BufferedWriter(fileWriter);
    
        while((line = bufferedReader.readLine()) != null) {
     
            if(line.startsWith("nome")){
                splitLine = line.split(":");
                if(splitLine[1].equals(userdata.get("nome"))){           
                    aux=1;               
                }                      
            }
                
            if(aux==1){  
                System.out.println(line);
                //System.out.println("line: "+line+ " nome"+userdata.get("nome"));
                
                if(line.contains(">>>")){
                    aux=0;
                }
                continue;
            }
            else{
                //System.out.println(line);
                bw.write(line);
                bw.newLine();
            }              
        }                  
        
        bw.close();
        bufferedReader.close();
        fileName.delete();
        boolean successful = tempFile.renameTo(fileName);
    }
       
    catch(FileNotFoundException ex) {
        System.out.println("Unable to open file '" + fileName + "'"); 
        
    }
    catch(IOException ex) {
        System.out.println("Error reading file '" + fileName + "'");  
        
    }      
   
}


	public static Map<String, Map<String,String> > LoadAllContent(String NomedoArquivo){
	    
	    Map<String, Map<String,String> > map = new HashMap<String, Map<String,String>>();
	    Map<String,String> user = new HashMap<String, String>();
	     
	              
	    List<String> lines = ManipulaArquivo.ReadFile(NomedoArquivo);
	    int found =0;
	    String[] splitedString;
	    for( String line: lines)  
	   {  
	                  
	       if(line.contains(">>>")){
	           String nome = user.get("nome");
	           map.put(nome, user); 
	           user = new HashMap<String, String>();
	           
	       } 
	       
	       else{
	    	   
	           splitedString = line.split(":");   
	           user.put(splitedString[0],splitedString[1]);  
	           
	       }
	   }    
	    
	    return map;            
	}

}
