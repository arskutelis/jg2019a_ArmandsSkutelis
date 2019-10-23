package lv.jg.lesson4;

public class StockTest {
    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 150);

        System.out.println("Closing status:");
        System.out.println(ibm.printInformation());
        ibm.updPrice = 150.37;
        System.out.println("Morning status:");
        ibm.updatePrice();
        ibm.updPrice = 149.82;
        System.out.println("Day status:");
        ibm.updatePrice();
        ibm.updPrice = 150.12;
        System.out.println("Evening status:");
        ibm.updatePrice();
        System.out.println("......................");

        Stock aapl = new Stock("Apple", 200);

        System.out.println("Closing status:");
        System.out.println(aapl.printInformation());
        aapl.updPrice = 230.12;
        System.out.println("Morning status:");
        aapl.updatePrice();
        aapl.updPrice = 235.18;
        System.out.println("Day status:");
        aapl.updatePrice();
        aapl.updPrice = 220.12;
        System.out.println("Evening status:");
        aapl.updatePrice();
    }
}
