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

        Customer c1 = new Customer();

        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("Customer is " + c1.name);

        Clothing item1 = new Clothing();

        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        items[2].description = "Green Scarf";
        items[2].price = 5;
        items[2].size = "S";
        
        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";
        
        

//        System.out.println(item1.description + ", " + item1.price + ", " + item1.size);
//        System.out.println(item2.description + ", " + item2.price + ", " + item2.size);
//        total = ((item2.price * 2) + item1.price) * (1 + tax);
        int measurement = 3;

        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        for (Clothing item : items) {
            if (c1.size.equals(item.size)) {
                total = total + item.price;
                System.out.println(item.description + ", " + item.price + ", " + item.size);
                if (total > 15) {
                    break;
                }
            }

        }

        System.out.println("Total: " + total);

    }

}
