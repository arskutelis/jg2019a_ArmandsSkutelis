package lv.jg.lesson11;

public class Product {

    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    static Product butter = new Product("Butter", 2.20, "Food");
    static Product milk = new Product("Milk", 1.20, "Food");
    static Product pineDream = new Product("Pineapple Dream", 1.00, "Drink");
    static Product bread = new Product("Bread", 0.70, "Food");
    static Product tylenol = new Product("Tylenol", 3.10, "Medicine");
    static Product coke = new Product("Coca-cola", 1.70, "Drink");
    static Product sprite = new Product("Sprite", 1.65, "Drink");
    static Product dosia = new Product("Dosia", 1.95, "Household");
    static Product pandabear = new Product("Pandabear", 15.20, "Toy");

    @Override
    public String toString() {
        return "Product name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category;
    }
}
