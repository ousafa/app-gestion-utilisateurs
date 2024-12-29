import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Créer les profiles :
        Profile manager = new Profile("MG", "Manager");
        Profile chefProjet = new Profile("CP", "Chef de projet");
        Profile directeurProjet = new Profile("DP", "Directeur de projet");
        Profile DRH = new Profile("DRH", "Directeur des ressources humaines");
        Profile directeurGeneral = new Profile("DG", "Directeur général");

        //Créer des utilisateurs avec les différents profiles métiers
        Utilisateur user1 = new Utilisateur("Nassiri", "Ali", "ali@gmail.com", "0612435566",2000,"login1","pswd1","service1",manager);
        Utilisateur user2 = new Utilisateur("Jabiri", "Imane", "jabiri@gmail.com", "07144664544",4000,"login2","pswd2","service2",chefProjet);
        Utilisateur user3 = new Utilisateur("Farah", "Wafa", "jabiri@gmail.com", "07144664544",8000,"login3","pswd3","service3",directeurProjet);
        Utilisateur user4 = new Utilisateur("Youssafi", "Ahmed", "jabiri@gmail.com", "07144664544",10000,"login3","pswd4","service4",DRH);
        Utilisateur user5 = new Utilisateur("Nabili", "Youssef", "jabiri@gmail.com", "07144664544",14000,"login5","pswd5","service5",directeurGeneral);

        //Créer une liste
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();

        //Ajout des user dans utilisateurs
        utilisateurs.add(user1);
        utilisateurs.add(user2);
        utilisateurs.add(user3);
        utilisateurs.add(user4);
        utilisateurs.add(user5);

        // Affichege
        for(Utilisateur utilisateur : utilisateurs){
            System.out.println(utilisateur.afficher());
        }

    }

}