package fr.wdctn.classes;

public class Logistique
{
	private String zone;
	
	private int rayon;
	
	private String moyenLocomotion;
	
	private int plageHoraire;
	
	public Logistique(String zone, int rayon, String moyenLocomotion, int plageHoraire)
	{
		this.zone = zone;
		this.rayon = rayon;
		this.moyenLocomotion = moyenLocomotion;
		this.plageHoraire = plageHoraire;
	}

	public String getZone()
	{
		return zone;
	}

	public void setZone(String zone)
	{
		this.zone = zone;
	}

	public int getRayon()
	{
		return rayon;
	}

	public void setRayon(int rayon)
	{
		this.rayon = rayon;
	}

	public String getMoyenLocomotion()
	{
		return moyenLocomotion;
	}

	public void setMoyenLocomotion(String moyenLocomotion)
	{
		this.moyenLocomotion = moyenLocomotion;
	}

	public int getPlageHoraire()
	{
		return plageHoraire;
	}

	public void setPlageHoraire(int plageHoraire)
	{
		this.plageHoraire = plageHoraire;
	}
}
