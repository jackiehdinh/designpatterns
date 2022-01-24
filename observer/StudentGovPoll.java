package observer;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * Subject class that keeps tracks of observers and data observers are interested 
 * in such as candidates and number of votes
 * @author Kim Dinh
 */

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes = new HashMap<String, Integer>();
    private String school;
    private int numUpdates;

    /**
     * Creates an ArrayList of observers, HashMap representing the votes each 
     * candidate has, and sets String for school
     * @param school
     */
    public StudentGovPoll(String school) {
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        this.school = school;
    }

    /**
     * Registers an observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer 
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers if poll has changed 
     */
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(votes);
        }
    }

    /**
     * Adds a key (String president) to votes HashMap then notifies observers
     * @param president
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
        notifyObservers();
    }

    /**
     * Adds new votes to the previous number of votes for the candidate which 
     * is inputted as the new value; observers are notified of this change
     * @param president
     * @param num
     */
    public void enterVotes(String president, int num) {
        if(votes.containsKey(president)) {
            numUpdates = votes.get(president) + num;
            votes.put(president, numUpdates);
            notifyObservers();
        }
    }

    /**
     * Returns a String representing the school
     * @return school
     */
    public String getSchool() {
        return this.school;
    }
}
