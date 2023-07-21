package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound);
    }
}

