package com.myTI;

import java.sql.*;

public class DAO {
	private Connection conexao;
	
	public DAO() {
		conexao = null;
	}
	//esse metodo vai ficar quase igual o do exemplo
	public boolean conectar() {
		String driverName = "org.postgresql.Driver";                    
		String serverName = "localhost";
		String mydatabase = "testeFelipe";
		int porta = 5432;
		String url = "jdbc:postgresql://" + serverName + ":" + porta +"/" + mydatabase;
		String username = "ti2cc";
		String password = "ti@cc";
		boolean status = false;

		try {
			Class.forName(driverName);
			conexao = DriverManager.getConnection(url, username, password);
			status = (conexao == null);
			System.out.println("Conex������������������o efetuada com o postgres!");
		} catch (ClassNotFoundException e) { 
			System.err.println("Conex������������������o N������������������O efetuada com o postgres -- Driver n������������������o encontrado -- " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Conex������������������o N������������������O efetuada com o postgres -- " + e.getMessage());
		}

		return status;
	}
	//mesmo tambem
	public boolean close() {
		boolean status = false;
		
		try {
			conexao.close();
			status = true;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return status;
	}
	//aqui ja muda
	public boolean inserirAnime(Anime anime) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO animes (japanesename, americanname, gender, studio) "
					       + "VALUES ("+anime.getJapaneseName()+ ", '" + anime.getAmericanName() + "', '"  
					       + anime.getGender() + "', '" + anime.getStudio() + "');");
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean atualizarAnime(Anime anime) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			String sql = "UPDATE anime SET japanesename = '" + anime.getJapaneseName() + "', americanname = '"  
				       + anime.getGender() + "', studio = '" + anime.getStudio() + "'"
					   + " WHERE animeID = " + anime.getID();
			st.executeUpdate(sql);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	public boolean excluirAnime(int animeID) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM anime WHERE animeID = " + animeID);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public Anime[] getAnimes() {
		Anime[] animes = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = st.executeQuery("SELECT * FROM anime");		
	         if(rs.next()){
	             rs.last();
	             animes = new Anime[rs.getRow()];
	             rs.beforeFirst();

	             for(int i = 0; rs.next(); i++) {
	                animes[i] = new Anime(rs.getInt("animeID"), rs.getString("japanesename"), 
	                		                  rs.getString("amricanname"), rs.getString("gender"), rs.getString("studio"));
	             }
	          }
	          st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return animes;
	}
	
}
