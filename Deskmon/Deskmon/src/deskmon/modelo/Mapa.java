package deskmon.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/* 
 * Essa classe tem a funcao de carregar todo o mapa, 
 * que contem todos os monstros e cidades 
 */
public class Mapa {
	
	//Nome dor arquivo que cotem as Cidades 
	static String ArquivoCidade = "Cidade.txt";
	//Nome dor arquivo que cotem os Monstros 
	static String ArquivoMonstro = "Monstro.txt";
	Map<String, Map<String,String> > mapCidade;
	Map<String, Map<String,String> > mapMonstro;
	Map<String,String> cidadeData; 
	Map<String,String> monstrodeData; 
	private List<MonstroInimigo> listaMonstro;
	private List<Cidade> listaCidade;

	
	// O contrutor de mapa e o responsavel de carregar todos os dados 
	public Mapa(){
		
		//Recebe todos os dados de todas as cidades do file 
		mapCidade = ManipulaArquivo.LoadAllContent(ArquivoCidade);
		//Recebe todos os dados de todos os monstros do file  
		mapMonstro = ManipulaArquivo.LoadAllContent(ArquivoMonstro);
		listaMonstro = new ArrayList<MonstroInimigo>();
		listaCidade = new ArrayList<Cidade>();
		
		
		/*
		 * Corre por todas as cidades Procurando os seus montros
		 * ao decorrer da procura os monstros sao colacados em um List(listaMonstro) 
		 * para a criacao de todas as cidades. As cidades sao armazenadas em outra Lista
		 * (ListaCidade)
		 */
		
		for(String firstKey : mapCidade.keySet()){
			
			cidadeData = mapCidade.get(firstKey);
			for(String secondKey: cidadeData.keySet()){

				//Procura a tag monstro que se localizava no file
				if(secondKey.contains("monstro")){				
					
					//Aglomera todos os dados para a criacao de monstroInimigo
					monstrodeData = mapMonstro.get(cidadeData.get(secondKey));
					int dano = Integer.parseInt(monstrodeData.get("dano"));
					int vida = Integer.parseInt(monstrodeData.get("vida"));
					int sprite = Integer.parseInt(monstrodeData.get("sprite"));
					String nome = monstrodeData.get("nome");
					int experiencia = Integer.parseInt(monstrodeData.get("experiencia"));
					int chefe =Integer.parseInt(monstrodeData.get("chefe"));
					boolean chefeChoice = (chefe==1)?true:false;
					 
					//cria a instancia de monstro e bota na Lista
					MonstroInimigo novoMonstro = new MonstroInimigo(vida, dano, sprite, nome, experiencia, chefeChoice);
					listaMonstro.add(novoMonstro);					
				}				
			}
			
			//Recebe a lista de monstro e cria a instancia de cidade 
			String materia = cidadeData.get("materia");
			String nome = cidadeData.get("nome");
			Cidade novaCidade = new Cidade(nome,listaMonstro,materia);
			listaCidade.add(novaCidade);
			listaMonstro = new ArrayList<MonstroInimigo>();	

		}
	}
	
	
	
	public List<Cidade> getLista() {
		return listaCidade;
	}

	public void setLista(List<Cidade> lista) {
		this.listaCidade = lista;
	}
	
	
	
	
}
