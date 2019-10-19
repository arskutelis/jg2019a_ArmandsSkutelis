package lv.jg.lesson3;

public class Car {
    private String color;
    private String manufacturer;
    private int year;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void carMethod() {
        System.out.print("The car's color is " + color + ". ");
        System.out.print("The manufacturer of the car is " + manufacturer + ". ");
        System.out.println("The year when the car was manufactured was " + year + ".");
    }
}
