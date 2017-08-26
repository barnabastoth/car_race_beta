import java.util.Random;

public class Truck {
    int speed = 100;
    int breakdownTurnsLeft = 0;
    int distance = 0;
    int name;

    public void travelOneHour() {
        if (breakdownTurnsLeft == 0) {
            distance = distance + speed;
            Random random = new Random();
            int breakDownChance = random.nextInt(100 - 0 + 1) + 0;
            if (breakDownChance < 5) {
                breakdownTurnsLeft = 2;
            }
        } else {
            breakdownTurnsLeft = breakdownTurnsLeft - 1;
        }
    }
}
