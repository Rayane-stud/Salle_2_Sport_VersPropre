/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salle2sport_ray_versi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayan
 */
public class Client extends Utilisateur{
    
    // Attributs
    private int numClient;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private TypeAbonnement typeAbonnement; // sem/tri/an
    private boolean abonnementActif;
    // listes demandées : 
    private ArrayList<Cours> listeCoursFuturs;
    private ArrayList<Cours> listeCoursPasses;
    
    // Constructeur : 
    // numéro client non initialisé car a généré dans generernumeroClient de la classe salle
    
    public Client(String identifiant, String motDePasse, String nom, String prenom, String telephone, String adresse, TypeAbonnement typeAbonnement) {
    super(identifiant, motDePasse);   // appelle Utilisateur
    this.nom = nom;
    this.prenom = prenom;
    this.tel = telephone;
    this.adresse = adresse;
    this.typeAbonnement = typeAbonnement;
    this.abonnementActif = true;      // actif par defaut à la création
    this.listeCoursFuturs = new ArrayList<>();
    this.listeCoursPasses = new ArrayList<>();
}
    
    //                                      Methodes : 
    // ____________________________________________________Getteurs : 
    public int getNumeroClient() {
    return numClient;
}

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public TypeAbonnement getTypeAbonnement() {
        return typeAbonnement;
    }

    public boolean isAbonnementActif() {
        return abonnementActif;
    }

    public List<Cours> getCoursFuturs() {
        return listeCoursFuturs;
    }

    public List<Cours> getCoursPasses() {
        return listeCoursPasses;
    }
    
    
    // __________________________________________modifieurs des infos : 
    public void modifNom(String nom) {
    this.nom = nom;
}

    public void modifPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void modifTelephone(String telephone) {
        this.tel = telephone;
    }

    public void modifAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void modifAbonnementActif(boolean actif) {
        this.abonnementActif = actif;
    }

    public void setNumClient(int num){
        this.numClient = num;
    }
    
    //_______________________________________________________________gestion des listes de cours : 
    // Ajoute un cours à la liste des cours a venir
    public void ajouterCoursFutur(Cours cours) {
        listeCoursFuturs.add(cours);
    }

    // Retire un cours de la liste des cours futurs (désinscription)
    public void retirerCoursFutur(Cours cours) {
        listeCoursFuturs.remove(cours);
    }

    // Déplace un cours de "futurs" vers "passés" apres date du cours
    public void passerCoursEnPasse(Cours cours) {
        listeCoursFuturs.remove(cours);
        listeCoursPasses.add(cours);
    }
    
    
    //_________________________________________________________________Affichages : 
    // NB : pour parcourir les liste dans un but d'affichage la methode for each suffit, mais pour modifier 
    //      Supp un element par exemple nous utiliserons un iterateur a fin de le faire proprement
    
    // Affiche les informations du client
    public void afficherProfil() {
        System.out.println("____ Mon Compte ____");
        System.out.println("Numéro client  : " + this.numClient);
        System.out.println("Nom            : " + this.nom);
        System.out.println("Prénom         : " + this.prenom);
        System.out.println("Email          : " + this.id_email);
        System.out.println("Téléphone      : " + this.tel);
        System.out.println("Adresse        : " + this.adresse);
        System.out.println("Abonnement     : " + this.typeAbonnement);
        System.out.println("Etat           : " + (this.abonnementActif ? "Actif" : "Inactif"));  // Operateur ternaire ( if else simplifié ) 
    }

    // Affiche la liste des cours futurs du client
    public void afficherCoursFuturs() {
        System.out.println("_____ Mes cours à venir _____");
        if (listeCoursFuturs.isEmpty()) {
            System.out.println("Aucun cours à venir."); // <== A modif pr passage au graphique
        } else {
            for (Cours c : listeCoursFuturs) { // methode for each de parcours de liste 
                System.out.println("- " + c.getActivitecour() + " le " + c.getDatecour()  + " à " + c.getHeurecour()); // <== a Modif pr la partie graphique
            }
        }
    }

    // Affiche la liste de ses cours passés
    public void afficherCoursPasses() {
        System.out.println("______ Mes cours passes ______");
        if (listeCoursPasses.isEmpty()) {
            System.out.println("Aucun cours passer."); // <== A modifier quand on passera en graphique
        } else {
            for (Cours c : listeCoursPasses) {
                System.out.println("- " + c.getActivitecour() + " le " + c.getDatecour() + " à " + c.getHeurecour()); // <== A modif pr graphique
            }
        }
    }
}

// Fonctions d'affichages a modifier pour recuperer des String a afficher dans l'interface graphique