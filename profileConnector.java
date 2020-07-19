import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class profileConnector {
    private WorkoutLog workoutLog;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ConnectionManager conMag = new ConnectionManager();

    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private double feet;
    private double inches;
    private double weight;
    private String units;
    
    
    public profileConnector() {
        con = conMag.getConnection();
        try {
            stmt = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void getProfile() {
    	
    }
    
    public String getFirstName() {
    	return this.firstName;
    }
    
    public String getLastName() {
    	return this.lastName;
    }
    
    public String getUserName() {
    	return this.username;
    }
    
    public String getUnits() {
    	return this.units;
    }
    
    public double getFeet() {
    	return this.feet;
    }
    
    public double getInches() {
    	return this.inches;
    }
    
    public double getWeight() {
    	return this.weight;
    }
    
    
    

    
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }
    
    public void setUsername(String user) {
    	this.username = user;
    }

    
    public void setUnits(String units) {
    	this.units = units;
    }
    

    
    public void setFeet(double feet) {
    	this.feet = feet;
    }
    
    public void setInches(double inch) {
    	this.inches = inch;
    }
    
    public void setWeight(double weight) {
    	this.weight = weight;
    }
	
    
    public String getPassword() {
    	return this.password;
    }
    
    public void setPassword(String pass) {
    	this.password = pass;
    }
    

	
	
}