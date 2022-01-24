package observer;

import java.util.HashMap;
    
/** . 
 * An observer interface that forces all observers to update 
 * @author Kim Dinh
 */
public interface Observer {

    /**
     * Method that provides the observer with the updated information  
     * @param votes
     */
    public void update(HashMap<String, Integer> votes);
}
