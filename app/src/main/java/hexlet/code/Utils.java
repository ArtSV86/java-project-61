package hexlet.code;

import java.util.Random;

public class Utils {
    public static int generateRandomNumber(int upperBound) {
        Random random = new Random();
        int result = random.nextInt(upperBound);

        if (result != 0) {
            return result;
        } else {
            result = random.nextInt(upperBound);
        }
        return result;
    }
}
