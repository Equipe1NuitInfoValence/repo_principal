package fr.wdctn.classes;

import java.util.Map;

/**
 * @author Loic
 * Classe permettant de gérer les catégories du patrimoine
 */
public class Categorie
{
	private String strCategorie;
	
	private int idCategorie;
	
	private Map<Integer,String> tag;
	
	/**
	 * Constructeur par defaut
	 */
	public Categorie()
	{
		this.strCategorie = "";
		this.idCategorie = 0;
		this.tag = null;
	}
	
	/**
	 * @param strCategorie libellé de la categorie
	 */
	public Categorie(String strCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = 0;
		this.tag = null;
	}
	
	/**
	 * @param strCategorie libellé de la categorie
	 * @param idCategorie l'id de la categorie
	 */
	public Categorie(String strCategorie, int idCategorie)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.tag = null;
	}
	
	/**
	 * Constructeur prenant trois parametres
	 * @param strCategorie libellé de la categorie
	 * @param idCategorie l'id de la categorie
	 * @param tag 
	 */
	public Categorie(String strCategorie, int idCategorie, Map<Integer,String> tag)
	{
		this.strCategorie = strCategorie;
		this.idCategorie = idCategorie;
		this.tag = tag;
	}

	/**
	 * @return le libellé de la categorie
	 */
	public String getStrCategorie() {
		return strCategorie;
	}

	/**
	 * @param strCategorie
	 */
	public void setStrCategorie(String strCategorie) {
		this.strCategorie = strCategorie;
	}

	/**
	 * Getteur permettant de recuperer l'id de la categorie
	 * @return l'id de la categorie
	 */
	public int getId() {
		return idCategorie;
	}

	/**
	 * @param idCategorie
	 */
	public void setId(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	/**
	 * @return tag Couple <id de la categorie, nom de la categorie>
	 */
	public Map<Integer, String> getTag() {
		return tag;
	}

	/**
	 * @param categorie
	 */
	public void setTag(Map<Integer, String> categorie) {
		this.tag = categorie;
	}
	
	public void addTag(int id, String libel)
	{
		this.tag.put(id, libel);
	}
}

