package factory;

/**
 * Creates the car itself depending on the type, make, and model
 * @author Kim Dinh
 */
public class CarFactory {
    /**
     * Creates a Car based on the type of car then returns that Car
     * @param type
     * @param make
     * @param model
     * @return Car
     */
    public static Car createCar(String type, String make, String model) {
        Car car = new SmallCar(make, model); //default car type
        if (type.equalsIgnoreCase(CarType.SEDAN.toString()))
            car = new SedanCar(make, model);
        else if (type.equalsIgnoreCase(CarType.LUXURY.toString()))
            car = new LuxuryCar(make, model);
        System.out.println("Creating a " + make + " " + model);
        car.assemble();
        return car;
    }
}
