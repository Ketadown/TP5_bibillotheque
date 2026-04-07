import java.util.ArrayList;

public class Livre {
    String titre;
    int nombre_pages;
    Auteur auteur;
    public ArrayList<Genre> genres_liste = new ArrayList<Genre>();

    public Livre(String titre, int nombre_pages,Auteur auteur){
        this.titre=titre;
        this.nombre_pages=nombre_pages;
        this.auteur=auteur;
    }

    public void afficherInformationsLivre(){
        System.out.println("-_-_-_-_-_-_-_-_-_-");
        System.out.println("Le titre de ce livre : "+titre);
        System.out.println("Le nombre de pages de ce livre : "+nombre_pages);
        System.out.println("L'auteur de ce livre : "+auteur.nom+" "+auteur.prenom);
        System.out.print("Genres : ");
        for (int i = 0; i < genres_liste.size(); i++) {
            System.out.print(genres_liste.get(i).nom + " ");
        }

    }

    public void ajouterGenre(Genre g) {
        this.genres_liste.add(g);
    }


}
