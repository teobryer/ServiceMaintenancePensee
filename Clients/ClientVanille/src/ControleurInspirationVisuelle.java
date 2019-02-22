import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import accesseur.PenseeDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import modele.Pensee;
import outils.Journal;

public class ControleurInspirationVisuelle  implements Initializable {
	protected PenseeDAO penseeDAO = new PenseeDAO();

	public ControleurInspirationVisuelle()
	{
		ControleurInspirationVisuelle.instance = this;
	}
	protected static ControleurInspirationVisuelle instance = null;
	public static ControleurInspirationVisuelle getInstance() {return ControleurInspirationVisuelle.instance;}	
	
	@FXML protected void trouverInspiration(ActionEvent evenement) {
    	
    	System.out.println("trouverInspiration( )");
		Pensee pensee = penseeDAO.chargerPenseeAleatoire();
		VueInspirationVisuelle.getInstance().afficherPensee(pensee.getMessage());
    	
    	// Singleton obligatoire car le framework de JavaFX cache l'instance
    	//VueInspirationVisuelle.getInstance().ecrireUnMessage("allo");
    }

	public void initialiser()
	{
		//List<Pensee> listePensees = penseeDAO.listerPensees();
		Pensee pensee = penseeDAO.chargerPenseeAleatoire();
		
		 //for(Iterator<Pensee> visiteur = listePensees.iterator(); visiteur.hasNext(); )
		//{
		//	Pensee pensee = visiteur.next();		
		//	Journal.ecrire(5, pensee.getMessage() + "(" + pensee.getAuteur() + ")");
		//}
		//VueInspirationVisuelle.getInstance().afficherListePensees(listePensees);
		VueInspirationVisuelle.getInstance().afficherPensee(pensee.getMessage());
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		
	}
	
}