package iut.bad;
public class Femme extends Humain {
	
	public Femme() {
		// TODO Auto-generated constructor stub
		 super(); // Appel au constructeur de la classe parente Humain
	}
	
	// Constructeur avec tous les champs
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel au constructeur de la classe parente Humain
    }
}
