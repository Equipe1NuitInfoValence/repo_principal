package fr.wdctn.classes;

import java.util.Date;


/**
 * @author Loic
 * Classe definissant une periode. Une periode possede une date de debut et une date de fin
 *  */
public class Periode
{
	/**
	 * 
	 */
	private Date dateDebut;
	
	/**
	 * 
	 */
	private Date dateFin;
	
	/**
	 * Constructeur par defaut 
	 */
	public Periode()
	{
		this.dateDebut = null;
		this.dateFin = null;
	}
	
	/**
	 * Constructeur personnalisé prenant en parametre une date de debut et une date de fin
	 * @param debut
	 * @param fin
	 */
	public Periode(Date debut, Date fin)
	{
		this.dateDebut = debut;
		this.dateFin = fin;
	}
	
}
