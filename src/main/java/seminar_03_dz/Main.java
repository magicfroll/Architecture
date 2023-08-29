package seminar_03_dz;

public class Main {
    public static void main(String[] args) {

        PassengerCar passengerCar = new PassengerCar("Audi",
                "A6", "Black", "Sedan", 4,
                "petrol", "automatic", 2.3);
        passengerCar.turningLights(Lights.Противотуманные);

        CleaningCar cleaningCar = new CleaningCar("Audi",
                "A6", "Black", "Sedan", 6,
                "petrol", "automatic", 3.0);
        cleaningCar.sweepingStreet();

        PassengerCar passengerCar3Wheels = new PassengerCar("Audi",
                "A6", "Black", "Sedan", 3,
                "petrol", "automatic", 2.3);





    }
}
