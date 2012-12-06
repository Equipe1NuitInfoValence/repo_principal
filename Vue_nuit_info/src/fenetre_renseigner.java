import javax.swing.JFrame;
import src
/**
 * Classe de la fenetre dédiée à la saisie des renseignement
 * @author Wyvern
 *
 */
public class fenetre_renseigner {
	
	JFrame fenetre_renseigner;
	
	
/**
 * Constructeur par défaut 
 */
	public fenetre_renseigner()
	{		
		this.fenetre_renseigner = new JFrame();
		this.fenetre_renseigner.setVisible(true);
		
		//Définit un titre pour notre fenêtre
	    this.fenetre_renseigner.setTitle("Fenetre renseignement");
	    //Définit sa taille : 400 pixels de large et 100 pixels de haut
	    this.fenetre_renseigner.setSize(600, 300);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    this.fenetre_renseigner.setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    this.fenetre_renseigner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	   /* //Instanciation d'un objet JPanel
	    JPanel pan = new JPanel();
	    //Définition de sa couleur de fond
	    pan.setBackground(Color.ORANGE); */
		CaseACocher maPremiereCase = new CaseACocher("Resto");
		
	}
}
