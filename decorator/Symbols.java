package decorator;

/**
 * Takes password and replaces certain letters with their matching symbol
 * @author Kim Dinh
 */
public class Symbols extends PasswordDecorator {
    /**
     * Constructs passwordBeginning
     * @param passwordBeginning
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Replaces letters with their matching special characters 
     * then returns the new password
     * @return password
     */
    public String getPassword() {
        String password = this.passwordBeginning.getPassword();
        password = password.replaceAll("a", "@");
        password = password.replaceAll("b", "8");
        password = password.replaceAll("e", "3");
        password = password.replaceAll("g", "9");
        password = password.replaceAll("i", "!");
        password = password.replaceAll("o", "0");
        password = password.replaceAll("s", "$");
        password = password.replaceAll("t", "7");
        return password;
    }
}
