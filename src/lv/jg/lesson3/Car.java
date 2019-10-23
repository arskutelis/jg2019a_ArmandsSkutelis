package lv.jg.lesson3;

//Ok
public class Car {
    private String color;
    private String manufacturer;
    private int year;

    //tā kā geteri nav izmantoti, tad tos vajag dzēst
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //neizmantotos geterus dzēšam
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    //neizmantotos geterus dzēšam
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //metode slikts nosaukums, labāk to būtu nosaukt "printMe"
    public void carMethod() {
        System.out.print("The car's color is " + color + ". ");
        System.out.print("The manufacturer of the car is " + manufacturer + ". ");
        System.out.println("The year when the car was manufactured was " + year + ".");
    }
}
