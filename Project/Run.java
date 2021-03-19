package Project;

public class Run {

    public static void main(String[] args) {

        //Creating house objects
        House House1 = new House(250.6f, "Location 1", 3, "\"The owner's name\"");
        House House2 = new House(410.2f, "Location 2", 5, "\"The owner's name\"");
        House House3 = new House(350.5f, "Location 3", 3, "\"The owner's name\"");
        House House4 = new House(380.0f, "Location 4", 4, "\"The owner's name\"");

        //Printing all houses
        for (House i : House.getHouseList()) i.fancyPrint();

        //Printing the most spacious house
        House.printMostSpacious();
    }
}