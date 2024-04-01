package iut.bad;

public class Homme extends Humain {

	// Constructeur par défaut
	public Homme() {
		super(); // Appel au constructeur de la classe parente Humain
	}
	
	 // Constructeur avec tous les champs
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); // Appel au constructeur de la classe parente Humain
    }
}
