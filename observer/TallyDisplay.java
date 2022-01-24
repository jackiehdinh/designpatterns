package observer;

import java.util.HashMap;

/**
 * Observer that keeps track of the total number of votes of each candidate 
 * @author Kim Dinh
 */
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();

    /**
     * Initializes Subject and registers TallyDisplay as observer
     * @param poll
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }
 
    /**
     * Updates the HashMap for the TallyDisplay and calls the display method
     * @param votes 
     */
    public void update(HashMap<String, Integer> votes) {
        votes = new HashMap<String, Integer>();
        display();
    }

    /**
     * Prints out name of candidiate followed by the number of votes they got
     */
    private void display() {
        for (String president : votes.keySet()) {
            System.out.println(president + ": " + votes.get(president));
        }
    }
}
