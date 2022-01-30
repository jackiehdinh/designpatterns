package decorator;

import java.util.Random;

public class EasyPassword extends Password {
    public EasyPassword(String phrase) {
        this.password = phrase;
    }

    public String getPassword() {
        password = password.replaceAll(" ", "");
        Random random = new Random();
        int ranNum = random.nextInt(101);
        String rand_num = Integer.toString(ranNum);
        password = password + rand_num;
        return password;
    }
}
