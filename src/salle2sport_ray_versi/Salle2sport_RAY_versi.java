/*
Vignes Gabriel
Ouchiha Rayane
Groupe CB
 */
package salle2sport_ray_versi;

/**
 *
 * @author rayan
 */

import java.time.LocalDate;
import java.time.LocalTime;



public class Salle2sport_RAY_versi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("===== TEST PROJET SALLE DE SPORT =====\n");

        // 1️⃣ Création admin
        Admin admin = new Admin("admin@salle.fr", "admin123");

        // 2️⃣ Création salle
        Salle salle = new Salle("Fitness Club", admin, "data.txt");

        // 3️⃣ Création clients
        Client c1 = salle.creerCompte("rayane@mail.com", "1234",
                "Ouchiha", "Rayane", "0600000000",
                "Paris", TypeAbonnement.ANNUEL);

        Client c2 = salle.creerCompte("gabriel@mail.com", "abcd",
                "Vignes", "Gabriel", "0700000000",
                "Lyon", TypeAbonnement.TRIMESTRIEL);

        System.out.println("Clients créés : ");
        c1.afficherProfil();
        c2.afficherProfil();

        // 4️⃣ Création cours
        Cours cours1 = salle.creerCours(
                "Cardio Training",
                LocalDate.now().plusDays(2),
                LocalTime.of(18, 0),
                TypeCours.CARDIO,
                10
        );

        Cours cours2 = salle.creerCours(
                "Yoga Relax",
                LocalDate.now().plusDays(3),
                LocalTime.of(10, 0),
                TypeCours.YOGA,
                5
        );

        System.out.println("\nCours créés :");
        cours1.afficherCours();
        cours2.afficherCours();

        // 5️⃣ Inscription
        System.out.println("\nInscription Rayane au Cardio : "
                + salle.sInscrireACours(c1, cours1));

        System.out.println("Inscription Gabriel au Yoga : "
                + salle.sInscrireACours(c2, cours2));

        // 6️⃣ Affichage cours futurs client
        System.out.println("\nCours futurs Rayane :");
        c1.afficherCoursFuturs();

        // 7️⃣ Désinscription
        System.out.println("\nDésinscription Rayane du Cardio : "
                + salle.seDesinscrireDeCours(c1, cours1));

        c1.afficherCoursFuturs();

        // 8️⃣ Test modification cours (possible car plus inscrit)
        System.out.println("\nModification Yoga (places = 20)");
        salle.modifierCours(cours2,
                "Yoga Relax",
                cours2.getDatecour(),
                cours2.getHeurecour(),
                TypeCours.YOGA,
                20);

        cours2.afficherCours();

        // 9️⃣ Test sauvegarde
        System.out.println("\nSauvegarde...");
        salle.sauvegarderTout();

        // 🔟 Test chargement (simulation redémarrage)
        System.out.println("Chargement...");
        salle.chargerTout();

        System.out.println("\nListe clients après chargement :");
        for (Client c : salle.getListeClients()) {
            c.afficherProfil();
        }

        System.out.println("\nListe cours après chargement :");
        salle.ConsulterListeCoursFuturs();

        System.out.println("\n===== FIN DES TESTS =====");
        
        
        
        
        
    }
    
}
