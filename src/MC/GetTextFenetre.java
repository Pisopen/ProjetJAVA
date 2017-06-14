package MC;

import View.FentreAjoutBD;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/**
 * Created by steph on 14/06/2017.
 */
public class GetTextFenetre extends AbstractAction {
    private BDD_Joueur bdd_joueur =new BDD_Joueur();
    private FentreAjoutBD fenetre;

    public GetTextFenetre(FentreAjoutBD fenetre, String texte){
        super(texte);
        this.fenetre = fenetre;
    }

    public void actionPerformed(ActionEvent e) {
        String pseudo = fenetre.getTextField().getText();
        try {
            if (!bdd_joueur.playerexist(pseudo)){
                bdd_joueur.Add_player(pseudo);
            }
            else{
                fenetre.getLabel().setText("Joueur Existant");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

    }
}
