import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class profileConnector {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ConnectionManager conMag = new ConnectionManager();


    
    public Profile profile = new Profile();
    
    public profileConnector() {
        con = conMag.getConnection();
        System.out.println("connection made");
        try {
            stmt = con.createStatement();
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
    }
    
    public boolean addProfile(){
        try {
            String query = "INSERT INTO tbl_login (`userName`, `password`, `firstName`, `lastName`, `weight`, 'feet', 'inches') VALUES ('awh19','password','Andrew','Hill','175','5','11');";
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
    


    

    

	
	
}