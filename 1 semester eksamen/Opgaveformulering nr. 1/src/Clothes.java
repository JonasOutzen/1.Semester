import java.util.ArrayList;

public class Clothes extends Product {

    String size;
    String color;

    public Clothes(String name, int price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public static ArrayList<Clothes> clothesList = new ArrayList<>();
    //Food objects
    static Clothes blazer = new Clothes("Blazer", 100, "Large", "Blue");
    static Clothes sweatpants = new Clothes ("Sweat Pants", 200,"Medium", "Grey");
    static Clothes jeans = new Clothes("Jeans", 300, "Small", "Blue");

    static {
        clothesList.add(blazer);
        clothesList.add(sweatpants);
        clothesList.add(jeans);
    }
    public String toString() {
        return "\n" + "Product Name: " + name + " " + "Price: " + price + "Kr,- " + "Size: " + size + " " + "Color: " + color;
    }
}


