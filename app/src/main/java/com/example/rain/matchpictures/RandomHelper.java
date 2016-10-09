package com.example.rain.matchpictures;

import java.util.Random;

/**
 * Created by rain on 2016/10/9.
 * A class to make random number
 */
public class RandomHelper {
    public RandomHelper() {
    }

    public int makeRandom(int a, int b) {
        Random random = new Random();
        return random.nextInt(b - a + 1) + a;
    }

}
