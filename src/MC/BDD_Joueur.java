package MC;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.sql.*;

/**
 * Created by steph on 12/06/2017.
 */
public class BDD_Joueur {
    private Connection connection=null;

    public BDD_Joueur(){
    }

    public void connect(){
        try {
            String url = "jdbc:mysql://www.budbud.ovh:3306/iatic3";
            Class.forName ("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, "iatic3", "iatic3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void Add_player(String pseudo) throws SQLException{
        connect();
        try{
            Statement stmt = connection.createStatement();
            String sql_add="INSERT INTO Joueur (`Pseudo`, `NbWin`, `NbLoose`) VALUES ('"+pseudo+"',0,0);";
            stmt.executeUpdate(sql_add);
        }catch (Exception e){
            e.printStackTrace();
        }
        connection.close();
    }
    public String playerexist(String Pseudo){
        connect();
        try{
            Statement stmt =connection.createStatement();
            String sql="SELECT Pseudo FROM Joueur WHERE Pseudo ='"+ Pseudo+ "';" ;
            ResultSet rs= stmt.executeQuery(sql);
            while (rs.next()){
                String test = rs.getString("Pseudo");
                return test;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
