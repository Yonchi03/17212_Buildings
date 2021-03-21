package Project;

import java.text.DecimalFormat;

public class RandomNumbers {

    public static float getRandomDouble(float min, float max) {
        return (float) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static int getRandomInteger(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static String customFormat(long value) {
        DecimalFormat myFormatter = new DecimalFormat("###,###");
        return myFormatter.format(value);
    }
}