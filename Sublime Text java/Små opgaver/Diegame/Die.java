import java.util.Random;

public class Die {

	int sides;

	public Die(int s){
		sides = s;
	}
	public int throwdie(){

	Random r = new Random();
	int result = r.nextInt(sides);
	return result+1;
	}
}