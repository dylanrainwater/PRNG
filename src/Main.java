
public class Main {
    public static void main(String[] args) {
        int seed = 1337;
        
        PRNG pseudoRNG = new PRNG(seed);
        
        // Print 50 psuedo-random integers
        for (int i = 0; i < 50; ++i) {
            System.out.println(pseudoRNG.getNextInt());
        }   
    }
}
