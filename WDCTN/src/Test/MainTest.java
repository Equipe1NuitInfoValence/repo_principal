package Test;

import fr.wdctn.classes.GestionBdD;

public class MainTest
{
	private static GestionBdD gestBdD;

	public static void main(String[] args)
	{
		gestBdD = new GestionBdD("109.69.193.29","root","nuOGUMtutBWjCVMBS4is");
		gestBdD.getEvenement();
		
	}
	
}
