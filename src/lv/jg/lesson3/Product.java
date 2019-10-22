package lv.jg.lesson3;

//Ok
public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    //neizmantotos geterus dzēšam
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //neizmantotos geterus dzēšam
    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    //neizmantotos geterus dzēšam
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    double calculateActualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }

    public String printInformation() {
        return "Product : name = " + name + ", regular price = " + regularPrice + " EUR, discount = " + discount
                + "%, actual price = " + calculateActualPrice() + " EUR";
    }
}
