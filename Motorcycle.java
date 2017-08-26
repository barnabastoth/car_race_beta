import java.util.Random;

public class Motorcycle {
    int speed = 100;
    String name;
    int distance;

    public void travelOneHour() {
        Random random = new Random();
        int chanceOfRain = random.nextInt(100 - 0 + 1) + 0;
        if (chanceOfRain <= 30) {
            int tempSpeed = speed - (random.nextInt(50 - 5 + 1) + 5);
            distance = distance + tempSpeed;
        }
        distance = distance + speed;

    }



}
