package Project;

public class Run2 {

    //     Hey!!!

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new House(RandomNumbers.getRandomFloat(200, 700), "Location",
                    RandomNumbers.getRandomInteger(1, 10), "\"The owner's name\"");
        }

        for (House i : House.getHouseList()) i.fancyPrint();
        House.printMostSpacious();

        System.gc();
    }
}

class RandomNumbers {

    public static float getRandomFloat(float min, float max) {
        return (float) ((Math.random() * ((max - min) + 1)) + min);
    }

    public static int getRandomInteger(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

}
