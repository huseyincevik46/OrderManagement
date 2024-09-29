package util;

import java.util.Random;

public class RandomGenerator {
    private static final Random random = new Random();

    public static int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }
}