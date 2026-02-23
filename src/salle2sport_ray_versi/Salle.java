/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salle2sport_ray_versi;

import java.util.ArrayList;

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
    
    //__________________Methodes Admin________________
    
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
    
    //___________________Methodes de sauvegarde et de chargement________
    

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
        this.modifAbonnementDesactif(b);}
        
    
    
    public void ReactiverAbonnemment(){
        this.modifAbonnementActif(true);
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
    
    
    
