package fr.wdctn.classes;

import java.util.Calendar;
import java.util.Date;


/**
 * @author Loic
 * Classe definissant une periode. Une periode possede une date de debut et une date de fin
 * une période est utilisé dans le planning
 *  */
public class Periode
{
	/**
	 * Date de debut 
	 */
	private Date dateDebut;
	
	/**
	 * Date de fin
	 */
	private Date dateFin;
	
	/**
	 * Heure de debut
	 */
	private Calendar heureDebut;
	
	/**
	 * Heure de fin
	 */
	private Calendar heureFin;
	
	/**
	 * Constructeur par defaut 
	 */
	public Periode()
	{
		this.dateDebut = null;
		this.dateFin = null;
		this.heureDebut = null;
		this.heureFin = null;
	}
	
	
	/** 
	 * Constructeur personnalisee permettant de créer une periode
	 * @param debut
	 * @param fin
	 * @param heureDebut
	 * @param heureFin
	 */
	public Periode(Date debut, Date fin, Calendar heureDebut, Calendar heureFin)
	{
		this.dateDebut = debut;
		this.dateFin = fin;
		this.heureDebut = heureDebut;
		this.heureFin = heureFin;
	}


	/**
	 * @return La date de debut
	 */
	public Date getDateDebut()
	{
		return dateDebut;
	}


	/**
	 * @param dateDebut Modifie la date de debut
	 */
	public void setDateDebut(Date dateDebut)
	{
		this.dateDebut = dateDebut;
	}


	/**
	 * @return La date de fin
	 */
	public Date getDateFin()
	{
		return dateFin;
	}


	/**
	 * @param dateFin Modifie la date de fin
	 */
	public void setDateFin(Date dateFin)
	{
		this.dateFin = dateFin;
	}


	/**
	 * @return L'heure de début
	 */
	public Calendar getHeureDebut()
	{
		return heureDebut;
	}


	/**
	 * @param heureDebut Modifie l'heure de debut
	 */
	public void setHeureDebut(Calendar heureDebut)
	{
		this.heureDebut = heureDebut;
	}


	/**
	 * @return L'heure de fin
	 */
	public Calendar getHeureFin()
	{
		return heureFin;
	}


	/**
	 * @param heureFin Modifie l'heure de fin
	 */
	public void setHeureFin(Calendar heureFin)
	{
		this.heureFin = heureFin;
	}
	
	
}
