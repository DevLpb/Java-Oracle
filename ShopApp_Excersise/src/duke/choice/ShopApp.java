/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author pc
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop!");

        System.out.println("Min. Price: " + Clothing.MIN_PRICE);
        Customer c1 = new Customer("Pinky", 3);

//        c1.setName("Pinky");
//        c1.setSize("S");

        System.out.println("Customer is " + c1.getName());

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");

        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

//        item1.setDescription();
//        item1.setPrice();
//        item1.setSize();

//        item2.setDescription();
//        item2.setPrice();
//        item2.setSize();

//        items[2].setDescription();
//        items[2].setPrice();
//        items[2].setSize();
//
//        items[3].setDescription();
//        items[3].setPrice();
//        items[3].setSize();

//        System.out.println(item1.description + ", " + item1.price + ", " + item1.size);
//        System.out.println(item2.description + ", " + item2.price + ", " + item2.size);
//        total = ((item2.price * 2) + item1.price) * (1 + tax);
        int measurement = 3;

        c1.addItems(items);

//        c1.setSize(measurement);

        System.out.println("Customer's size: " + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {

            System.out.println("Items: " + item.getDescription());
        }

        System.out.println("Total: " + total);

    }

}
