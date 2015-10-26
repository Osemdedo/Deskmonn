package deskmon.modelo;

import java.util.HashMap;
import java.util.Map;

public class BancodeQuestoes {
	
	private Map<String, Map<String,String>> DicQuestoesString ;
	private Map<String, Map<String,Questao>> DicQuestoes;
	
	String PeguntasArquivo = "Perguntas.txt";
	String[] questao;
	public BancodeQuestoes(){
		
		DicQuestoesString = ManipulaArquivo.LoadAllContent(PeguntasArquivo);
		DicQuestoes = new HashMap<String, Map<String,Questao>>();
		
		
		for( String firstkey: DicQuestoesString.keySet()){
			//System.out.println(firstkey);
			Map<String,String> DicQuestoesStringData = DicQuestoesString.get(firstkey);
			for( String secondKey : DicQuestoesStringData.keySet()){
				
				
				
				if(secondKey.contains("pergunta")){
					
					questao = DicQuestoesStringData.get(secondKey).split(";");
					String questaoString = questao[0];
					String opcao1 = questao[1];
					String opcao2 = questao[2];
					String opcao3 = questao[3];
					String opcao4 = questao[4];
					int numperguntas = Integer.parseInt(DicQuestoesStringData.get("numero"));
					int dificuldade = Integer.parseInt( questao[5]);
					int resposta = Integer.parseInt(questao[6]);
					String materia = firstkey;
					
					Map<String,String> DicQuestoesData = DicQuestoesString.get(firstkey);
					Questao novaQuestao = new Questao(questaoString,opcao1,opcao2,opcao3,opcao4,dificuldade,resposta,materia);
					
					//DicQuestoesData.put(key, value)
					
					

					
				
					
					
					
					
					
				}
			}
		}		
	}

}
