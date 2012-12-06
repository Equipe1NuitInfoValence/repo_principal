package fr.wdctn.classes;

/**
 * @author Loic
 */
public class Logistique
{
	private String zone;
	
	private int rayon;
	
	private String moyenLocomotion;
	
	private int plageHoraire;
	
	/**
	 * Constructeur par défaut
	 */
	public Logistique()
	{
		this.zone = "";
		this.rayon = 0;
		this.moyenLocomotion = "";
		this.plageHoraire = 0;
	}
	
	/**
	 * Constructeur prenant quatres parametres : le nom de la ville, le rayon,
	 * le moyen de locomotion et la plage horaire
	 * @param zone Nom de la ville
	 * @param rayon
	 * @param moyenLocomotion Moyen de locomotion de l'utilisateur
	 * @param plageHoraire 
	 */
	public Logistique(String zone, int rayon, String moyenLocomotion, int plageHoraire)
	{
		this.zone = zone;
		this.rayon = rayon;
		this.moyenLocomotion = moyenLocomotion;
		this.plageHoraire = plageHoraire;
	}

	/**
	 * @return le nom de la ville
	 */
	public String getZone()
	{
		return zone;
	}

	/**
	 * @param zone Modifie le nom de la ville
	 */
	public void setZone(String zone)
	{
		this.zone = zone;
	}

	/**
	 * @return 
	 */
	public int getRayon()
	{
		return rayon;
	}

	/**
	 * @param rayon
	 */
	public void setRayon(int rayon)
	{
		this.rayon = rayon;
	}

	/**
	 * @return le moyen de locomotion de l'utilisateur
	 */
	public String getMoyenLocomotion()
	{
		return moyenLocomotion;
	}

	/**
	 * @param moyenLocomotion Modifie le moyen de locomotion de l'utilisateur
	 */
	public void setMoyenLocomotion(String moyenLocomotion)
	{
		this.moyenLocomotion = moyenLocomotion;
	}

	/**
	 * @return
	 */
	public int getPlageHoraire()
	{
		return plageHoraire;
	}

	/**
	 * @param plageHoraire
	 */
	public void setPlageHoraire(int plageHoraire)
	{
		this.plageHoraire = plageHoraire;
	}
}
