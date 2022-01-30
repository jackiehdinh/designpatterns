package decorator;

/**
 * Abstract Class that inherits from Password and allows children 
 * to inherit from password
 * @author Kim Dinh
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;
    
    /**
     * Constructs the password 
     * @param passwordBeginning
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }
    
    /**
     * Abstract method that returns the password
     * @return password
     */
    public abstract String getPassword();
}
