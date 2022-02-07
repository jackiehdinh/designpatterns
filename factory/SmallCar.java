package factory;
import java.util.ArrayList;

/**
 * A small car
 * @author Kim Dinh
 */
public class SmallCar extends Car {
    /**
     * Creates a small car with the indicated make and model
     * @param make
     * @param model
     */
    public SmallCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a small frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Adds floor matts and a phone charger to the car
     */
    protected void addAccessories() {
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.PHONE_CHARGER);
    }
}
