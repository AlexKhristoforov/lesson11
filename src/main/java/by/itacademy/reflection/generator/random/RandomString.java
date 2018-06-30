package by.itacademy.reflection.generator.random;

import java.util.Random;

public class RandomString implements RandomValues {
    private Random random = new Random();
    private final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefhijkprstuvwx0123456789";
    private final int MAX_LENGTH = 25;
    private final int MIN_LENGTH = 3;

    @Override
    public String execute() {
        return randomString();
    }

    private String randomString() {
        String result = "";
        int length = random.nextInt(MAX_LENGTH) + MIN_LENGTH;
        for (int i = 0; i < length; i++) {
            result += String.valueOf(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return result;
    }
}
