import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;


public class profileConnector {
    private WorkoutLog workoutLog;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ConnectionManager conMag = new ConnectionManager();


    
    public Profile profile = new Profile();
    
    public profileConnector() {
        con = conMag.getConnection();
        System.out.println("connection made")
        try {
            stmt = con.createStatement();
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
    }
    
    public boolean addProfile(){
        try {
            String query = "INSERT INTO tbl_login VALUES ('"profile.getUsername()"', '"profile.getPassword()"', '"profile.getFirstName()"', '"profile.getLastName()"', '"profile.getUnits()"', '"profile.getWeight()"', '"profile.getFeet()"', '"profile.getInches()"');";
            stmt.executeUpdate(query);
            
            stmt.executeUpdate("INSERT INTO `nkfszrrxkyw5jypd`.`tbl_login` ( `userName`, `password`, `firstName`, `lastName`, `units`, `weight`, `feet`, `inches`) VALUES ('awn12', 'pass', 'adam', 'nash', 'customary', '100', '5', '10');");

            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
    


    

    

	
	
}