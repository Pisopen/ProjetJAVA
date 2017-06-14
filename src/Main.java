import MC.*;
import View.Fenetre;
import View.FentreAjoutBD;

import java.sql.*;

public class Main {
    public static void main (String[] args) throws SQLException {

/*        Fenetre f = new Fenetre(1100, 800, "Jeux");

        ////// ABALONE
        Abalone AB = new Abalone();

        ////// DM
        DameChinoise dm = new DameChinoise(2);
        dm.addJoueur("Quentin");
        dm.addJoueur("Sean");
        dm.setTourJoueur(dm.getJoueur().get(0)); //set le tour en cours sur le premier joueur renseigné

        /////// AJOUT JEUX SUR FENETRE
        f.setJeu(dm);
        f.setJeu(AB);
*/
        // TESTS //
        /*
        AB.getPlateau().affichePlateau();
        AB.jouerCoup('H',47);
        System.out.println();
        AB.getPlateau().affichePlateau();
        */
        FentreAjoutBD fentreAjoutBD = new FentreAjoutBD(500,500,"Ajouter Joueur");
        fentreAjoutBD.setVisible(true);

    }
}
