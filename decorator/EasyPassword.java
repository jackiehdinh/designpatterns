package decorator;
import java.util.Random;

/**
 * Inherits Password Abstract Class and returns a password with all the spaces deleted 
 * and a random number 1-100 added to the end of the password
 * @author Kim Dinh
 */
public class EasyPassword extends Password {
    /**
     * Constructs the password by making the input the password
     * @param phrase
     */
    public EasyPassword(String phrase) {
        this.password = phrase;
    }

    /**
     * Deletes all the spaces and adds a random number 0-100 to the end of the 
     * new password, which is returned to the user
     * @return password
     */
    public String getPassword() {
        password = password.replaceAll(" ", "");
        Random random = new Random();
        int ranNum = random.nextInt(101);
        String rand_num = Integer.toString(ranNum);
        password = password + rand_num;
        return password;
    }
}
