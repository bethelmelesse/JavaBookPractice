import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.print("What is your age? ");
        int age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);



    }
}
