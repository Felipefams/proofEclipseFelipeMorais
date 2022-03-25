package com.ti2cc;

public class Anime {
	private String japaneseName;
	private String americanName;
	private String gender;
	private String studio;
	
	
	
	public Anime(String japaneseName, String americanName, String gender, String studio) {
		super();
		this.japaneseName = japaneseName;
		this.americanName = americanName;
		this.gender = gender;
		this.studio = studio;
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
		return "Anime [japaneseName=" + japaneseName + ", americanName=" + americanName + ", gender=" + gender
				+ ", studio=" + studio + ", getJapaneseName()=" + getJapaneseName() + ", getAmericanName()="
				+ getAmericanName() + ", getGender()=" + getGender() + ", getStudio()=" + getStudio() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
