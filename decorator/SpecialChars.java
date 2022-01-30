package decorator;

import java.util.Random;

public class SpecialChars extends PasswordDecorator {
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

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
