package fr.wdctn.classes;

/**
 * @author Loic
 * Interface pour la base de donnée
 */
public interface InterBdD
{

	/**
	 * Methode renvoyant un evenement
	 * @param Parcours
	 * @param Info
	 * @return un evenement
	 */
	public Evenement getEvenement(Planning Parcours, Information Info);
	
}
