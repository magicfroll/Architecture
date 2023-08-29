package seminar_03_dz;

public class PassengerCar extends Car implements ICarTurningLights {

    public PassengerCar(String brand, String model, String color, String body,
                        int wheelsNumber, String fuel, String transmission, double engineCapacity) {
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


}
