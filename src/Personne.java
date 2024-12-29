// Classe Personne représentant une personne générale
public class Personne {
    // Attributs
    private static int compteur = 0; // Compteur statique pour générer un ID unique
    protected int id;  // ID unique pour chaque instance
    protected String nom;  // Nom de la personne
    protected String prenom;  // Prénom de la personne
    protected String mail;  // Adresse email
    protected String telephone;  // Numéro de téléphone
    protected double salaire;  // Salaire de la personne

    // Constructeur paramétrique pour initialiser les attributs de la personne
    public Personne(String nom, String prenom, String mail, String telephone, double salaire) {
        this.id = ++compteur; // Incrémentation automatique du compteur pour l'ID unique
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    // Méthode pour calculer le salaire
    public double calculerSalaire() {
        return salaire;
    }

    // Méthode pour afficher les informations de la personne
    public String afficher() {
        return "- Nom: " + nom + ", Prénom: " + prenom +
                ", Email: " + mail + ", Téléphone: " + telephone ;
    }
}

