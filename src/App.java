import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        // By adding 1 to the random number, we can get a random
        // number between 1 and 6
        int x = random.nextInt(6) + 1;
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);

    }
}
