public class DateUsEu {
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, String month, int date, int year){
        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args){
        printAmerican("Saturday", "July", 22, 2015);
        printEuropean("Saturday", "July", 22, 2015);
    }
}
