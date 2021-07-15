public class Date {
    public static void main(String[] args){

        String day = "Wednesday";
        int date = 14;
        String month = "July";
        int year = 2021;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println(day + ", " + month + " " + date + ", " + year);

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);


    }
}
