import java.util.ArrayList;

/**
 * A Listing of Items
 * @author Kim Dinh
 */
public class Listing {
   private String title;
   private ArrayList<String> items;
   SortBehavior sortBehavior;

   /**
    * Creates a Listing with the indicated title and consisting of 
    * items in an Array List of Strings; the interface sortBehavior 
    * is initially set equal to the BubbleSort class
    * @param title
    */
   public Listing(String title) {
       this.title = title;
       items = new ArrayList<String>();
       sortBehavior = new BubbleSort();
   }
   
   /**
    * Adds a String onto the end of the Listing
    * @param item
    */
   public void add(String item) {
       items.add(item);
   }

   /**
    * Removes a String from the end of the Listing
    * @param item
    */
   public void remove(String item) {
       items.remove(item);
   }

   /**
    * Returns a String representing the title of the Listing
    * @return A String representing the title of the Listing
    */
   public String getTitle() {
       return title;
   }

   /**
    * Changes sortBehavior to whichever implemented class is used as a parameter
    * @param sortBehavior
    */
   public void setSortBehavior(SortBehavior sb) {
       sortBehavior = sb;
   }   
   /**
    * Creates a new Array List that is sorted according to the sort 
    * behavior chosen by user
    * @return The sorted Array List
    */
   public ArrayList<String> getSortedList() {
       ArrayList<String> sorted = sortBehavior.sort(items);
       return sorted;
   }

   /**
    * Returns the Listing without any sorting whatsoever
    * @return The original listing
    */
   public ArrayList<String> getUnsortedList() {
       return items;
   }
}
