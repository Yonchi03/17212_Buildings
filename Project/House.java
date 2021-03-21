package Project;

import java.text.NumberFormat;
import java.util.LinkedList;

class House extends Building {

    private final int numFloors;
    private final String ownerName;
    private static final LinkedList<House> houseList = new LinkedList<>();

    protected House(float area, String address, int numFloors, String ownerName) {
        super(area, address);
        this.numFloors = numFloors;
        this.ownerName = ownerName;
        houseList.add(this);
    }

    protected static LinkedList<House> getHouseList() {
        return houseList;
    }

    private static House mostSpacious(){
        House max = houseList.getFirst();

        for (House i : houseList) {
            if (i.getArea() / i.numFloors > max.getArea() / max.numFloors) max = i;
        }
        return max;
    }

    protected void fancyPrint(){
        System.out.printf("---------------------------------------------------%n");
        System.out.print(this);
        System.out.printf("---------------------------------------------------%n%n");
    }

    protected static void printMostSpacious(){
        System.out.println("НАЙ-ПРОСТОРНАТА КЪЩА Е:");
        mostSpacious().fancyPrint();
    }

    @Override
    public String toString() {
        return  String.format("""
                Address : %s
                Owner   : %s
                Floors  : %d
                Area    : %s
                """,
                this.getAddress(), this.ownerName, this.numFloors,
                NumberFormat.getInstance().format(this.getArea()));
    }

}