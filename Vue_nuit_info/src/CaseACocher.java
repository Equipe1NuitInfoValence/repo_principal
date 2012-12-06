import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 * Classe de la case à cocher, 
 * Sur le principe la case à cocher va se voir affecter un paramètre, ce parametre représente la 
 * catégorie à afficher si l'user appuie dessus. 
 * 
 * @author Wyvern
 *
 */
@SuppressWarnings("serial")
public class CaseACocher extends JPanel{
	
	public CaseACocher(final String[] typeAAfficher)
	{
		 final JTextArea textArea = new JTextArea();
		    textArea.setText("Click Me!");
		    textArea.addMouseListener(new MouseAdapter() {
		        public void mouseClicked(MouseEvent e) {
		          if (e.getButton() == MouseEvent.NOBUTTON) {
		            textArea.setText("No button clicked...");
		          } /*else if (e.getButton() == MouseEvent.BUTTON1) {
		            textArea.setText("Button 1 clicked...");
		          } else if (e.getButton() == MouseEvent.BUTTON2) {
		            textArea.setText("Button 2 clicked...");
		          } else if (e.getButton() == MouseEvent.BUTTON3) {
		            textArea.setText("Button 3 clicked...");
		          }*/

		          System.out.println("Number of click: " + e.getClickCount());
		          System.out.println("Click position (X, Y):  " + e.getX() + ", " + e.getY() + typeAAfficher);
		        }
		      });
	}

}
