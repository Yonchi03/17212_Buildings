package Project;

abstract class Building {

    private final float area;
    private final String address;

    protected Building(float area, String address) {
        this.area = area;
        this.address = address;
    }

    public float getArea() { return area; }
    public String getAddress() { return address; }
}