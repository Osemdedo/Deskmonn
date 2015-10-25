package deskmon.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa {
	
	static String ArquivoCidade = "Cidade.txt";
	static String ArquivoMonstro = "Monstro.txt";
	Map<String, Map<String,String> > mapCidade;
	Map<String, Map<String,String> > mapMonstro;
	Map<String,String> cidadeData; 
	Map<String,String> monstrodeData; 
	private List<MonstroInimigo> listaMonstro;
	private List<Cidade> listaCidade;

	
	
	
	
	
	public Mapa(){
		
		mapCidade = ManipulaArquivo.LoadAllContent(ArquivoCidade);
		mapMonstro = ManipulaArquivo.LoadAllContent(ArquivoMonstro);
		listaMonstro = new ArrayList<MonstroInimigo>();
		listaCidade = new ArrayList<Cidade>();
		
		
		
		for(String firstKey : mapCidade.keySet()){
			//Cidade novaCidade = new Cidade(firstKey);
			cidadeData = mapCidade.get(firstKey);
			for(String secondKey: cidadeData.keySet()){
				//System.out.println("key "+secondKey+" value "+cidadeData.get(secondKey) );
				
				if(secondKey.contains("monstro")){				
					
					//System.out.println(mapMonstro.get(cidadeData.get(secondKey)));
					monstrodeData = mapMonstro.get(cidadeData.get(secondKey));
					int dano = Integer.parseInt(monstrodeData.get("dano"));
					int vida = Integer.parseInt(monstrodeData.get("vida"));
					int sprite = Integer.parseInt(monstrodeData.get("sprite"));
					String nome = monstrodeData.get("nome");
					//public Monstro(int vida, int dano, int sprite, String nome)
					int experiencia = Integer.parseInt(monstrodeData.get("experiencia"));
					int chefe =Integer.parseInt(monstrodeData.get("chefe"));
					boolean chefeChoice = (chefe==1)?true:false;
					 
					//System.out.println(dano+" "+vida+" "+sprite+" "+nome+" "+experiencia+" "+chefe);
					MonstroInimigo novoMonstro = new MonstroInimigo(vida, dano, sprite, nome, experiencia, chefeChoice);
					listaMonstro.add(novoMonstro);
					
				}
				
			}
			
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
