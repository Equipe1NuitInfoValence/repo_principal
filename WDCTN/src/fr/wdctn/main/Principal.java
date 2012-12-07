package fr.wdctn.main;

import java.sql.SQLException;

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
	private GestionBdD gestBD;
	
	public Principal()
	{
		super();
		this.info = null;
		this.gestBD = new GestionBdD("jdbc:mysql://109.69.193.29/eq1","eq1","iutvalence","com.mysql.jdbc.Driver");
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
		MapCat mp = null;
	//	try
	//	{
	//		mp = gestBD.genererMapCat();
	//	} catch (SQLException e)
	//	{
	//		// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		return mp;
	}
	

}

