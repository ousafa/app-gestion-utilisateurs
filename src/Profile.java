// Classe Profile représentant un profil d'utilisateur
public class Profile {
    // Attributs
    private static int compteur = 0; // Compteur statique pour générer un ID unique
    private int id;  // ID unique du profil
    private String code;  // Code du profil (ex : MG pour Manager, DG pour Directeur Général, CP pour Chef de projet ...)
    private String libelle;  // Libellé ou nom du profil (ex: "Manager","Directeur Général", "Chef de projet" ...)

    // Constructeur parametrique
    public Profile(String code, String libelle) {
        this.id = ++compteur; // Auto-incrément de l'identifiant
        this.code = code;
        this.libelle = libelle;
    }

    // Getters & Setters pour accéder et modifier les attributs
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
