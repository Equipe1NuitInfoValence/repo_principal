package mypackage.pack.client;

import java.sql.Date;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import fr.wdctn.classes.Periode;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FenetreRenseignement implements EntryPoint {
	/**
	 * 
	 */

	public void onModuleLoad() {		
		
		final TextBox nameFieldLieu = new TextBox();		
		final TextBox nameFieldRayon = new TextBox();	
		final TextBox nameFieldHeureDebut = new TextBox();
		final TextBox nameFieldMinuteDebut = new TextBox();		
		final TextBox nameFieldDureeHeure = new TextBox();		
		final TextBox nameFieldDureeMinute = new TextBox();
		final TextBox nameFieldNumeroJours = new TextBox();
		final TextBox nameFieldNumeroMois = new TextBox();	
		final Button boutonPageSuiv = new Button("Continuer");
		final ListBox listJours = new ListBox();
		final ListBox listMois = new ListBox();
				
		listMois.insertItem("Janvier",1);
		listMois.insertItem("Fevrier",2);
		listMois.insertItem("Mars",3);
		listMois.insertItem("Avril",4);
		listMois.insertItem("Mai",5);
		listMois.insertItem("Juin",6);
		listMois.insertItem("Juillet",7);
		listMois.insertItem("Aout",8);
		listMois.insertItem("Septembre",9);
		listMois.insertItem("Octobre",10);
		listMois.insertItem("Novembre",11);
		listMois.insertItem("Decembre",12);
		
		listJours.insertItem("Lundi", 1);
		listJours.insertItem("Mardi", 2);
		listJours.insertItem("Mercredi", 3);
		listJours.insertItem("Jeudi",4);
		listJours.insertItem("Vendredi", 5);
		listJours.insertItem("Samedi", 6);
		listJours.insertItem("Dimanche", 7);		
		
		//On les rends visible		
		RootPanel.get("nameFieldContainer").add(nameFieldLieu);
		RootPanel.get("nameFieldContainer").add(nameFieldRayon);
		
		RootPanel.get("nameFieldContainer").add(nameFieldHeureDebut);
		RootPanel.get("nameFieldContainer").add(nameFieldMinuteDebut);
		
		RootPanel.get("nameFieldContainer").add(nameFieldDureeHeure);
		RootPanel.get("nameFieldContainer").add(nameFieldDureeMinute);
		
		RootPanel.get("nameFieldContainer").add(nameFieldNumeroJours);
		RootPanel.get("nameFieldContainer").add(nameFieldNumeroMois);
		
		RootPanel.get("nameFieldContainer").add(listJours);
		RootPanel.get("sendButtonContainer").add(boutonPageSuiv);
		
		//création et rendu du bouton suivant		
		
		boutonPageSuiv.addStyleName("sendButton");		
		nameFieldLieu.setText("Entrez le nom du lieu");
		//nameFieldLieu.setFocus(true);
		nameFieldRayon.setText("0");
		nameFieldHeureDebut.setText("heure de début");
		nameFieldMinuteDebut.setText("Minute de début");
		nameFieldDureeHeure.setText("Duree (heures)");
		nameFieldDureeMinute.setText("Duree");		
	
		Information nouvInfo = new Information();
		nouvInfo.setZone(nameFieldLieu.getValue());
		nouvInfo.setRayon(Integer.parseInt(nameFieldRayon.getValue()));
		
		int nouvDebutMois = listMois.getTabIndex();
		int nouvDebutJours = listJours.getTabIndex();
		int nouvDebutHeure = Integer.parseInt(nameFieldHeureDebut.getValue());
		int nouvDebutMinutes = Integer.parseInt(nameFieldMinuteDebut.getValue());
		
		//Recolte des infos et assemblage en type PlageHoraire		
		//Periode nouvPlageHoraire = new Periode();
		Periode nouvPeriode = new Periode();
		@SuppressWarnings("deprecation")
		Date nouvDateDebut = new Date(2012,nouvDebutMois,nouvDebutJours);
		Date nouvDateFin = new Date(2012,nouvDebutMois+)
		nouvPeriode.setDateDebut(nouvDateDebut);
		nouvPeriode.setDateFin();			
		
		}
}
