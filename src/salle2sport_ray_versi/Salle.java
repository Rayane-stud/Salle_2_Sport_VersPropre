/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salle2sport_ray_versi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rayan
 */
public class Salle {
    // Attributs __________________________________________
    private String nom;
    private ArrayList<Client> listeClients;
    private Admin admin; // Car il n'y a qu'un admin, ca aurait été une liste sinon
    private ArrayList<Cours> listeCoursFuturs;
    private ArrayList<Cours> listeCoursPassees;
    private String nomFichSauvegarde;
    
    // Constructeur : 
    public Salle(String nom, Admin admin, String nomFichierSauvegarde) {
        this.nom = nom;
        this.admin = admin;
        this.nomFichSauvegarde = nomFichierSauvegarde;
        this.listeClients = new ArrayList<>();
        this.listeCoursFuturs = new ArrayList<>();   // Simple initialisation des listes pour l'instant
        this.listeCoursPassees = new ArrayList<>();  // elle se rempliront via Charger puis au fur et a mesure 
    }
    
    //___________________________________________________________Methodes : 
    
    //__________________Methodes clients_______________________________________
    // __Partie 1 : ( Pour console et interface graphique )__
    
    // Vérifie si l'email est déjà utilisé
    private boolean idDejaUtilise(String identifiant) {
        for (Client c : listeClients) {
            if (c.getIdentifiant().equals(identifiant)) {
                return true;
            }
        }
        return false;
    }
    
    // Generation de num client unique
    private int genererNumeroClient() {
        int max = 0;
        for (Client c : listeClients) {      // methode de parcour de arraylist for each, c parcourera tt les elements 
            if (c.getNumeroClient() > max) {  // Comme on a pas de suppression a faire, pas besoin d'itérateur
                max = c.getNumeroClient();
            }
        }
        return max + 1; // On pourrait enrichir le numero client avec une premiere partie qui correspondrait a la date et heure pui max + 1 pour l'unicité 
    }
    
    // Création  compte client et ajout a la liste
    public Client creerCompte(String email, String mdp, String nom, String prenom, String tel, String adresse, TypeAbonnement type) {
        if (idDejaUtilise(email)) {
            return null;    // l'interface gèrera le message d'erreur
        }
        Client nouveau = new Client(email, mdp, nom, prenom, tel, adresse, type);
        nouveau.setNumClient(genererNumeroClient());
        listeClients.add(nouveau);
        return nouveau;     // retourne le client créé, null si échec
    }

    // Maj des info du compte
    public void miseAJourInformationsCompte(Client client, String nom, String prenom,String tel, String adresse) {
        client.modifNom(nom);
        client.modifPrenom(prenom);
        client.modifTelephone(tel);
        client.modifAdresse(adresse);
    }
    
    // Inscrit un client à un cours
    public boolean sInscrireACours(Client client, Cours cours) {  // <== AJOUTE UNE CONDITION PR VOIR SI LA DATE DU COURS EST PASSEE
        if (!client.isAbonnementActif()) {
            return false;   // abonnement inactif
        }
        if (!cours.placesDisponibles()) {
            return false;   // cours complet
        }
        cours.ajouterClient(client);
        client.ajouterCoursFutur(cours);
        return true;
    }
    
    // Désinscrit un client d'un cours futur
    public boolean seDesinscrireDeCours(Client client, Cours cours) { // <== A FAIRE
        return false;
    }
    
    //__________________Methodes Admin_______________________________________________________________________
    
    public ArrayList<Client> getListeClients() {
        return listeClients;
    }
    
    
    // Recherche un client selon un critère
    public ArrayList<Client> rechercherClient(String critere, String valeur) {
        ArrayList<Client> resultats = new ArrayList<>();
        for (Client c : listeClients) {
            switch (critere) {
                case "nom" -> {
                    if (c.getNom().equalsIgnoreCase(valeur))
                        resultats.add(c);
                }
                case "prenom" -> {
                    if (c.getPrenom().equalsIgnoreCase(valeur))
                        resultats.add(c);
                }
                case "telephone" -> {
                    if (c.getTelephone().equals(valeur))
                        resultats.add(c);
                }
                case "numero" -> {
                    if (c.getNumeroClient() == Integer.parseInt(valeur))
                        resultats.add(c);
                }
                case "abonnement" -> {
                    if (c.getTypeAbonnement().toString().equalsIgnoreCase(valeur))
                        resultats.add(c);
                }
            }
        }
        return resultats;
    }
    
    // Désactive l'abonnement d'un client
    public void desactiverAbonnement(Client client) {
        client.modifAbonnementActif(false);
    }
    
    // Réactive l'abonnement d'un client
    public void reactiverAbonnement(Client client) {
        client.modifAbonnementActif(true);
    }
    
                                                    // Gestion des cours :
    // Retourne tous les cours passés
    public ArrayList<Cours> getListeCoursPassees() {
        return listeCoursPassees;
    }
    
