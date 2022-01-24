package strategy;

import java.util.ArrayList;

/**
 * Implements SortBehavior interface to sort Array List through Insertion Sort
 * @author Kim Dinh
 */
public class InsertionSort implements SortBehavior{

    /**
    * Sorts the Listing in ascending order by examining a partition of the 
    * Array List starting from the leftmost side of the Array List
    * and adding another element of the Array List to the partition after 
    * the sorting of the previous partition is complete until the entire Array 
    * List has been properly sorted
    */
    public ArrayList<String> sort(ArrayList<String> data) {
        for(int i = 0; i < data.size(); i++) {
            for(int j = i; j > 0; j--) {
                int comparison = data.get(j).compareTo(data.get(j-1));
                if(comparison < 0) {
                    String temp = data.get(j);
                    data.set(j, data.get(j-1));
                    data.set(j-1, temp);
                }
            }
        }
        return data;
    }
}
