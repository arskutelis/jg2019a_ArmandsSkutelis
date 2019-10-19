package lv.jg.lesson3;

import static java.lang.System.out;

public class ProductTest {
    public static void main(String[] args) {
        Product productMilk = new Product();
        productMilk.setName("milk");
        productMilk.setRegularPrice(1);
        productMilk.setDiscount(15);

        Product productBread = new Product();
        productBread.setName("bread");
        productBread.setRegularPrice(1.20);
        productBread.setDiscount(20);

        out.println(productMilk.printInformation());
        out.println(productBread.printInformation());
    }
}