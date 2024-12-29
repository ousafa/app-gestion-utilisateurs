// Classe Utilisateur héritant de Personne
public class Utilisateur extends Personne {
    // Attributs supplémentaires pour un utilisateur
    private String login;  // login de l'utilisateur
    private String password;  // Mot de passe de l'utilisateur
    private String service;  // Service auquel appartient l'utilisateur
    private Profile typeProfile;  // Profil de l'utilisateur (Manager, Directeur Général, etc.)

    // Constructeur paramétrique pour initialiser les attributs de l'utilisateur
    public Utilisateur(String nom, String prenom, String mail, String telephone, double salaire,
                       String login, String password, String service, Profile typeProfile) {
        // Appel du constructeur de la classe parent (Personne)
        super(nom, prenom, mail, telephone, salaire);
        this.login = login;
        this.password = password;
        this.service = service;
        this.typeProfile = typeProfile;
    }

    // Méthode pour calculer le salaire en fonction du profil (Manager, DG, ou autre)
    @Override
    public double calculerSalaire() {
        if (typeProfile.getCode().equals("MG")) {
            // Augmentation de 10% pour les Managers
            return salaire + (salaire * 0.1);
        } else if (typeProfile.getCode().equals("DG")) {
            // Augmentation de 40% pour les Directeurs Généraux
            return salaire + (salaire * 0.4);
        } else {
            // Pas d'augmentation pour les autres profils
            return salaire;
        }
    }

    // Méthode pour afficher les informations de l'utilisateur
    @Override
    public String afficher() {
        // Appel de la méthode afficher() de la classe parent (Personne) et ajout des infos spécifiques à l'utilisateur
        return "Utilisateur "+ id + " : " + super.afficher() +
                ", Login : " + login +
                ", Password : " + password +
                ", Profile : " + typeProfile.getLibelle() +
                ", Salaire : " + calculerSalaire();  // Affichage du salaire calculé
    }
}
