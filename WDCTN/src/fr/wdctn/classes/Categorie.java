package fr.wdctn.classes;

import java.util.Map;

public class Categorie
{
	private String strCategorie;
	
	private int idCategorie;
	
	private Map<Integer,String> categorie;
	
	public Categorie()
	{
		this.strCategorie = "";
		this.idCategorie = 0;
		this.categorie = null;
	}
	
	public Categorie(String strCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = 0;
		this.categorie = null;
	}
	
	public Categorie(String strCategorie, int idCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.categorie = null;
	}
	
	public Categorie(String strCategorie, int idCategorie, Map<Integer,String> categorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.categorie = categorie;
	}
}
