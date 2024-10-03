public class DieGame {
	public static void main(String[] args){
		Die d6 = new Die(6);
		Die d100 = new Die (100);
		System.out.println("Terning 6: " + d6.throwdie());
		System.out.println("Terning 100: " + d100.throwdie());
	}
}