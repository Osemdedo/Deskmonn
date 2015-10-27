package deskmon.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class BancodeQuestoes {
	
	
	private Map<String, Map<String,Questao>> DicQuestoes;
	private Map<String, Map<String,Integer>> numQuestoes;
	String PeguntasArquivo = "Perguntas.txt";
	

	
	public BancodeQuestoes(){
		
		Map<String, Map<String,String>> DicQuestoesString = ManipulaArquivo.LoadAllContent(PeguntasArquivo);
		DicQuestoes = new HashMap<String, Map<String,Questao>>();
		numQuestoes = new HashMap<String, Map<String,Integer>>();
		
		
		for( String firstkey: DicQuestoesString.keySet()){

			Map<String,String> DicQuestoesStringData = DicQuestoesString.get(firstkey);
			Map<String,Questao> DicQuestoesData = new HashMap<String,Questao>();
			int numPergunta = 0;
			String materia = firstkey;
			String[] questao;
			int numQuestaoFacil =0 , numQuestaoMedio = 0 , numQuestaoDificil =0;
			
			for( String secondKey : DicQuestoesStringData.keySet()){

				
				
				if(secondKey.contains("pergunta")){
					
					
					numPergunta = numPergunta+1;
					questao = DicQuestoesStringData.get(secondKey).split(";");
					String questaoString = questao[0];
					String opcao1 = questao[1];
					String opcao2 = questao[2];
					String opcao3 = questao[3];
					String opcao4 = questao[4];
					int numperguntas = Integer.parseInt(DicQuestoesStringData.get("numero"));
					int dificuldade = Integer.parseInt( questao[5]);							
					int resposta = Integer.parseInt(questao[6]);	
					
					numQuestaoFacil = (dificuldade==1)? numQuestaoFacil+1:numQuestaoFacil;
					numQuestaoMedio = (dificuldade==2)? numQuestaoMedio+1:numQuestaoMedio;
					numQuestaoDificil = (dificuldade==3)? numQuestaoDificil+1:numQuestaoDificil;
					
					Questao novaQuestao = new Questao(questaoString,opcao1,opcao2,opcao3,opcao4,dificuldade,resposta,materia);					
					DicQuestoesData.put("pergunta"+numPergunta, novaQuestao);	

					
				}
			}
			
			Map<String,Integer> dificuldadeMap = new HashMap<String,Integer>();
			dificuldadeMap.put("facil", numQuestaoFacil);
			dificuldadeMap.put("medio", numQuestaoMedio);
			dificuldadeMap.put("dificil", numQuestaoDificil);
			dificuldadeMap.put("numQuestoes", numPergunta);
			
			numQuestoes.put(materia, dificuldadeMap);
			
			DicQuestoes.put(materia, DicQuestoesData);
			
			
		}

	}
	
	
	
	
	public Questao Get_Questao(String materia,int dificuldade){
		
		Random rnd = new Random();
		int numDeQuestoes;
		int index;
		String dificuldadeString =""; 
	    
		if(dificuldade==1)
			dificuldadeString ="facil";
		if(dificuldade==2)
			dificuldadeString ="medio";
		if(dificuldade==3)
			dificuldadeString ="dificil";
				 
		numDeQuestoes = numQuestoes.get(materia).get(dificuldadeString);
		index = rnd.nextInt(numDeQuestoes)+1;


		for (String questao : DicQuestoes.get(materia).keySet()) {
			
			Questao elemento = DicQuestoes.get(materia).get(questao);
			if(elemento.getDificuldade() == dificuldade)
				index--;
			if(index==0){
				elemento.setRespondida(true);
				return elemento;
			}
		}
		
		return null;
	}
	
	

}
