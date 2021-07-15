import java.util.Scanner;

public class ConvertTime {

    final static int HR_TO_SEC = 3600;
    final static int MIN_TO_SEC = 60;

    public static void main(String[] args){
        Scanner sec = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = sec.nextInt();

        int hour = seconds / HR_TO_SEC;
        int second = seconds % HR_TO_SEC;

        int minute = second / MIN_TO_SEC;
        second = second % MIN_TO_SEC;

        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds\n", seconds, hour, minute, second);
    }
}
