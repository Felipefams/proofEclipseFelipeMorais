package com.myTI;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Anime anime = new Anime();
		if(dao.inserirAnime(anime) == true) {
			System.out.println("Inser������������o com sucesso -> " + anime.toString());
		}
		//Atualizar usu������rio
		anime.setJapaneseName("nova senha");
		dao.atualizarAnime(anime);
		
		//Excluir usu������rio
		dao.excluirAnime(anime.getID());
		//Mostrar usu������rios
		Anime[] animes = null;
		animes = dao.getAnimes();
		System.out.println("==== Mostrar usu������rios === ");		
		for(int i = 0; i < animes.length; i++) {
			System.out.println(animes[i].toString());
		}
		
		dao.close();
	}
}