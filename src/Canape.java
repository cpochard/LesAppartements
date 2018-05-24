
public class Canape {

	private int nombrePlaces;
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	private String motif;
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}

	private String couleur;
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Canape (int tmpNombrePlaces, String tmpMotif, String tmpCouleur) {
		nombrePlaces = tmpNombrePlaces;
		motif = tmpMotif;
		couleur = tmpCouleur;
	}
	
	public String descriptionCanape () {
		return ("Un canape qui a "+ nombrePlaces + " places, des motifs " + motif + " et qui est " + couleur + " .");
	}
}
