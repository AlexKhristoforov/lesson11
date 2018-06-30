package by.itacademy.reflection.generator.random;

import java.util.Random;

public class RandomInt implements RandomValues {

    private Random random = new Random();

    @Override
    public Integer execute() {
      return Math.abs(random.nextInt());
    }
}
