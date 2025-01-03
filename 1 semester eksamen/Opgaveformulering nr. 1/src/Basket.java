import java.util.ArrayList;
import java.io.*;

public class Basket {
    private TextUI ui;

    public static ArrayList<Product> productArrayList = new ArrayList<>();


    public Basket() {
        this.ui = new TextUI();
    }

    //Metoder der til de forskellige produkter - tilføjer dem til basket
    //Der er til hver lavet en toString der fjerner [] og ,
    public void askForFoodNumber() {
        int foodsToAdd = ui.promptNumeric("Pick a number for your fooditem:" + "\n " + Food.foodList.toString().replace(",", "").replace("[", "").replace("]", "") + "\n");
        if (foodsToAdd >= 1 && foodsToAdd <= Food.foodList.size()) {
            switch (foodsToAdd) {
                case 1:
                    addProduct(Food.milk);
                    System.out.println("Milk has been added");
                    runOptions();
                    break;
                case 2:
                    addProduct(Food.cheese);
                    System.out.println("Cheese has been added");
                    runOptions();
                    break;
                case 3:
                    addProduct(Food.energydrink);
                    System.out.println("Energy Drink has been added");
                    runOptions();
                    break;
            }
        } else {
            System.out.println("Please enter a valid number");
            askForFoodNumber();
        }
    }

    public void askForElectronicsNumber() {
        int electronicsToAdd = ui.promptNumeric("Pick a number for your electronic item:" + "\n " + Electronics.electronicsList.toString().replace(",", "").replace("[", "").replace("]", "").trim() + "\n");
        if (electronicsToAdd >= 1 && electronicsToAdd <= Electronics.electronicsList.size()) {
            switch (electronicsToAdd) {
                case 1:
                    addProduct(Electronics.mouse);
                    System.out.println("Mouse has been added");
                    runOptions();
                    break;
                case 2:
                    addProduct(Electronics.keyboard);
                    System.out.println("Keyboard has been added");
                    runOptions();
                    break;
                case 3:
                    addProduct(Electronics.headset);
                    System.out.println("Headset has been added");
                    runOptions();
                    break;
            }
        } else {
            System.out.println("Please enter a valid number");
            askForElectronicsNumber();
        }
    }

    public void askForClothesNumber() {
        int clothesToAdd = ui.promptNumeric("Pick a number for your clothingitem:" + "\n " + Clothes.clothesList.toString().replace(",", "").replace("[", "").replace("]", "").trim() + "\n");
        if (clothesToAdd >= 1 && clothesToAdd <= Clothes.clothesList.size()) {
            switch (clothesToAdd) {
                case 1:
                    addProduct(Clothes.blazer);
                    System.out.println("Blazer has been added");
                    runOptions();
                    break;
                case 2:
                    addProduct(Clothes.sweatpants);
                    System.out.println("Sweat Pants has been added");
                    runOptions();
                    break;
                case 3:
                    addProduct(Clothes.jeans);
                    System.out.println("Jeans has been added");
                    runOptions();
                    break;
            }
        } else {
            System.out.println("Please enter a valid number");
            askForClothesNumber();
        }
    }

    public void runOptions() {
        int option = ui.promptNumeric("Choose your next option with a number:" + "\n" + "1: Shop Food" + "\n" + "2: Shop Electronics" + "\n" + "3: Shop Clothes" + "\n" + "4: Show Basket Contents");
        if (option >= 1 && option <= 4) {
            switch (option) {
                case 1:
                    System.out.println("You're now shopping for food:");
                    askForFoodNumber();
                    break;
                case 2:
                    System.out.println("You're now shopping for electronics:");
                    askForElectronicsNumber();
                    break;
                case 3:
                    System.out.println("You're now shopping for Clothes:");
                    askForClothesNumber();
                    break;
                case 4:
                    System.out.println("Here's your basket:");
                    printAll();
            }
        } else {
            System.out.println("Please enter a valid number");
            runOptions();
        }
    }

    //Metode der tilføjer produkterne til min liste
    public void addProduct(Product product) {
        productArrayList.add(product);
    }

    public void runPrintSumOfPrices() {
        int sum = 0;
        for (int i = 0; i < productArrayList.size(); i++) {
            sum += productArrayList.get(i).getPrice();
        }
        System.out.println("\n" + "--------------------------" + "\n" + "Price of all items: " + sum + "kr.-");
    }

    //Printer hele listen
    public void printAll() {
        System.out.println("-----------Basket---contents-----------" + "\n");
        if (productArrayList.isEmpty()) {
            System.out.println("There are no products in your basket");
        } else {
            ArrayList<Product> foodItems = new ArrayList<>();
            ArrayList<Product> electronicsItems = new ArrayList<>();
            ArrayList<Product> clothesItems = new ArrayList<>();

            for (Product product : productArrayList) {
                if (product instanceof Food) {
                    foodItems.add(product);
                } else if (product instanceof Electronics) {
                    electronicsItems.add(product);
                } else if (product instanceof Clothes) {
                    clothesItems.add(product);
                }
            }
            if (!foodItems.isEmpty()) {
                System.out.println("\n" + "---Food items---");
                for (Product product : foodItems) {
                    System.out.println(product);
                }
            }
            if (!electronicsItems.isEmpty()) {
                System.out.println("\n" + "---Electronic items---");
                for (Product product : electronicsItems) {
                    System.out.println(product);
                }
            }
            if (!clothesItems.isEmpty()) {
                System.out.println("\n" + "---Clothes items---");
                for (Product product : clothesItems) {
                    System.out.println(product);
                }
            }
        }
    }
}
