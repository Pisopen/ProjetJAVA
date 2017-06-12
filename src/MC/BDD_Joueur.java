package MC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by steph on 12/06/2017.
 */
public class BDD_Joueur {
    private Connection connection=null;

    public BDD_Joueur(){
    }
     public void Add_player(String pseudo) throws SQLException{
         try {
             String url = "jdbc:mysql://www.budbud.ovh:3306/iatic3";
             Class.forName ("com.mysql.jdbc.Driver");
             connection = DriverManager.getConnection(url, "iatic3", "iatic3");
         } catch (Exception e) {
             e.printStackTrace();
         }
        try{
            Statement stmt = connection.createStatement();
            String sql_add="INSERT INTO Joueur (`Pseudo`, `NbWin`, `NbLoose`) VALUES ('"+pseudo+"',0,0);";
            stmt.executeUpdate(sql_add);
        }catch (Exception e){
            e.printStackTrace();
        }
        connection.close();
    }

}
