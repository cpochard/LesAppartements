
public class MainClass {

	public static void main(String[] args) {

		Appartement monAppartement = new Appartement(4, 75, "blancs", "en bois");
		Canape monCanape = new Canape (3, "rayés", "bleu");
		Appartement appartementAvecCanape = new Appartement (4,75,"blancs", "en bois", monCanape);
		Appartement appartementEnProjet = new Appartement ();
		AppartementMultiCanapes appartementMulti = new AppartementMultiCanapes (3, 60, "blancs", "en marbre", monCanape);
		Canape monCanape2 = new Canape (4, "en velour", "vert");
		//Copie d'appartement avec méthode constructeur de copie
		Appartement copieAppartementAvecCanape = new Appartement (appartementAvecCanape);
		AppartementMultiCanapes copieAppartementMulti = new AppartementMultiCanapes (appartementMulti);
		
		//Afficher copie de appartementAvecCanape avec méthode officielle (cloenable,override et methode clone())
		//De base fait une copie de surface
		try {
			Appartement copieOfficielleAppartement = appartementAvecCanape.clone();
			System.out.println(appartementAvecCanape.description());
			System.out.println(copieOfficielleAppartement.description());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//Afficher copie de surface de appartementMulti
			System.out.println(appartementMulti.description());
			System.out.println(copieAppartementMulti.description());
		
		//Afficher description de monAppartement
		System.out.println(monAppartement.description());
		
		//Afficher description de monCanape
		System.out.println(monCanape.descriptionCanape());
		
		//Repeindre la couleur de mon appartement en rouge
		monAppartement.repeindre("rouge");
			System.out.println(monAppartement.description());
			
		//Repeindre avec getter/setter
		monAppartement.setCouleurMurs("gris");
		System.out.println(monAppartement.description());
		
		//Afficher description de monAppartement après avoir cassé 2 cloisons
		monAppartement.setNombrePieces(2);
		System.out.println(monAppartement.description());
		
		//Afficher description de monAppartement avec un canapé
		monAppartement.ajouterCanape(monCanape);
		System.out.println(monAppartement.description());
		
		//Ou alors avec un nouveau canapé
		monAppartement.ajouterCanape(new Canape(2, "en spirale", "vert"));
		System.out.println(monAppartement.description());
		
		//Afficher description de appartementAvecCanape
		System.out.println(appartementAvecCanape.description());
		
		//Afficher description de appartementEnProjet (constructeur par défaut)
		System.out.println(appartementEnProjet.description());
		
		//Afficher appartementMulti avec un canapé et ajout d'un autre canapé
		appartementMulti.ajouterCanape(monCanape2);
		System.out.println(appartementMulti.description());
		
		//Afficher copie de surface de appartementAvecCanape
		System.out.println(copieAppartementAvecCanape.description());
		
		//Modifier couleur canape de appartementAvecCanape et de sa copie
		monCanape.setCouleur("jaune");
		System.out.println(appartementAvecCanape.description());
		System.out.println(copieAppartementAvecCanape.description());
	}

}
