package fr.wdctn.classes;

/**
 * @author Loic
 * Classe définissant une activité. une activité peut être une visite, manger dans
 * un restaurant, etc...
 */
public class Activite
{
	/**
	 * Heure de debut de l'activité
	 */
	private int debut;
	
	/**
	 * Heure de fin de l'activité
	 */
	private int fin;
	
	/**
	 * 
	 */
	private String libelle;
	
	/**
	 * 
	 */
	public Activite()
	{
		this.debut = 0;		// A changer de type
		this.fin = 0;		// A changer de type
		this.libelle = "";
	}
}
