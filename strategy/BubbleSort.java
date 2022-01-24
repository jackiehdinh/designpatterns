package strategy;

import java.util.ArrayList;

/**
 * Implements SortBehavior interface to sort Array List through Bubble Sort
 * @author Kim Dinh
 */
public class BubbleSort implements SortBehavior {

    /**
    * Sorts the Listing in ascending order by comparing neighboring elements 
    * to each other and switching them as necessary until the "greatest" 
    * element is on the rightmost side of the Array List; then, the process
    * repeats while excluding the elements that have reached the rightmost they
    * will reach until the entire Array List has been sorted
    */
    public ArrayList<String> sort (ArrayList<String> data) {
        for (int i = data.size(); i > 0; i--) {
            for (int j = 1; j < data.size(); j++) {
                int comparison = data.get(j).compareTo(data.get(j - 1));
                if (comparison < 0) {
                    String temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
            }
        }
        return data;
    }
}
