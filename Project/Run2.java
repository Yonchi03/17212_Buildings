package Project;

public class Run2 {

    public static void main(String[] args) {

        long before0 = Runtime.getRuntime().freeMemory();
        long startTime2 = System.nanoTime();

        for (int i = 0; i < 10; i++) {
            new House(RandomNumbers.getRandomDouble(200, 700), "Location",
                    RandomNumbers.getRandomInteger(1, 10), "\"The owner's name\"", true);
        }

        for (House i : House.getHouseLinkedList()) i.fancyPrint();
        House.printMostSpaciousLL();

        long endTime2 = System.nanoTime();
        long used0 = before0 - Runtime.getRuntime().freeMemory();

        long duration2 = (endTime2 - startTime2);

        System.out.printf("""
                            LinkedList Duration: %s
                            LinkedList Memory  : %s
                            """,
                RandomNumbers.customFormat(duration2).replace(',', ' '),
                RandomNumbers.customFormat(used0).replace(',', ' '));

            System.gc();
        }
}
