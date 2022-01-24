package strategy;

import java.util.ArrayList;

/**
 * An interface that forces classes that implement it to use the sort method
 * @author Kim Dinh
 */
public interface SortBehavior {

    /**
     * Method that sorts Array List according to the respective sort method and 
     * and returns the sorted Array List
     * @param data
     * @return Sorted Array List
     */
    public ArrayList<String> sort(ArrayList<String> data);
}
