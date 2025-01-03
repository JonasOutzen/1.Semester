import java.time.LocalDate;
import java.util.ArrayList;

public class Food extends Product {
    private String expireDate;

    public Food(String name, int price, String expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    public static ArrayList<Food> foodList = new ArrayList<>();
    //Food objects
    static Food milk = new Food("Milk", 10, "2025-03-12");
    static Food cheese = new Food("Cheese", 20, "2025-03-13");
    static Food energydrink = new Food("Energydrink", 30, "2027-03-14");

    static{
        foodList.add(milk);
        foodList.add(cheese);
        foodList.add(energydrink);
    }
    public String toString() {
        return "\n"+ "Product Name: " + name + " " + "Price: " + price + "Kr,- " + "Expiredate: " + expireDate;
    }
}
