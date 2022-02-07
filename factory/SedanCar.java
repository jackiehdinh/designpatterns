package factory;
import java.util.ArrayList;

/**
 * A sedan car
 * @author Kim Dinh
 */
public class SedanCar extends Car {
    /**
     * Creates a sedan car with the indicated make and model
     * @param make
     * @param model
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a three-part frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    /**
     * Adds floor matts, extra cup holders, a phone charger, a 
     * back up camera, and heated seats to the car
     */
    protected void addAccessories() {
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.PHONE_CHARGER);
        accessories.add(Accessory.BACK_UP_CAMERA);
        accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(Accessory.HEATED_SEATS);
    }
}
