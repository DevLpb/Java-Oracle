/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author pc
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    
    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;

    //Constructor
    
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        setSize(size);
    }
    
    //Getters and Setters
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
}
