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
    
    public static void main(String[] args) {
        // Instanciation d'un homme et d'une femme
        Homme homme = new Homme("Doe", "John", 30);
        Femme femme = new Femme("Smith", "Alice", 25);
        
        // Déclaration d'amitié entre l'homme et la femme
        homme.ami(femme,100);
    }
}
