package application;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import packageLecteur.Lecteur;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
	@FXML
	private AnchorPane depot;
	@FXML
	private AnchorPane retrait;
	@FXML
	private AnchorPane summary;
	@FXML
	private AnchorPane accessDenied;
	
	//contenu welcome
	@FXML
	private ImageView insert_btn;
	@FXML
	private ImageView insert_btn2;
	
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
	@FXML
	private ImageView bnumero1;
	@FXML
	private ImageView bnumero2;
	@FXML
	private ImageView bnumero3;
	@FXML
	private ImageView bnumero4;
	@FXML
	private ImageView bnumero5;
	@FXML
	private ImageView bnumero6;
	@FXML
	private ImageView bnumero7;
	@FXML
	private ImageView bnumero8;
	@FXML
	private ImageView bnumero9;
	@FXML
	private ImageView bnumero0;
	@FXML
	private ImageView bnumero12;
	@FXML
	private ImageView bnumero22;
	@FXML
	private ImageView bnumero32;
	@FXML
	private ImageView bnumero42;
	@FXML
	private ImageView bnumero52;
	@FXML
	private ImageView bnumero62;
	@FXML
	private ImageView bnumero72;
	@FXML
	private ImageView bnumero82;
	@FXML
	private ImageView bnumero92;
	@FXML
	private ImageView bnumero02;
	@FXML
	private ImageView play1;
	@FXML
	private ImageView c1;
	@FXML
	private ImageView play2;
	@FXML
	private ImageView c2;
	
	//contenue du menu
	@FXML
	private ImageView bcheckbalance;
	@FXML
	private ImageView eject_btn;
	@FXML
	private ImageView eject_btn2;
	@FXML
	private ImageView summary_btn;
	@FXML
	private ImageView summary_btn2;
	@FXML
	private ImageView withdraw_btn;
	@FXML
	private ImageView withdraw_btn2;
	@FXML
	private ImageView balance_btn;
	@FXML
	private ImageView balance_btn2;
	@FXML
	private ImageView deposit_btn2;
	@FXML
	private ImageView deposit_btn;
	
	//contenu de balance
	@FXML
	private Label balance_amount;
	@FXML
	private ImageView previous_btn;
	@FXML
	private ImageView bretourDepuisBalance;
	
	
	/**********************************************Bouton de Welcome***********************************************/
	//retour vers menu :
	public void ouvrirPinVide(MouseEvent event) {
		welcome.setVisible(false);
		enterpinVide.setVisible(true);
		entre=0;
	}
	public void changerInsertB1(MouseEvent event) {
		insert_btn.setVisible(false);
		insert_btn2.setVisible(true);
	}
	public void changerInsertB2(MouseEvent event) {
		insert_btn2.setVisible(false);
		insert_btn.setVisible(true);
	}
	
	/**********************************************Bouton de Pin***********************************************/
	public void changer11(MouseEvent event) {
		bnumero1.setVisible(false);
		bnumero12.setVisible(true);
	}
	public void changer12(MouseEvent event) {
		bnumero12.setVisible(false);
		bnumero1.setVisible(true);
	}
	public void changer21(MouseEvent event) {
		bnumero2.setVisible(false);
		bnumero22.setVisible(true);
	}
	public void changer22(MouseEvent event) {
		bnumero22.setVisible(false);
		bnumero2.setVisible(true);
	}
	public void changer31(MouseEvent event) {
		bnumero3.setVisible(false);
		bnumero32.setVisible(true);
	}
	public void changer32(MouseEvent event) {
		bnumero32.setVisible(false);
		bnumero3.setVisible(true);
	}
	public void changer41(MouseEvent event) {
		bnumero4.setVisible(false);
		bnumero42.setVisible(true);
	}
	public void changer42(MouseEvent event) {
		bnumero42.setVisible(false);
		bnumero4.setVisible(true);
	}
	public void changer51(MouseEvent event) {
		bnumero5.setVisible(false);
		bnumero52.setVisible(true);
	}
	public void changer52(MouseEvent event) {
		bnumero52.setVisible(false);
		bnumero5.setVisible(true);
	}
	public void changer61(MouseEvent event) {
		bnumero6.setVisible(false);
		bnumero62.setVisible(true);
	}
	public void changer62(MouseEvent event) {
		bnumero62.setVisible(false);
		bnumero6.setVisible(true);
	}
	public void changer71(MouseEvent event) {
		bnumero7.setVisible(false);
		bnumero72.setVisible(true);
	}
	public void changer72(MouseEvent event) {
		bnumero72.setVisible(false);
		bnumero7.setVisible(true);
	}
	public void changer81(MouseEvent event) {
		bnumero8.setVisible(false);
		bnumero82.setVisible(true);
	}
	public void changer82(MouseEvent event) {
		bnumero82.setVisible(false);
		bnumero8.setVisible(true);
	}
	public void changer91(MouseEvent event) {
		bnumero9.setVisible(false);
		bnumero92.setVisible(true);
	}
	public void changer92(MouseEvent event) {
		bnumero92.setVisible(false);
		bnumero9.setVisible(true);
	}
	public void changer01(MouseEvent event) {
		bnumero0.setVisible(false);
		bnumero02.setVisible(true);
	}
	public void changer02(MouseEvent event) {
		bnumero02.setVisible(false);
		bnumero0.setVisible(true);
	}
	public void changerPlay1(MouseEvent event) {
		play1.setVisible(false);
		play2.setVisible(true);
	}
	public void changerPlay2(MouseEvent event) {
		play2.setVisible(false);
		play1.setVisible(true);
	}
	public void changerC1(MouseEvent event) {
		c1.setVisible(false);
		c2.setVisible(true);
	}
	public void changerC2(MouseEvent event) {
		c2.setVisible(false);
		c1.setVisible(true);
	}
	
	
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
					accessDenied.setVisible(true);
					conteur=3;	
				}
				else {
					showErrorDialog("Incorrect PIN.", "You can try "+conteur+" more time(s).");
					restart();
				}			
			}
		}	
	}
	public void DeniedVersWelcome(MouseEvent event) {
		accessDenied.setVisible(false);
		welcome.setVisible(true);
	}
	
	/********************************************Bouton du menu*****************************************************/
	
	@FXML
	public void ovrirbalance(MouseEvent event) {
		menu.setVisible(false);
		balance.setVisible(true);
		int solde=lecteur.interroger();
		balance_amount.setText(String.valueOf(solde)+" D");
	}
	public void ovrirsummary(MouseEvent event) {
		menu.setVisible(false);
		summary.setVisible(true);
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
		retrait.setVisible(true);
	}
	public void ovrirdepot(MouseEvent event) {
		menu.setVisible(false);
		depot.setVisible(true);
	}
	public void retourVersWelcomeMenu(MouseEvent event) {
		menu.setVisible(false);
		welcome.setVisible(true);
		
	}
	public void changerInsert1(MouseEvent event) {
		eject_btn.setVisible(false);
		eject_btn2.setVisible(true);
	}
	public void changerInsert2(MouseEvent event) {
		eject_btn2.setVisible(false);
		eject_btn.setVisible(true);
	}
	//bouton interface depot
	public void changerDepositbtn1(MouseEvent event) {
		deposit_btn.setVisible(false);
		deposit_btn2.setVisible(true);
	}
	public void changerDepositbtn2(MouseEvent event) {
		deposit_btn2.setVisible(false);
		deposit_btn.setVisible(true);
	}
	//bouton interface retrait
	public void changerRetaitbtn1(MouseEvent event) {
		withdraw_btn.setVisible(false);
		withdraw_btn2.setVisible(true);
	}
	public void changerRetaitbtn2(MouseEvent event) {
		withdraw_btn2.setVisible(false);
		withdraw_btn.setVisible(true);
	}
	//bouton interface balance
	public void changerBalancebtn1(MouseEvent event) {
		balance_btn.setVisible(false);
		balance_btn2.setVisible(true);
	}
	public void changerBalancebtn2(MouseEvent event) {
		balance_btn2.setVisible(false);
		balance_btn.setVisible(true);
	}
	//bouton interface summary
	public void changerSummarybtn1(MouseEvent event) {
		summary_btn.setVisible(false);
		summary_btn2.setVisible(true);
	}
	public void changerSummarybtn2(MouseEvent event) {
		summary_btn2.setVisible(false);
		summary_btn.setVisible(true);
	}
	/**********************************************Bouton de checkBlance***********************************************/
	@FXML
	private ImageView retourwelcomeBalance1;
	@FXML
	private ImageView retourwelcomeBalance2;
	
	//
	public void returnWelcomeBalance(MouseEvent event) {
		balance.setVisible(false);
		welcome.setVisible(true);
	}
	public void pressBalance1(MouseEvent event) {
		retourwelcomeBalance1.setVisible(false);
		retourwelcomeBalance2.setVisible(true);
	}
	public void pressBalance2(MouseEvent event) {
		retourwelcomeBalance2.setVisible(false);
		retourwelcomeBalance1.setVisible(true);
	}
	
	//retour vers menu :
	public void retourVersMenuBlance(MouseEvent event) {
		balance.setVisible(false);
		menu.setVisible(true);
	}
	public void changerRetour1(MouseEvent event) {
		bretourDepuisBalance.setVisible(false);
		previous_btn.setVisible(true);
	}
	public void changerRetour2(MouseEvent event) {
		previous_btn.setVisible(false);
		bretourDepuisBalance.setVisible(true);
	}
	
	
	/**************************************Depot**********************************************************/
	@FXML
	private ImageView previousDepot_btn;//8ame9
	@FXML
	private ImageView retourDepot_btn;
	@FXML
	private ImageView confirm1;
	@FXML
	private ImageView confirm2;
	@FXML
	private TextField montantdepose;
	@FXML
	private ImageView retourwelcomeDepot1;
	@FXML
	private ImageView retourwelcomeDepot2;
	
	//
	public void returnWelcomeDepot(MouseEvent event) {
		depot.setVisible(false);
		welcome.setVisible(true);
	}
	public void pressDepot1(MouseEvent event) {
		retourwelcomeDepot1.setVisible(false);
		retourwelcomeDepot2.setVisible(true);
	}
	public void pressDepot2(MouseEvent event) {
		retourwelcomeDepot2.setVisible(false);
		retourwelcomeDepot1.setVisible(true);
	}
	
	public void changerRetourDepot1(MouseEvent event) {
		retourDepot_btn.setVisible(false);
		previousDepot_btn.setVisible(true);
	}
	public void changerRetourDepot2(MouseEvent event) {
		previousDepot_btn.setVisible(false);
		retourDepot_btn.setVisible(true);
	}
	public void changerDepot1(MouseEvent event) {
		confirm1.setVisible(false);
		confirm2.setVisible(true);
	}
	public void changerDepot2(MouseEvent event) {
		confirm2.setVisible(false);
		confirm1.setVisible(true);
	}
	public void depot(MouseEvent event) {
		String montantStr=montantdepose.getText(); 
		if(isInteger(montantStr)) {
			int montant = Integer.parseInt(montantStr);
			lecteur.depot(montant);
			showInfoDialog("Transaction Successful", "Your deposit has been completed successfully.");
			montantdepose.setText(""); 
		}
		else {
			montantdepose.setText(""); 
			showErrorDialog("Invalid Amount", "Please check the entered amount and try again.");
		}		
	}
	public void retourDepotMenu(MouseEvent event) {
		depot.setVisible(false);
		menu.setVisible(true);
	}
	/*****************************************Retrait*******************************************************/
	@FXML
	private ImageView previousRetrait_btn;//8ame9
	@FXML
	private ImageView retourRetrait_btn;
	@FXML
	private ImageView confirmRetrait1;
	@FXML
	private ImageView confirmRetrait2;
	@FXML
	private TextField montantretire;
	@FXML
	private ImageView retourwelcomeRetrait1;
	@FXML
	private ImageView retourwelcomeRetrait2;
	
	//
	public void returnWelcomeRetrait(MouseEvent event) {
		retrait.setVisible(false);
		welcome.setVisible(true);
	}
	public void pressRetrait1(MouseEvent event) {
		retourwelcomeRetrait1.setVisible(false);
		retourwelcomeRetrait2.setVisible(true);
	}
	public void pressRetrait2(MouseEvent event) {
		retourwelcomeRetrait2.setVisible(false);
		retourwelcomeRetrait1.setVisible(true);
	}
	
	public void changerRetourRetrait1(MouseEvent event) {
		retourRetrait_btn.setVisible(false);
		previousRetrait_btn.setVisible(true);
	}
	public void changerRetourRetrait2(MouseEvent event) {
		previousRetrait_btn.setVisible(false);
		retourRetrait_btn.setVisible(true);
	}
	public void changerRetrait1(MouseEvent event) {
		confirmRetrait1.setVisible(false);
		confirmRetrait2.setVisible(true);
	}
	public void changerRetrait2(MouseEvent event) {
		confirmRetrait2.setVisible(false);
		confirmRetrait1.setVisible(true);
	}
	public void retrait(MouseEvent event) {
		String montantStr=montantretire.getText(); 
		if(isInteger(montantStr)) {
			int montant = Integer.parseInt(montantStr);
			int solde=lecteur.interroger();
			if(solde>=montant) {
				lecteur.retrait(montant);
				showInfoDialog("Transaction Successful", "Your deposit has been completed successfully.");
				montantretire.setText(""); 
			}
			else {
				showErrorDialog("Insufficient Funds", "You cannot withdraw more than your account balance. Please enter a smaller amount.");
				montantretire.setText(""); 
			}
		}
		else {
			montantdepose.setText(""); 
			showErrorDialog("Invalid Amount", "Please check the entered amount and try again.");
		}		
	}
	public void retourRetaitMenu(MouseEvent event) {
		retrait.setVisible(false);
		menu.setVisible(true);
	}
	/*****************************************************************************************************************************/
	///////////////////////////////////////////////verifier integer
	private boolean isInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false; // Aucun texte ou valeur vide n'est pas un entier
        }
        try {
            Integer.parseInt(input); // Tente de convertir la chaîne en entier
            return true; // Conversion réussie
        } catch (NumberFormatException e) {
            return false; // Erreur de conversion
        }
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
	private void showInfoDialog(String header, String content) {
	    // Créer une alerte de type information
	    Alert alert = new Alert(AlertType.INFORMATION);
	    alert.setTitle("Information");
	    alert.setHeaderText(header); // Titre secondaire de l'alerte
	    alert.setContentText(content); // Détails du message

	    // Afficher la boîte de dialogue
	    alert.showAndWait();
	}	
}
