public class Livre {
    String titre;
    int nombre_pages;
    Auteur auteur;

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

    }


}
