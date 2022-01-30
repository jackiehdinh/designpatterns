package decorator;
import java.util.Random;

/**
 * Takes password and randomly inserts special characters 
 * then returns the new password
 * @author Kim Dinh
 */
public class SpecialChars extends PasswordDecorator {
    /**
     * Constructs passwordBeginning
     * @param passwordBeginning
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Has a 30% chance of inserting a special character into the password
     * then returns the new password 
     * @return password
     */
    public String getPassword() {
        String password = this.passwordBeginning.getPassword();
        Random random = new Random();
        String specialChar = "*!%+.{}";
        char[] passwordArray = password.toCharArray();
        for (int i = 0; i < passwordArray.length; i++) {
            int randNum = random.nextInt(10);
            if (randNum < 3) {
                int rand_char = random.nextInt(6);
                password = password.substring(0, i) + specialChar.charAt(rand_char) + password.substring(i);
            }
        }
        return password;
    }
}
