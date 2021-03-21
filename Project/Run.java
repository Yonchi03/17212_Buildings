package Project;

public class Run {

    public static void main(String[] args) {

        long before = Runtime.getRuntime().freeMemory();
        long startTime1 = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            new House(RandomNumbers.getRandomDouble(200, 700), "Location",
                    RandomNumbers.getRandomInteger(1, 10), "\"The owner's name\"", false);
        }

        for (House i : House.getHouseArrayList()) i.fancyPrint();
        House.printMostSpaciousAL();

        long endTime1 = System.nanoTime();
        long used = before - Runtime.getRuntime().freeMemory();

        long duration1 = (endTime1 - startTime1);

        System.out.printf("""
                        ArrayList  Duration: %s
                        ArrayList  Memory  : %s
                        """,
                RandomNumbers.customFormat(duration1).replace(',', ' '),
                RandomNumbers.customFormat(used).replace(',', ' '));

        System.gc();
    }
}
