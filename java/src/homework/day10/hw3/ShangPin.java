package homework.day10.hw3;

public class ShangPin {
    private String id;
    private String name;
    private double price;
    private String unit;

    public ShangPin() {
    }

    public ShangPin(String id, String name, double price, String unit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
