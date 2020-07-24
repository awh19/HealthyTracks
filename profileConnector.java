
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
        System.out.println("connection made");
        try {
            stmt = con.createStatement();
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        
    }
    
    public boolean addProfile(Profile e){
        try {
        	
        	
        	
       
        	stmt.executeUpdate("INSERT INTO tbl_test (`id`, `name`) VALUES ('2', 'bob');");

        //	stmt.executeUpdate("INSERT INTO `tbl_login` (`userId`, `userName`, `password`, `firstName`, `lastName`, `weight`, `feet`, `inches`) VALUES ('3', 'adam3', 'pass3', 'bob', 'fred', '110', '61', '21');");
        			              
        	String query1 = "INSERT INTO tbl_login (`userName`, `password`, `firstName`, `lastName`, 'weight', 'feet', 'inches') VALUES ('+adamnash5+','+passs1+', '+adam+', '+nash+', '+100+', '+6+', '+2+');";
         //   stmt.executeUpdate(query1);
        	
            String query = "INSERT INTO tbl_login (`userName`, `password`, `firstName`, `lastName`, 'weight', 'feet', 'inches') VALUES ('"+e.getUsername()+"','"+e.getPassword()+"', '"+e.getFirstName()+"', '"+e.getLastName()+"', '"+e.getWeight()+"', '"+e.getFeet()+"', '"+e.getInches()+"');";
         //   stmt.executeUpdate(query);
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
    
	
}