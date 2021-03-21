package Project;

public class Run2 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new House(RandomNumbers.getRandomDouble(200, 700), "Location",
                    RandomNumbers.getRandomInteger(1, 10), "\"The owner's name\"");
        }

        for (House i : House.getHouseList()) i.fancyPrint();
        House.printMostSpacious();

        System.gc();
    }
}