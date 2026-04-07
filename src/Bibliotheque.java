import java.util.ArrayList;

public class Bibliotheque {
    String nom;
    ArrayList<Livre> listeDesLivres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.listeDesLivres = new ArrayList<Livre>();
    }

    public void ajouterUnLivre(Livre livreAAjouter) {
        this.listeDesLivres.add(livreAAjouter);
    }

    public void afficherlivresBibi(){
        System.out.println("Liste des livres : ");
        for(int i=0; i<listeDesLivres.size(); i++){
            listeDesLivres.get(i).afficherInformationsLivre();
        }
    }
}