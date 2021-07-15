import java.util.Scanner;

public class ConvertCmtoInch {
    public static void main(String[] args) {
        int inch; // declare the variables
        double cm;
        Scanner in = new Scanner(System.in); //Create scanner
        System.out.print("How many inches? ");
        inch = in.nextInt(); // nextInt reads input from the keyboard and converts it to an integer

        //how many cm there are per inch
        final double CM_PER_INCH = 2.54;
        cm = inch * CM_PER_INCH;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        System.out.printf("%d in = %f cm\n", inch, cm);

    }
}
