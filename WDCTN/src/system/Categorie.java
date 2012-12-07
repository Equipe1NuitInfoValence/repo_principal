package system;

import java.util.Map;

public class Categorie
{
	private String strCategorie;
	
	private int idCategorie;
	
	private Map<Integer,String> tag;
	
	public Categorie()
	{
		this.strCategorie = "";
		this.idCategorie = 0;
		this.tag = null;
	}
	
	public Categorie(String strCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = 0;
		this.tag = null;
	}
	
	public Categorie(String strCategorie, int idCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.tag = null;
	}
	
	public Categorie(String strCategorie, int idCategorie, Map<Integer,String> tag)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.tag = tag;
	}

	public String getStrCategorie() {
		return strCategorie;
	}

	public void setStrCategorie(String strCategorie) {
		this.strCategorie = strCategorie;
	}

	public int getId() {
		return idCategorie;
	}

	public void setId(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public Map<Integer, String> getTag() {
		return tag;
	}

	public void setTag(Map<Integer, String> categorie) {
		this.tag = categorie;
	}
}
