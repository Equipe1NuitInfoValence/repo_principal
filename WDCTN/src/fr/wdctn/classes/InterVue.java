package fr.wdctn.classes;

/**
 * @author Loic
 * Interface pour l'affichage de l'interface
 */
public interface InterVue
{
	/**
	 * Methode permettant de recupérer les Informations sur l'utilisateur
	 * @param Info Information
	 */
	public void setInfo(Information info);
	public void demarrer();
	public MapCat getMapCat();
	
}
