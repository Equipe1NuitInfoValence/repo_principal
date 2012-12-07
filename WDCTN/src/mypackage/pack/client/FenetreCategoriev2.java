package mypackage.pack.client;

import system.Categorie;
import system.MapCat;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

import e.g.com.nuitInfo.client.GreetingService;
import e.g.com.nuitInfo.client.GreetingServiceAsync;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class FenetreCategoriev2 implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network "
			+ "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	
	/**
	 * Contient les categorie avec leurs tags
	 */
	private MapCat categorie;
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		final Button sendButton = new Button("Choisir");
		Button closeButton = new Button("Close");
		
		// We can add style names to widgets
		
		

		int nbCat;
		for (nbCat = 0; nbCat < this.categorie.getId(); nbCat++)
		{
			// Create the popup dialog box
			final DialogBox dialogBox;
			
			dialogBox = new DialogBox();
			closeButton = new Button("OK");
			
			sendButton.addStyleName("idButton");
			
			// Add the nameField and sendButton to the RootPanel
			// Use RootPanel.get() to get the entire body element
			RootPanel.get("sendButtonContainer").add(sendButton);
			dialogBox.setText("Choix Sous-Categorie");
			dialogBox.setAnimationEnabled(true);

			// We can set the id of a widget by accessing its Element
			closeButton.getElement().setId("closeButton");
			VerticalPanel dialogVPanel = new VerticalPanel();
			dialogVPanel.addStyleName("dialogVPanel");
			
			
			Categorie catCourante = this.categorie.getCategorie(0);
			//creation des case a cocher.
			int tailleSouCat = catCourante.getTag().size();
			String caseCoche = "";
			for (int i = 0; i < tailleSouCat; i++) {
				String nomSC = catCourante.getTag().get(i);
				caseCoche = "<input type=\"checkbox\" name=\"" + nomSC
						+ "\" id=\"" + nomSC + "\" /> " + "<label for=\""
						+ nomSC + "\">" + nomSC + "</label><\br>";
				
			}
			dialogVPanel.add(new HTML(caseCoche));
			
			dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
			dialogVPanel.add(closeButton);
			dialogBox.setWidget(dialogVPanel);
			
			closeButton.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					dialogBox.hide();
					sendButton.setEnabled(true);
					sendButton.setFocus(true);
				}
			});
		}
		
		
		// Add a handler to close the DialogBox
		

			/**
			 * Send the name from the nameField to the server and wait for a response.
			 */
		}
	
	public void chargeCate(MapCat cate)
	{
		this.categorie = cate;
	}
}
