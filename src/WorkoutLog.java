import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;


public class WorkoutLog {
    private ArrayList<Exercise> exerciseList;
    private LocalDateTime currentDate;
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private ConnectionManager conMag = new ConnectionManager();

    public WorkoutLog(){
        exerciseList = new ArrayList<>();
        currentDate = this.getDate();
        con = conMag.getConnection();
        try {
            stmt = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void listPossibleExercises(){
        //TODO: CONNECT TO DATABASE HERE AND display LIST OF EXERCISES
        try {
            rs = stmt.executeQuery("SELECT * FROM tbl_exercises");
            while(rs.next()){
                System.out.println(rs.getString("exerciseId") + "\t" + rs.getString("name") + "\t" + rs.getString("description"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return;
    }

    public void AddExercise(Exercise e){
        exerciseList.add(e);
    }

    public void removeExercise(Exercise e){
        exerciseList.remove(e);
    }

    public void updateExercise(Exercise e){

        //TODO: UPDATE METHOD TO HAVE LOGIC ON WHETHER OR NOT TO UPDATE SETS/REPS/WEIGHT
        return;
    }

    public LocalDateTime getDate(){
        return LocalDateTime.now();
    }

}
