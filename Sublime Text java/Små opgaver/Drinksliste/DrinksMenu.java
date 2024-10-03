import java.util.Scanner;
import java.util.ArrayList;

public class DrinksMenu {

	public static void main (String[] args){
		System.out.println("Hej, hvad er din alder?");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		ArrayList<String> drinks = new ArrayList<>();
			drinks.add("Milk");
			drinks.add("Water");
			drinks.add("Hot COCO");
		if(age >= 18) {
			drinks.add("Mojito");
			drinks.add("Pina Colada");
			drinks.add("Gin Hass");
		}
		System.out.println("Vi har følgende drikkevare: "	);
		for(int i = 0; i < drinks.size(); i++) {
			System.out.println((i+1) + ": " + drinks.get(i));
		} 
		System.out.println("Hvor mange drinks ønsker du?");
		int noOfDrinks = scanner.nextInt();
		int[] chosenDrinks = new int[noOfDrinks];
		for(int i = 0; i < chosenDrinks.length; i++){
			System.out.println("Vær sød at vælge en drink din spasser - tryk drinknummer");
			chosenDrinks[i] = scanner.nextInt();
		}		
		System.out.println("Tak for din ordre din spasser. Du er nu klar til at blive patte!");
		for(int i = 0; i < chosenDrinks.length; i++){
			System.out.println(drinks.get(chosenDrinks[i])-1);
		}
	}
}