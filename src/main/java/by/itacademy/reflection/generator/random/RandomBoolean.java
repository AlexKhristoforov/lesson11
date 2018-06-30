package by.itacademy.reflection.generator.random;

import java.util.Random;

public class RandomBoolean implements RandomValues {
    private Random random = new Random();

    @Override
    public Boolean execute() {
        return random.nextBoolean();
    }
}
