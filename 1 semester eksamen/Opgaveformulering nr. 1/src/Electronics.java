import java.util.ArrayList;

public class Electronics extends Product {
    private String warrantyDate;

    public Electronics(String name, int price, String warrantyDate) {
        super(name, price);
        this.warrantyDate = warrantyDate;
    }

    public static ArrayList<Electronics> electronicsList = new ArrayList<>();

    //Electronics objects
    static Electronics mouse = new Electronics("Mouse", 500, "24 months");
    static Electronics keyboard = new Electronics("Keyboard", 1000, "12 months");
    static Electronics headset = new Electronics("Headset", 800, "36 months");

    static {
        electronicsList.add(mouse);
        electronicsList.add(keyboard);
        electronicsList.add(headset);
    }
    public String toString() {
        return "\n"+"Product Name: " + name + " " + "Price: " + price + "Kr,- " + "Warranty: " + warrantyDate;

    }
  }
