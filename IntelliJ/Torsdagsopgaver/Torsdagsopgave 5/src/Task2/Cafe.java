package Task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public void loadMenuData() {
        File file = new File("coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File not found, try different pathname");
        }
    }

    public ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
