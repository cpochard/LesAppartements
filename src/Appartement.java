public class Appartement implements Cloneable {

	private int nombrePieces;
	private int superficie;
	private String couleurMurs;
	private String typeSols;
	private Canape canapeSalon;
	
	//Constructeur sans canape
	public Appartement(int tmpNombrePieces, int tmpSuperficie, String tmpCouleurMurs, String tmpTypeSols) {
		nombrePieces=tmpNombrePieces;
		superficie = tmpSuperficie;
		couleurMurs = tmpCouleurMurs;
		typeSols = tmpTypeSols;
		canapeSalon = null;
	}
	//Constructeur complet
	public Appartement(int tmpNombrePieces, int tmpSuperficie, String tmpCouleurMurs, String tmpTypeSols, Canape tmpCanapeSalon) {
		nombrePieces = tmpNombrePieces;
		superficie = tmpSuperficie;
		couleurMurs = tmpCouleurMurs;
		typeSols = tmpTypeSols;
		canapeSalon = tmpCanapeSalon;
	}
	//Constructeur par défaut
	public Appartement () {
		nombrePieces = 0;
		superficie = 0;
		couleurMurs = "non existants";
		typeSols = "non existants";
		canapeSalon = null;
	}
	
	//Constructeur de copie profonde
	public Appartement (Appartement a) {
		nombrePieces = a.nombrePieces;
		superficie =a.superficie;
		couleurMurs = a.couleurMurs;
		typeSols = a.typeSols;
		Canape copieCanapeSalon = new Canape (a.canapeSalon.getNombrePlaces(), a.canapeSalon.getMotif(), a.canapeSalon.getCouleur());
	canapeSalon = copieCanapeSalon;
	}
	
		
		//Methode de description du canape
	public String description () {
		String message ="Cet appartement comprend " + nombrePieces + " pièces, il a une superficie de " + superficie + " m², des murs " + couleurMurs + ", des sols " + typeSols;
		if (canapeSalon!=null) {
		message+= " et j'ai un canape. " + canapeSalon.descriptionCanape() ;}
		else {
			message+=". Je n'ai pas de canapé !";
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
		canapeSalon= c;
	}
	
	@Override //Pour copie de surface avec méthode officielle
	protected Appartement clone() throws CloneNotSupportedException {
		return (Appartement) super.clone();
	}
	//Si on voulait faire une copie profonde avec méthode officielle
	// public Appartement clone() throws CloneNotSupportedException {
	// Appartement a2 = (Appartement) super.clone();
	// a2.setCanapeSalon (new Canape(this.getCanapeSalon.getNombrePlaces(), this.getCanapeSalon.getMotif() etc...);
	// return a2;

}

