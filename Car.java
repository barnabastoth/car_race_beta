import java.util.*;

public class Car {

    Random speedRandomizer = new Random();
    int speed = speedRandomizer.nextInt(110 - 80 + 1) + 80;
    String name;
    int distance = 0;



    public void travelOneHour() {
        Random rainChance = new Random();
        int chanceOfRain = rainChance.nextInt(100 - 0 + 1) + 0;
        int tempSpeed = 0;
        if (chanceOfRain <= 30) {
            tempSpeed = 70;
        }
        distance = distance + tempSpeed;
    }

    public String generateRandomName() {
        ArrayList<String> carNames = new ArrayList<>();
        carNames.add("Vortex");
        carNames.add("Inception");
        carNames.add("Charm");
        carNames.add("Dominion");
        carNames.add("Eminance");
        carNames.add("Tradition");
        carNames.add("Reflect");
        carNames.add("Striker");
        carNames.add("Vindicator");
        carNames.add("Treasure");
        carNames.add("Vulture");
        carNames.add("Celestial");

        Random nameRandomizer = new Random();
        int indexOfName = nameRandomizer.nextInt(carNames.size() - 1 + 1) + 0;
        String chosenName = carNames.get(indexOfName);
        return chosenName;
    }
}
