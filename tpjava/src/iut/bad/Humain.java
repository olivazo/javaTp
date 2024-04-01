package iut.bad;

public class Humain implements Consommation {
	private String nom;
    private String prenom;
    private int age;
    
	public Humain() {
		// TODO Auto-generated constructor stub
	}
	
	  // Constructeur avec tous les champs
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void details() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Age: " + age);
    }
    
    
    // Méthode pour manger
    public void manger() {
        System.out.println("L'humain" + nom + " " + prenom + " mange");
    }
    
    // Méthode pour boire
    public void boire() {
        System.out.println("L'humain" + nom + " " + prenom + " bois");
    }
    
    
 // Méthode toString pour afficher les détails de l'humain
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age;
        /*si on deplace la methode toString vers les sous classes
         * il aura des erreurs car les proprietes ne sont pas accessible direct de ces sous classe
         * pour cela il faut utiliser les getters dans ces sous classes pour acceder a chacun des propriete*/
    }
    
 // Méthode ami() avec un paramètre pour la durée de l'amitié (valeur par défaut: 100 jours)

        public void ami(Humain ami, int dureeAmitie) {

        System.out.println("La femme " + this.getNom() + " " + this.getPrenom() + " est amie avec " + ami.getNom() + " " + ami.getPrenom() + " depuis " + dureeAmitie + " jours.");

    }
}
