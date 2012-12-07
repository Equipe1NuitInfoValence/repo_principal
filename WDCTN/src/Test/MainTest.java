package Test;

import fr.wdctn.classes.GestionBdD;

/**
 * @author Loic
 * Classe principal
 */
public class MainTest
{
	private static GestionBdD gestBdD;

	/**
	 * Programme principal
	 * @param args
	 */
	public static void main(String[] args)
	{
		//gestBdD = new GestionBdD("jdbc:mysql://109.69.193.29/eq1","root","nuOGUMtutBWjCVMBS4is");
		gestBdD = new GestionBdD("jdbc:mysql://109.69.193.29/eq1","eq1","iutvalence");
		gestBdD.test();
		
	}
	
}
