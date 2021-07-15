import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args){
        Scanner cel = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = cel.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}
