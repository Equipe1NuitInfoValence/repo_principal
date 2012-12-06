package fr.wdctn.vue;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame; 
 
@SuppressWarnings("serial")
public class Fenetre_Choix_Type extends JFrame{
  public Fenetre_Choix_Type(){
    this.setTitle("Bouton");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //On définit le layout à utiliser sur le content pane
    this.setLayout(new BorderLayout());
    //On ajoute le bouton au content pane de la JFrame
    //Au centre
    this.getContentPane().add(new JButton("Essai"), BorderLayout.WEST);
    this.setVisible(true);
  }      
}