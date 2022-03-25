package com.myTI;

public class Anime {
	//A maioria foi setada como string para facilitar no inicio...
	private int animeID;
	private String japaneseName;
	private String americanName;
	private String gender;
	private String studio;
	
	
	public Anime(int i, String string, String string2, char c) {
		this.animeID = -1;
		this.japaneseName = "";
		this.americanName = "";
		this.gender = "";
		this.studio = "";
	}
	public Anime(int animeID, String japaneseName, String americanName, String gender, String studio) {
		super();
		this.animeID = animeID;
		this.japaneseName = japaneseName;
		this.americanName = americanName;
		this.gender = gender;
		this.studio = studio;
	}
	//set animeID nao vai existir;
	int getID() {
		return animeID;
	}
	public String getJapaneseName() {
		return japaneseName;
	}
	public void setJapaneseName(String japaneseName) {
		this.japaneseName = japaneseName;
	}
	public String getAmericanName() {
		return americanName;
	}
	public void setAmericanName(String americanName) {
		this.americanName = americanName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	
	@Override
	public String toString() {
		return "Anime [ animeID = " + animeID + "japaneseName=" + japaneseName + ", americanName=" + americanName + ", gender=" + gender
				+ ", studio=" + studio + ", getJapaneseName()=" + getJapaneseName() + ", getAmericanName()="
				+ getAmericanName() + ", getGender()=" + getGender() + ", getStudio()=" + getStudio() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
