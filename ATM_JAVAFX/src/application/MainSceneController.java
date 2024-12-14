package application;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import packageLecteur.Lecteur;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;

public class MainSceneController {
	Lecteur lecteur =new Lecteur();
	int conteur=3;
	public MainSceneController() {
		lecteur.connecter();
        lecteur.MiseTension();
        lecteur.select();
	}
	private int entre=0;
	private String entreStr="";
	
	//la page welcome
	@FXML
	private AnchorPane welcome;
	//la page entre pin vide 
	@FXML
	private AnchorPane enterpinVide;
	//la page menu
	@FXML
	private AnchorPane menu;
	//la page check balance
	@FXML
	private AnchorPane balance;
	//contenu du pin :
	@FXML
	private ImageView password_0;
	@FXML
	private ImageView password_1;
	@FXML
	private ImageView password_2;
	@FXML
	private ImageView password_3;
	@FXML
	private ImageView password_4;
	
	//contenue du menu
	@FXML
	private ImageView bcheckbalance;
	//contenu de balance
	@FXML
	private Text soldetxt;
	
	
	/**********************************************Bouton de Welcome***********************************************/
	//retour vers menu :
	public void ouvrirPinVide(MouseEvent event) {
		welcome.setVisible(false);
		enterpinVide.setVisible(true);
		entre=0;
	}
	/**********************************************Bouton de Pin***********************************************/
	public void taper0(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"0";
			afficheEtoil();	
		}	
	}
	public void taper1(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"1";
			afficheEtoil();	
		}	
	}
	public void taper2(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"2";
			afficheEtoil();
		}				
	}
	public void taper3(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"3";
			afficheEtoil();
		}
	}
	public void taper4(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"4";
			afficheEtoil();
		}
	}
	public void taper5(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"5";
			afficheEtoil();
		}
	}
	public void taper6(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"6";
			afficheEtoil();
		}		
	}
	public void taper7(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"7";
			afficheEtoil();
		}
	}
	public void taper8(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"8";
			afficheEtoil();
		}
	}
	public void taper9(MouseEvent event) {
		if(entreStr.length()==4) {
			showErrorDialog("Invalid PIN", "The PIN cannot exceed 4 digits.");
			restart();
		}
		else {
			entreStr=entreStr+"9";
			afficheEtoil();
		}
	}
	public void restart() {
		entreStr="";
		password_0.setVisible(true);
		password_1.setVisible(false);
		password_2.setVisible(false);
		password_3.setVisible(false);
		password_4.setVisible(false);
	}
	public void taperC(MouseEvent event) {
		restart();
	}	
	private void afficheEtoil() {
		int lengthpin=entreStr.length();
		int ancienne=lengthpin-1;
		int nouvelle=lengthpin;
		if(nouvelle==4) {
			password_3.setVisible(false);
			password_4.setVisible(true);
		}
		if(nouvelle==3) {
			password_2.setVisible(false);
			password_3.setVisible(true);
		}
		if(nouvelle==2) {
			password_1.setVisible(false);
			password_2.setVisible(true);
		}
		if(nouvelle==1) {
			password_0.setVisible(false);
			password_1.setVisible(true);
		}		
	}
	public void play(MouseEvent event) {
		if(entreStr.length()!=4) {
			showErrorDialog("Invalid PIN", "PIN must be 4 digits. Please enter a valid PIN..");
		}
		else {
			boolean test=lecteur.entrePin(entreStr);
			if(test) {
				entreStr="";
				restart();
				enterpinVide.setVisible(false);
				menu.setVisible(true);		
			}
			else {
				conteur--;
				if(conteur==0) {
					showErrorDialog("Invalid PIN", "You have exceeded the maximum number of attempts.\nThe card will be retained by the reader.");
					restart();
					enterpinVide.setVisible(false);
					welcome.setVisible(true);
					conteur=3;	
				}
				else {
					showErrorDialog("Incorrect PIN.", "You can try "+conteur+" more time(s).");
					restart();
				}			
			}
		}	
	}
	
	/********************************************Bouton du menu*****************************************************/
	@FXML
	public void ovrirbalance(MouseEvent event) {
		menu.setVisible(false);
		balance.setVisible(true);
		int solde=lecteur.interroger();
		soldetxt.setText(String.valueOf(solde)+" Dinars");
	}
	public void ovrirsummary(MouseEvent event) {
		menu.setVisible(false);
		// interface de summary  .setVisible(true);
		String[] his=lecteur.historique();
		String msg="";
		int i = 0;
        while (his[i] != null) {
            msg=msg+"\n"+his[i];
            i++;
        }
        //si le msg.length()==0 alors on affiche :Transaction history is empty.\nNo transactions have been made.
        //sionon on affiche msg 
	}
	public void ovrirretrait(MouseEvent event) {
		menu.setVisible(false);
		// interface de retrait  .setVisible(true);
	}
	public void ovrirdepot(MouseEvent event) {
		menu.setVisible(false);
		// interface de depot  .setVisible(true);
	}
	public void retourVersWelcomeMenu(MouseEvent event) {
		menu.setVisible(false);
		welcome.setVisible(true);
	}
	
	/**********************************************Bouton de checkBlance***********************************************/
	//retour vers menu :
	public void retourVersMenuBlance(MouseEvent event) {
		balance.setVisible(false);
		menu.setVisible(true);
	}
	
	///////////////////////////////////////////////Alert
	private void showErrorDialog(String header, String content) {
        // Créer une alerte de type erreur
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erreur");
        alert.setHeaderText(header); // Titre secondaire de l'alerte
        alert.setContentText(content); // Détails de l'erreur

        // Afficher la boîte de dialogue
        alert.showAndWait();
    }
	
}
