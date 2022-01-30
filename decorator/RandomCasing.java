package decorator;
import java.util.Random;

/**
 * Takes the password and randomly assigns each character 
 * uppercase and lowercase then returns the new password
 * @author Kim Dinh
 */
public class RandomCasing extends PasswordDecorator {
    /**
     * Constructs passwordBeginning 
     * @param passwordBeginning
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Uppercases and lowercases letters in password half the time
     * before returning the new password
     * @return password
     */
    public String getPassword() {
        String password = this.passwordBeginning.toString();
        Random random = new Random();
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int randChance = random.nextInt(2);
            if (randChance == 0)
                Character.toUpperCase(passwordArray[i]);
            else
                Character.toLowerCase(passwordArray[i]);
        }
        password = new String(passwordArray);
        return password;
    }
}
