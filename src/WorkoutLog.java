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

    public WorkoutLog(){
        exerciseList = new ArrayList<>();
        currentDate = this.getDate();
        con = ConnectionManager.getConnection();
        try {
            stmt = con.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void listPossibleExercises(){
        //TODO: CONNECT TO DATABASE HERE AND display LIST OF EXERCISES
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
