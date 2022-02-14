package iterator;
import java.util.ArrayList;

/**
 * A Physical Therapist
 * @author Kim Dinh
 */
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    /**
     * Creates a PT with the specified first and last name, biography,
     * array of exercises, and number of exercises
     * @param firstName
     * @param lastName
     * @param bio
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercises = new Exercise[10];
        this.numExercises = 10;
    }

    /**
     * Adds exercises to the array of exercises
     * @param title
     * @param muscleGroups
     * @param directions
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        Exercise exercise = new Exercise(title, muscleGroups, directions);
        List<Exercise> temp = new ArrayList<Exercise>(Arrays.asList(exercises));
        if (temp.iterator.hasNext()) {
            temp.add(exercise);
        } else {
            growArray(exercises);
            temp.add(exercise);
        }
        exercises = temp.toArray(exercises);
    }

    /**
     * Returns first name of PT
     * @return String firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Returns last name of PT
     * @return String lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Returns bio of PT
     * @return String bio
     */
    public String getBio() {
        return this.bio;
    }

    /**
     * Doubles size of array 
     * @param exercises
     * @return array Exercise[]
     */
    private Exercise[] growArray(Exercise[] exercises) {
        numExercises *= 2; 
        Exercise[] doubleExercises = new Exercise[numExercises];
        for (int i = 0; i < size; i++)
            doubleExercises[i] = exercises[i];
        return doubleExercises;
    }

    /**
     * creates iterator
     * @return exercise.iterator
     */
    public ExerciseIterator createIterator() {
        return new exercises.iterator();
    }

    /**
     * Turns PT information into a string
     * @return String 
     */
    public String toString() {
        return this.firstName + " " + this.lastName + "\n" + this.bio;
    }
}
