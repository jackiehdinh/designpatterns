package decorator;

public class Symbols extends PasswordDecorator {
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

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
