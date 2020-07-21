import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class profileConnector {
    private WorkoutLog workoutLog;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ConnectionManager conMag = new ConnectionManager();


    
    public Profile profile = new Profile();
    
    public profileConnector() {
        con = conMag.getConnection();
        /*
        try {
            stmt = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        */
    }
    
    


    

    

	
	
}