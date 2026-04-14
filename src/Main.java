import java.util.ArrayList;

public class Main {
    static void main(){

        Bibliotheque b1 = new Bibliotheque("Médiathèque de Toulouse");

        Auteur a1 = new Auteur("Hugo", "Victor", 1802);
        Auteur a2 = new Auteur("Rowling", "JK", 1965);

        Livre l1 = new Livre("Les Misérables", 1500, a1);
        b1.ajouterUnLivre(l1);
        Livre l2 = new Livre("Harry Potter", 400, a2);
        b1.ajouterUnLivre(l2);
        Livre l3 = new Livre("Notre-Dame de Paris", 600, a1);
        b1.ajouterUnLivre(l3);

        //Affichage des livres de la bibiliothèque :
        b1.afficherlivresBibi();

        //test affichage des infos d'un auteur :

        a1.afficherInformationsAuteur();

        //Test

        Genre g1 = new Genre("Roman", "Long récit");
        Genre g2 = new Genre("Classique", "Oeuvre de référence");
        Genre g3 = new Genre("Sciences", "Oeuvre de scientifiques");

        l1.ajouterGenre(g1);
        l2.ajouterGenre(g2);
        l2.ajouterGenre(g3);

        l2.afficherInformationsLivre();

        a1.updateAnnee(2022);
        a1.afficherInformationsAuteur();



    }
}

