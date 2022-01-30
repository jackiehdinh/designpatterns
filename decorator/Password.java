package decorator;

/**
 * Abstract Class that gives the children String password and forces 
 * them to return password 
 * @author Kim Dinh
 */
public abstract class Password {
   protected String password;

   /**
    * Abstract Method that forces children to return password
    * @return password
    */
   public abstract String getPassword();
}
