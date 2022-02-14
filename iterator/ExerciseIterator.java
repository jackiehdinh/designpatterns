package iterator;
import java.util.Iterator;

/**
 * Exercise Iterator Class
 * @author Kim Dinh
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position = 0;

    /**
     * Initializes the array of exercises 
     * @param exercises
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }
    
    /**
     * Checks to see if there is another exercise in the array
     * @return boolean
     */
    public bool hasNext() {
        if (position >= exercises.length || exercises[position] == null)
            return false;
        else
            return true;
    }

    /**
     * Inserts exercise at current position then moves pointer forward
     * @return exercise
     */
    public Exercise next() {
        Exercises exercise = exercises[position];
        position += 1;
        return exercise;       
    }
}
