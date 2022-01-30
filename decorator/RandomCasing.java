package decorator;

import java.util.Random;

public class RandomCasing extends PasswordDecorator {
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

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
