public class PrintTime {
    public static void printTime(int hour, int minute){
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
    }

    public static void main(String[] args){
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
        System.out.println();

        printTime(hour + 1, 0);
    }
}
