/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salle2sport_ray_versi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 **
 * @author rayan
 */
public class Cours {
    // Attributs : 
    private String activite;
    private LocalDate date;
    private LocalTime heure;
    private TypeCours typeCours;
    private ArrayList<Client> listeInscrits;
    private int nbre_places;
    private int id_cours; // utile pour recherche, stockage et suppression précise, idenitifcation precise du cours, ca evite les confusions et les doublons 
    
    
    //Constructeur : 
    // id_cours a initialiser dans la lcasse salle avec une methode generer id lors de la creation de chaque cours 
    public Cours(String activite, LocalDate date, LocalTime heure, TypeCours typeCours, int nombrePlaces) {
        this.activite = activite;
        this.date = date;
        this.heure = heure;
        this.typeCours = typeCours;
        this.nbre_places = nombrePlaces;
        this.listeInscrits = new ArrayList<>();
}
    
    //                                 Méthodes : 
    // _____________________________________________ Getters :
    public int getIdCours() { 
        return id_cours; 
    }

    public String getActivitecour()  {
        return activite;
    }
    
    public LocalDate getDatecour(){
        return date; 
    }
    
    public LocalTime getHeurecour(){
        return heure;
    }
    
    public TypeCours getTypeCours(){
        return typeCours;
    }
    
    public int getNombrePlacescour(){
        return nbre_places; 
    }
    
    public List<Client> getClientsInscritscours() {
        return listeInscrits;
    }
    
    
    // _____________________________________________ Modifieurs :
    // pas de modifieur pour la liste car ca ne serait fais qu'a travers ajouter ou enlever singuliers
    public void setIdCours(int idCours)          { this.id_cours = idCours; }
    public void setActivite(String activite)     { this.activite = activite; }
    public void setDate(LocalDate date)          { this.date = date; }
    public void setHeure(LocalTime heure)        { this.heure = heure; }
    public void setTypeCours(TypeCours typeCours){ this.typeCours = typeCours; }
    public void setNombrePlaces(int nombrePlaces){ this.nbre_places = nombrePlaces; }
    
  
        // Methodes "triviale" en soit mais rendant le reste du code plus propre et comprehenssible, allégeant les methodes dans salle : 
    
   // _______________________________________________ Methodes gestions de cours ( inscriptions )  : 

    // Vérifie s'il reste des places disponibles
    public boolean placesDisponibles() {
        return listeInscrits.size() < nbre_places;
    }

    // Vérifie si aucun client n'est inscrit
    public boolean aucunInscrit() {
        return listeInscrits.isEmpty();
    }

    // Retourne le nombre de clients inscrits
    public int getNbreInscrits() {
        return listeInscrits.size();
    }

    // Ajoute un client à la liste des inscrits
    public void ajouterClient(Client client) {
        listeInscrits.add(client);
    }

    // Retire un client de la liste des inscrits
    public void retirerClient(Client client) {
        listeInscrits.remove(client);
    }
    
    
    // _____________________________________________ Comparaison de dates :
    // A utiliser dans la methode de miseAjour des listes a chaque lancement de l'application ou autre periodicité a determiner 

    // Vérifie si le cours est passer ou pas encore 
    public boolean estPasse() {
        LocalDateTime dateHeure = LocalDateTime.of(this.date, this.heure); // Ici utilisation du format LocalDateTime qui combine les deux
        return dateHeure.isBefore(LocalDateTime.now());                    // on aurait pu le faire en deux temps avec deux conditions ou une condition en if &&
                                                                           // on aurait d'abord comparer la date puis l'heure a celles respectives de now, avec un return False a chaque condition
    }

    // Vérifie si le cours est à venir
    public boolean estFutur() {
        LocalDateTime dateHeure = LocalDateTime.of(date, heure); // meme principe d'utilisateur du format localDateTime au lieu de manipuler deux variables 
        return dateHeure.isAfter(LocalDateTime.now());
    }
    
    
    // ______________________________________________________Affichages : 
    
    //  Affichage d'un cour :
    public void afficherCours() {
        // DateTimeFormatter fDate  = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // changement de format, pour la lisibilité standard
        // DateTimeFormatter fHeure = DateTimeFormatter.ofPattern("HH:mm");  // Ne change casi rien au final 

        System.out.println("________ Cours n°" + id_cours + " __________");
        System.out.println("Activité       : " + activite);
        System.out.println("Date           : " + date); // on aurait mit date.format(fDate)
        System.out.println("Heure          : " + heure);
        System.out.println("Type           : " + typeCours);
        System.out.println("Places         : " + listeInscrits.size() + "/" + nbre_places);
        System.out.println("Disponible     : " + (this.placesDisponibles() ? "Oui" : "Non")); // operateur ternaire comme dans la lcasse client 
    }                                                                                         // forme simplifiée et racoursie d'une forme if else 

}
