package seminar_03_dz;

public abstract class Car {
    String brand;
    String model;
    String color;
    String body;
    int wheelsNumber;
    String fuel;
    String transmission;
    double engineCapacity;

    public Car(String brand, String model, String color, String body, int wheelsNumber,
               String fuel, String transmission, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.body = body;
        this.wheelsNumber = wheelsNumber;
        this.fuel = fuel;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;
    }

    public abstract void movement();

    public abstract void service();

    public abstract void gearShifting();

    public abstract void turningOnWiper();
}
