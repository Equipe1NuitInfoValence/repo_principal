package fr.wdctn.classes;

import java.util.Calendar;

/**
 * @author Loic
 * Classe définissant un évênement
 */
public class Evenement
{
	/**
	 * Heure de debut de l'activité
	 */
	private Calendar debut;
	
	/**
	 * Heure de fin de l'activité
	 */
	private Calendar fin;
	
	/**
	 * Libellé de l'activité
	 */
	private String libelle;
	
	/**
	 * Numero de l'evenement
	 */
	private int id;
	
	/**
	 * Constructeur par defaut
	 */
	public Evenement()
	{
		this.debut = null;		
		this.fin = null;		
		this.libelle = "";
		this.setId(0);
	}

	/**
	 * @return L'heure de debut de l'évênement
	 */
	public Calendar getDebut()
	{
		return debut;
	}

	/**
	 * @param debut Modifie l'heure de début de l'évênement
	 */
	public void setDebut(Calendar debut)
	{
		this.debut = debut;
	}

	/**
	 * @return L'heure de fin de l'évênement
	 */
	public Calendar getFin()
	{
		return fin;
	}

	/**
	 * @param fin modifie l'heure de fin de l'évênement
	 */
	public void setFin(Calendar fin)
	{
		this.fin = fin;
	}

	/**
	 * @return Le nom de l'évênement
	 */
	public String getLibelle()
	{
		return libelle;
	}

	/**
	 * @param libelle Modifie le nom de l'évênement
	 */
	public void setLibelle(String libelle)
	{
		this.libelle = libelle;
	}

	/**
	 * @return Le numéro de l'évênement
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id Modifie le numéro de l'évênement
	 */
	public void setId(int id)
	{
		this.id = id;
	}
}
