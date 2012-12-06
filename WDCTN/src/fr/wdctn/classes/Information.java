package fr.wdctn.classes;

import java.util.ArrayList;

/**
 * @author Loic
 * Classe regroupant les informations qui seront demandé à l'utilisateur
 */
public class Information
{
	/**
	 * Nom de la ville
	 */
	private String zone;
	
	/**
	 * Rayon dans lequel le visiteur veut "trouver" des évênement
	 */
	private int rayon;
	
	/**
	 * Moyen de déplacement de l'utilisateur pour se deplacer dans le lieu d'un des évênements
	 */
	private MoyenLocomotion moyenLocomotion;
	
	/**
	 * Periode pendant laquelle l'utilisateur va participer à des évênements
	 */
	private Periode plageHoraire;
	
	/**
	 * Liste des gouts
	 */
	private ArrayList<Integer> aLGout;
	
	/**
	 * Constructeur par défaut
	 */
	public Information()
	{
		this.zone = "";
		this.rayon = 0;
		this.moyenLocomotion = null;
		this.plageHoraire = null;
		this.setaLGout(null);
	}
	
	/**
	 * Constructeur prenant quatres parametres : le nom de la ville, le rayon,
	 * le moyen de locomotion et la plage horaire
	 * @param zone Nom de la ville
	 * @param rayon Rayon dans lequel le visiteur veut "trouver" des activité
	 * @param moyenLocomotion Moyen de locomotion de l'utilisateur
	 * @param plageHoraire Periode pendant laquelle l'utilisateur va réaliser des activités
	 * @param aLGout Liste des gouts
	 */
	public Information(String zone, int rayon, MoyenLocomotion moyenLocomotion, Periode plageHoraire, ArrayList<Integer> aLGout)
	{
		this.zone = zone;
		this.rayon = rayon;
		this.moyenLocomotion = moyenLocomotion;
		this.plageHoraire = plageHoraire;
		this.aLGout = aLGout;
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
	 * @return  Rayon dans lequel le visiteur veut "trouver" des évênements
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
	public MoyenLocomotion getMoyenLocomotion()
	{
		return moyenLocomotion;
	}

	/**
	 * @param moyenLocomotion Modifie le moyen de locomotion de l'utilisateur
	 */
	public void setMoyenLocomotion(MoyenLocomotion moyenLocomotion)
	{
		this.moyenLocomotion = moyenLocomotion;
	}

	/**
	 * @return Periode pendant laquelle l'utilisateur va participer à des évênements
	 */
	public Periode getPlageHoraire()
	{
		return plageHoraire;
	}

	/**
	 * @param plageHoraire modifie la Periode pendant laquelle l'utilisateur va participer à des évênements
	 */
	public void setPlageHoraire(Periode plageHoraire)
	{
		this.plageHoraire = plageHoraire;
	}

	/**
	 * @return La liste des gouts
	 */
	public ArrayList<Integer> getaLGout()
	{
		return aLGout;
	}

	/**
	 * @param aLGout Modifie la liste des gouts
	 */
	public void setaLGout(ArrayList<Integer> aLGout)
	{
		this.aLGout = aLGout;
	}
}
