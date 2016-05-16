
public class Main {
	public static void main(String[] args) {
		PRNG pseudoRandom = new PRNG(1337);
		
		for (int i = 0; i < 50; ++i) {
			System.out.println(pseudoRandom.getNextInt());
		}	
	}
}
