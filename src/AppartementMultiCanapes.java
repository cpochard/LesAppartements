import java.util.ArrayList;
import java.util.List;

public class AppartementMultiCanapes  {

	private int nombrePieces;
	private int superficie;
	private String couleurMurs;
	private String typeSols;
	private List<Canape> canapes =new ArrayList<Canape>();

	//Constructeur complet
	public AppartementMultiCanapes(int tmpNombrePieces, int tmpSuperficie, String tmpCouleurMurs, String tmpTypeSols, Canape tmpCanape) {
		nombrePieces = tmpNombrePieces;
		superficie = tmpSuperficie;
		couleurMurs = tmpCouleurMurs;
		typeSols = tmpTypeSols;
		canapes.add(tmpCanape);
	}
	
	//Constructeur de copie de surface
	public AppartementMultiCanapes (AppartementMultiCanapes am) {
		nombrePieces = am.nombrePieces;
		superficie = am.superficie;
		couleurMurs = am.couleurMurs;
		typeSols = am.typeSols;
		canapes = am.canapes;
	}

	//Methode de description du canape
	public String description () {
		String message ="Cet appartement comprend " + nombrePieces + " pièces, il a une superficie de " + superficie + " m², des murs " + couleurMurs + ", des sols " + typeSols + ".";
		if (canapes!=null) 
		{
			message+=" Il y a "+ canapes.size() + " canapés. ";
			for (Canape c : canapes ) {
				message+= c.descriptionCanape() ;
			}
		}
		else 
		{
			message+=". L'appartement n'a pas de canape !";
		}
		return message;
	}

	//Methode repeindre
	public void repeindre (String tmpCouleurMurs) {
		couleurMurs = tmpCouleurMurs;
	}

	//Methode repeindre avec getter/setter
	public String getCouleurMurs() {
		return couleurMurs;
	}
	public void setCouleurMurs(String newCouleurMurs) {
		couleurMurs = newCouleurMurs;
	}

	//Methode casser une cloison
	public int getNombrePieces (){
		return nombrePieces;
	}
	public void setNombrePieces (int newNombrePieces) {
		nombrePieces = newNombrePieces;
	}

	//Methode ajouter canape
	public void ajouterCanape(Canape c) {
		canapes.add(c);
	}

}