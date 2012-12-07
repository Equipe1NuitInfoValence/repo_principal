package fr.wdctn.classes;

import java.util.ArrayList;

/**
 * @author Loic
 * Classe définissant un planning
 */
public class Planning
{
	private ArrayList<Evenement> aLEvenement;

	/**
	 * Getter permettant de récupérer une liste d'évênement
	 * @return aLEvenement
	 */
	public ArrayList<Evenement> getaLEvenement()
	{
		return aLEvenement;
	}

	/**
	 * 
	 * @param aLEvenement
	 */
	public void setaLEvenement(ArrayList<Evenement> aLEvenement)
	{
		this.aLEvenement = aLEvenement;
	}
}
