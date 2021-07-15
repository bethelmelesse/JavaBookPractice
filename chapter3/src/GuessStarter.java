import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        Scanner enter1 = new Scanner(System.in);
        System.out.print("I am thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?\n" +
                "Type a number: ");
        int enter = enter1.nextInt();
        System.out.println("Your guess is: " + enter);
        System.out.println("The number I was think of is: " + number);

        System.out.println("You were off by: " + (enter - number));

    }
}
