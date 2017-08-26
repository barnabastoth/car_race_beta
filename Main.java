import java.util.Random;

public class Main {
    static Car[] cars = new Car[11];
    static Motorcycle[] motorcycles = new Motorcycle[11];
    static Truck[] trucks = new Truck[11];

    public static void main(String[] args) {
        System.out.println("This is the Car Race Simulator Beta");
        createVehicles();
        simulateRace();
        printRaceResults();
    }


    public static void createVehicles() {
        for (int i = 0; i < 10 ; i++) {
            cars[i] = new Car();
            String carName = cars[i].generateRandomName() + " " + cars[i].generateRandomName();
            cars[i].name = carName;
        }

        for (int i = 0; i < 10; i++) {
            motorcycles[i] = new Motorcycle();
            String motorcycleName = String.format("Motorcycle %d", i);
            motorcycles[i].name = motorcycleName;
        }

        for (int i = 0; i < 10 ; i++) {
            trucks[i] = new Truck();
            Random random = new Random();
            int truckName = random.nextInt(1000 - 0 + 0) + 0;
            trucks[i].name = truckName;
        }
    }

    public static void simulateRace() {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 10; j++) {
                cars[j].travelOneHour();
                motorcycles[j].travelOneHour();
                trucks[j].travelOneHour();
            }
        }
    }


    public static void printRaceResults() {
        for (int i = 0; i < 10; i++) {
            System.out.print("Car name: ");
            System.out.print(cars[i].name);
            System.out.print("||| distance traveled: ");
            System.out.print(cars[i].distance);
            System.out.println("");
        }

        for (int j = 0; j < 10; j++) {
            System.out.print("Motorcycle name: ");
            System.out.print(motorcycles[j].name);
            System.out.print("   |||   distance traveled: ");
            System.out.print(motorcycles[j].distance);
            System.out.println("");
        }

        for (int k = 0; k < 10; k++) {
            System.out.print("Truck name: ");
            System.out.print(trucks[k].name);
            System.out.print("||| distance traveled: ");
            System.out.print(trucks[k].distance);
            System.out.println("");
        }
    }

}