    // Crée un cours et l'ajoute à la liste des cours futurs
    public Cours creerCours(String activite, LocalDate date, LocalTime heure, TypeCours typeCours, int nombrePlaces) {
        return null; // <== A FAIRE
    }
    
    // Supprime un cours futur si aucun client n'est inscrit
    public boolean supprimerCours(Cours cours) {
        if (!cours.aucunInscrit()) {
            return false;   // impossible, des clients sont inscrits
        }
        listeCoursFuturs.remove(cours);
        return true;
    }
    
    // Modifie un cours futur si aucun client n'est inscrit
    public boolean modifierCours(Cours cours, String activite, LocalDate date,LocalTime heure, TypeCours typeCours, int nombrePlaces) {
        return false; // <== A FAIRE
    }
    
    // Retourne les cours d'une activité donnée
    public ArrayList<Cours> getCoursParActivite(String activite) {
        ArrayList<Cours> resultats = new ArrayList<>();
        for (Cours c : listeCoursFuturs) {  // parcours for each 
            if (c.getActivitecour().equalsIgnoreCase(activite)) { // Ignorecase compare sans tenir compte des majuscules et minuscules
                resultats.add(c);
            }
        }
        return resultats;
    }
    
    // Plus populaires
    public ArrayList<Cours> getCoursPlusPopulaires() {
        ArrayList<Cours> trie = new ArrayList<>(listeCoursFuturs); // clone de la liste pour ne pas la modifier
        Collections.sort(trie);    // utilise automatiquement le compareTo() modifier dans la classse cours ou l'interface comparable a ete implementée
        return trie;
    }

    
    // Moins populaires
    public ArrayList<Cours> getCoursMoinsPopulaires() {
        ArrayList<Cours> trie = new ArrayList<>(listeCoursFuturs);
        Collections.sort(trie);
        Collections.reverse(trie); // inverse  le résultat
        return trie;
    }
    
    
    
    //__________________Methodes communes_______________________
    // connexion : la meme methode est appliquée aux client et admin car il n'y a qu'un admin simplifiant le cas
    public Utilisateur seConnecter(String identifiant, String motDePasse) {
        if (admin.getIdentifiant().equals(identifiant) && admin.getMot2Passe().equals(motDePasse)) {
            return admin;
        }
        for (Client c : listeClients) {
            if (c.getIdentifiant().equals(identifiant) &&
                c.getMot2Passe().equals(motDePasse)) {
                if (!c.isAbonnementActif()) {
                    return null;    // l'interface gerera le message
                }
                return c;
            }
        }
        return null; // client n'existe pas 
    }
    
    // Mis a jour du mdp 
    public boolean miseAJourMotDePasse(Utilisateur utilisateur, String ancienMdp, String nouveauMdp) {
        if (!utilisateur.getMot2Passe().equals(ancienMdp)) {
            return false;   // l'interface gerera le message d'erreur
        }
        utilisateur.setMot2passe(nouveauMdp);
        return true;
    }
    
    // Retourne la liste des cours futurs
    public ArrayList<Cours> getCoursFuturs() {
        return listeCoursFuturs;
    }
    
    // Retourne la liste des activités distinctes
    public ArrayList<String> getListeActivites() {   // <== A FAIRE
        return null;
    }
    
    //___________________Methodes de sauvegarde et de chargement________
    
    // Utilisation de plusieurs fichier txt ( 1 par classe je pense ) 
    
    //une methode pour sauvegarder
    // une methode pour charger
    
    
    
    
    
    
    
    
    
    
    
    
    
    
// Aaaaaaaaaaaaaaaaa1

    public void ConsulterCompte(){
        for (Client client : listeClients){
            if (client.getNom().equals(this.nom)){
            client.afficherProfil();
            }
            }
        }
    
    
    
    
    
    public void RechercheCritère(){
    
    }
    
    public void DesactiverAbonnemment(){
        boolean b = false;
        //this.modifAbonnementDesactif(b);
    }
        
    
    
    public void ReactiverAbonnemment(){
        //this.modifAbonnementActif(true);
    }
    
    
    // Affiche la liste des cours futurs
    public void ConsulterListeCoursFuturs() {
        System.out.println("_____ Les cours à venir _____");
        if (listeCoursFuturs.isEmpty()) {
            System.out.println("Aucun cours à venir."); // <== A modif pr passage au graphique
        } else {
            for (Cours c : listeCoursFuturs) { // methode for each de parcours de liste 
                System.out.println("- " + c.getActivitecour() + " le " + c.getDatecour()  + " à " + c.getHeurecour()); // <== a Modif pr la partie graphique
            }
        }
    }

    // Affiche la liste de ses cours passés
    public void ConsulterListeCoursPasses() {
        System.out.println("______ Les cours passes ______");
        if (listeCoursPassees.isEmpty()) {
            System.out.println("Aucun cours passer."); // <== A modifier quand on passera en graphique
        } else {
            for (Cours c : listeCoursPassees) {
                System.out.println("- " + c.getActivitecour() + " le " + c.getDatecour() + " à " + c.getHeurecour()); // <== A modif pr graphique
            }
        }
    }
    
    
    }
    
    
    
