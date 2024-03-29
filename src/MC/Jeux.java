package MC;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by QUENTIN on 29/04/2017.
 */
public abstract class Jeux {

    protected Plateau plateau;
    protected ArrayList<String> joueur;
    protected int score[];
    protected String modeJeu;
    protected ArrayList<Color> jcolor[];
    protected String tourJoueur;
    protected BDD_Joueur tabJoueur;

/*
    CONSTRUCTEUR
     */

    public Jeux() { }

    /*
        GETTER & SETTER
    */

    public BDD_Joueur getTabJoueur() {
        return tabJoueur;
    }

    public void setTabJoueur(BDD_Joueur tabJoueur) {
        this.tabJoueur = tabJoueur;
    }

    public ArrayList<String> getJoueur() {
        return joueur;
    }

    public int[] getScore() {
        return score;
    }

    public void setScore(int[] score) {
        this.score = score;
    }

    public String getModeJeu() {
        return modeJeu;
    }

    public void setModeJeu(String modeJeu) {
        this.modeJeu = modeJeu;
    }

    public Plateau getPlateau() {
        return plateau;
    }

    public ArrayList<Color>[] getJcolor() {
        return jcolor;
    }

    public void setJcolor(ArrayList<Color>[] jcolor) {
        this.jcolor = jcolor;
    }

    public boolean addJoueur(String nomJoueur){
        for(String n : joueur){
            if(n==nomJoueur)
                return false;
        }
        joueur.add(nomJoueur);
        return true;
    }

    public void removeJoueur(String nomJoueur){
        joueur.remove(nomJoueur);
    }

    public void removeAllJoueur(){
        for (int i=0; i<joueur.size(); i++){
            joueur.remove(i);
        }
    }

    public abstract void tourSuivant();

    public void setTourJoueur(String tourJoueur) {
        this.tourJoueur = tourJoueur;
    }

    public String getTourJoueur(){return tourJoueur;}

    public boolean pionAppartientJoueurCourant(Color color){
        int indexOfJoueur = this.joueur.indexOf(this.tourJoueur);
        System.out.println("color="+color+" / colorJcourant"+jcolor[indexOfJoueur].toString());
        for(Color c : jcolor[indexOfJoueur]){
            if(c==color)
                return true;
        }
        return false;
    }

    /*
    METHODES POUR SAUVEGARDER AVEC BD ICI
     */

    public void addJoueurBD (String name) throws SQLException {
        if (!tabJoueur.playerexist(name)) {
            tabJoueur.Add_player(name);
        }
        else
            System.out.println("Player exist");
    }
}
