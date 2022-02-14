package iterator;
import Java.util.*;

/**
 * Creates a single exercise with target muscles and directions
 * @author Kim Dinh
 */
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Initializes the Exercise class
     * @param title
     */
    public Exercise(String title) {
        this.title = title;
        targetMuscles = new ArrayList<String>();
        directions = new ArrayList<String>();
    }

    /**
     * Creates a new Exercise with the specified title, target
     * muscles list, and directions list
     * @param title
     * @param targetMuscles
     * @param directions
     */
    public Exerise(String title, ArrayList<String> targetMuscle, ArrayList<String> direction) {
        this.title = title;
        this.targetMuscles = new ArrayList(targetMuscle);
        this.directions = new ArrayList(direction);
    }

    /**
     * Adds a muscle to the list of target muscles
     * @param muscle
     */
    public void addTargetMuscle(String muscle) {
        targetMuscle.add(muscle);
    }

    /**
     * Removes a muscle from the list of target muscles
     * @param muscle
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscle.remove(muscle);
    }

    /**
     * Returns a string listing the name of the exercise, followed by the 
     * target muscles listed on one line, followed by the directions for 
     * the exercise listed on separate lines
     * @return String
     */
    public String toString() {
        System.out.print("... " + this.title + " ...\nMuscles:" + targetMuscle[0]);
        for(int i = 1; i < targetMuscle.size(); i++) 
            System.out.println(", " + targetMuscle[i]);
        System.out.println("Exercises: ");
        for(String direction: directions) {
            System.out.println("- " + direction);
        }
    }
}
