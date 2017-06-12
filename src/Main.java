import MC.*;
import View.Fenetre;

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
        /*Connection conn = null;
        try {
            String url = "jdbc:mysql://www.budbud.ovh:3306/iatic3";
            Class.forName ("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, "iatic3", "iatic3");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM Joueur";
            ResultSet rs = stmt.executeQuery(sql);
            //STEP 5: Extract data from result set

            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("IDJoueur");
                String pseudo = rs.getString("Pseudo");
                //Display values
                System.out.println("ID: " + id + " PSEUDO: " +pseudo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        BDD_Joueur Joueur=new BDD_Joueur();
        Joueur.Add_player("Pisop");
    }
}
