package observer;

import java.util.HashMap;

/**
 * Observer that keeps track of the percent of votes each candidate has 
 * @author Kim Dinh
 */
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private int numVotes;

    /**
     * Initializes Subject poll and registers PercentageDisplay class as 
     * an Observer
     * @param poll
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates the PercentageDisplay 
     * @param votes
     */
    public void update(HashMap<String, Integer> votes) {
        votes = new HashMap<String, Integer>();
        display();
    }

    /**
     * Calculates total percentage of votes each candidate got then prints 
     * out the name of the candidate followed by the total percentage of 
     * votes they got
     */
    private void display() {
        for (String president : votes.keySet()) {
            numVotes = votes.get(president) + numVotes;
        }
        for (String president : votes.keySet()) {
            System.out.println(president + ": " + votes.get(president)/numVotes + "%");
        }
    }
}
