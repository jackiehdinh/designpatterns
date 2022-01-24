package observer;

/**
 * Keeps track of registered observers 
 * @author Kim Dinh
 */
public interface Subject {
    /**
     * Method to register observers 
     * @param observer
     */
    public void registerObserver(Observer observer);
     
    /**
     * Method that removes observers 
     * @param observer
     */
    public void removeObserver(Observer observer);
    
    /**
     * Method that notifies observers whenever there is a change in the data
     */
    public void notifyObservers();
}
