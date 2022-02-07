package factory;
import java.util.ArrayList;

/** 
 * An Abstract Car 
 * @author Kim Dinh
*/
public abstract class Car {
    private String make;
    private String model;
    protected ArrayList<Accessory> accessories = new ArrayList<Accessory>();

    /**
     * Creates a car with the indicated make and model and consisting of
     * an ArrayList of accessories from the enum class Accessory 
     * @param make
     * @param model
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        accessories = new ArrayList<Accessory>();
    }

    /**
     * Creates the car by calling other methods that create individual
     * parts of the car
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Abstract class that adds a frame depending on type of car
     */
    protected abstract void addFrame();

    /**
     * Adds wheels to the car
     */
    protected void addWheels() {
        System.out.println("Adding the wheels");
    }

    /**
     * Adds engine to the car
     */
    protected void addEngine() {
        System.out.println("Adding a standard engine");
    }

    /**
     * Adds windows to car
     */
    protected void addWindows() {
        System.out.println("Adding windows");
    }

    /**
     * Abstract class that adds accessories to the ArrayList of 
     * accessories depending on the type of car
     */
    protected abstract void addAccessories();

    /**
     * Prints the list of accessories
     */
    protected void displayAccessories() {
        System.out.println("Accessories: ");
        for (Accessory accessory: accessories) 
            System.out.println("-" + accessory);
    }
}
