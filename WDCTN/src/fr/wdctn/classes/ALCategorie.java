package fr.wdctn.classes;

import java.util.ArrayList;

public class ALCategorie
{
	private ArrayList<Categorie> alCategorie;
	
	public ALCategorie()
	{
		this.alCategorie = null;
	}
	
	public ALCategorie(ArrayList<Categorie> alCategorie)
	{
		this.alCategorie = alCategorie;
	}
	
	public ArrayList<Categorie> getAlList()
	{
		return this.alCategorie;
	}
	
	public void setAlList(ArrayList<Categorie> alCategorie)
	{
		this.alCategorie = alCategorie;
	}
}
