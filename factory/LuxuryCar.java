package factory;
import java.util.ArrayList;
 
/**
 * A luxury car
 * @author Kim Dinh
 */
public class LuxuryCar extends Car {
    
    /**
     * Creates a luxury car with the indicated make and model
     * @param make
     * @param model
     */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    /**
     * Adds a beautiful frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Adds a supped up engine to the car
     */
    @Override
    protected void addEngine() {
        System.out.println("Adding a supped up engine");
    }

    /**
     * Adds the following accessories to the car: back up camera,
     * blue tooth, extra cup holders, floor matts, heated seats,
     * high end sound, phone charger, sports seats, trunk 
     * organizer, and window tint
     */
    protected void addAccessories() {
        accessories.add(Accessory.BACK_UP_CAMERA);
        accessories.add(Accessory.BLUE_TOOTH);
        accessories.add(Accessory.EXTRA_CUP_HOLDERS);
        accessories.add(Accessory.FLOOR_MATTS);
        accessories.add(Accessory.HEATED_SEATS);
        accessories.add(Accessory.HIGH_END_SOUND);
        accessories.add(Accessory.PHONE_CHARGER);
        accessories.add(Accessory.SPORTS_SEATS);
        accessories.add(Accessory.TRUNK_ORGANIZER);
        accessories.add(Accessory.WINDOW_TINT);
    }
}
