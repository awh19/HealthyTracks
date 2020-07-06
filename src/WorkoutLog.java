import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class WorkoutLog {
    private ArrayList<Exercise> exerciseList;
    private LocalDateTime currentDate;

    public WorkoutLog(){
        exerciseList = new ArrayList<>();
        currentDate = this.getDate();
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
