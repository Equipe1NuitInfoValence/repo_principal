package fr.wdctn.classes;

import fr.wdctn.exceptions.PosGoutInexistantException;

/**
 * @author Loic
 *
 */
public class Gout
{
	private final static int NBGOUT = 5;
	
	private String[] gout;
	
	/**
	 * 
	 */
	public Gout()
	{
		this.gout = new String[NBGOUT];
	}

	/**
	 * @return
	 */
	public String[] getGout()
	{
		return gout;
	}
	
	/**
	 * @param pos
	 * @return
	 * @throws PosGoutInexistantException
	 */
	public String getGout(int pos) throws PosGoutInexistantException
	{
		if (pos > NBGOUT)
			throw new PosGoutInexistantException();
		return gout[pos];
	}

	/**
	 * @param gout
	 */
	public void setGout(String[] gout)
	{
		this.gout = gout;
	}
	
	/**
	 * @param gout
	 * @param pos
	 * @throws PosGoutInexistantException
	 */
	public void setGout(String gout, int pos) throws PosGoutInexistantException
	{
		if (pos > NBGOUT)
			throw new PosGoutInexistantException();
		this.gout[pos] = gout;
	}
	
	
}
