package lv.jg.lesson11;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class ShoppingList extends Product {
    public ShoppingList(String name, double price, String category) {
        super(name, price, category);
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Product> shoppingList = new ArrayList();
        shoppingList.add(milk);
        shoppingList.add(pineDream);
        shoppingList.add(bread);
        shoppingList.add(tylenol);
        shoppingList.add(butter);
        shoppingList.add(coke);
        shoppingList.add(sprite);
        shoppingList.add(dosia);
        shoppingList.add(pandabear);

        shoppingList.removeIf(n -> (n.getName() == "Bread"));
        shoppingList.removeIf(n -> (n.getName() == "Dosia"));

        printList(shoppingList);
        System.out.println("..................");
        findOnlyDrinks(shoppingList);
        System.out.println("..................");
        listPriceRange(shoppingList);
        System.out.println("..................");
        printArrayListToFile(shoppingList, "D:\\javaguruarray.txt");
        System.out.println("..................");
        getArrayListFromFile(shoppingList, "D:\\products.txt");
        printList(shoppingList);
        System.out.println("..................");
        printArrayListToFile(shoppingList, "D:\\javaguruarrayfinal.txt");


    }

    private static void findOnlyDrinks(ArrayList<Product> list) {
        for (Product product : list) {
            if (product.getCategory().equals("Drink")) {
                System.out.println("Drink is: " + product);
            }
        }
    }

    private static void listPriceRange(ArrayList<Product> price) {
        for (Product product : price) {
            if (product.getPrice() > 1.50 && product.getPrice() < 3) {
                System.out.println("List of products priced 1.5 to 3: " + product);
            }
        }
    }

    private static void printList(ArrayList<Product> shoppingList) {
        System.out.println("Shopping list: ");
        System.out.println("........................");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
    }

    public static void printArrayListToFile(ArrayList<Product> arrayList, String outputfile) throws IOException {
        PrintWriter writer = new PrintWriter(outputfile);
        for (Product product : arrayList) {
            writer.println("PRODUCT: " + product);
        }
        writer.close();
        System.out.println("Array products printed to txt file");
    }

    public static void getArrayListFromFile(ArrayList<Product> arrayList, String inputfile) throws FileNotFoundException {
        File file = new File(inputfile);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] prodcts = scanner.nextLine().split(" ");
            arrayList.add(new Product(prodcts[2], Double.parseDouble(prodcts[1]), prodcts[0]));
        }
        System.out.println("Here is a list with additional products added from txt file: ");
    }
}
