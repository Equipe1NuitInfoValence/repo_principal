package fr.wdctn.main;

import fr.wdctn.classes.GestionBdD;
import fr.wdctn.classes.Information;
import fr.wdctn.classes.InterVue;
import fr.wdctn.classes.MapCat;

/**
 * @author Loic
 *
 */
public class Principal implements InterVue
{

	private Information info;
	private GestionBdD GestBD;
	
	public Principal()
	{
		super();
		this.info = null;
		this.GestBD = new GestionBdD("jdbc:mysql://109.69.193.29/eq1","eq1","iutvalence");
	}

	@Override
	public void setInfo(Information info)
	{
		this.info = info;
	}

	@Override
	public void demarrer()
	{
		
		
	}

	@Override
	public MapCat getMapCat()
	{
		
		
		return null;
	}
	

}

