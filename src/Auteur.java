import java.util.ArrayList;

public class Auteur {
    String nom;
    String prenom;
    int annee_naissance;

    public Auteur(String nom,String prenom,int annee_naissance){
        this.nom = nom;
        this.prenom = prenom;
        this.annee_naissance = annee_naissance;
    }

    ArrayList<Auteur> listeAuteurs = new ArrayList<Auteur>();

    public void ajouterAuteur(Auteur AChoisi){

        listeAuteurs.add(AChoisi);
    }

    public void afficherInformationsAuteur(){
            System.out.println("_-_-_-_-_-_-_-_-_");
            System.out.println("Le nom de cet auteur : "+nom);
            System.out.println("Le prénom de cet auteur : "+prenom);
            System.out.println("L'auteur est né en : "+annee_naissance);
    }


}
