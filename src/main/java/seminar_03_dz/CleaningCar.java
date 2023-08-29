package seminar_03_dz;

public class CleaningCar extends Car implements ISweepingStreet{


    public CleaningCar(String brand, String model, String color,
                       String body, int wheelsNumber, String fuel, String transmission, double engineCapacity) {
        super(brand, model, color, body, wheelsNumber, fuel, transmission, engineCapacity);
    }

    @Override
    public void movement() {

    }

    @Override
    public void service() {

    }

    @Override
    public void gearShifting() {

    }

    @Override
    public void turningOnWiper() {

    }

    @Override
    public void sweepingStreet() {

    }
}
