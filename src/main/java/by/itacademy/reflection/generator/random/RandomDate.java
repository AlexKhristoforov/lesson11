package by.itacademy.reflection.generator.random;

import java.util.Random;

public class RandomDate implements RandomValues {

    private Random random = new Random();

    @Override
    public Long execute() {
        return  random.nextLong();
    }
}
