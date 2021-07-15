public class Time {
    final static int HR_TO_MIN = 60;
    final static int MIN_TO_SEC = 60;
    //final static int HR_TO_SEC = 3600;
    final static float PERCENT = 100;


    int hour;
    int minute;
    int second;
    int difference;
    float per;
    int elapsedTime;

    int hr3;
    int min3;
    int sec3;

    public Time(int hr, int min, int sec){
        hour = hr;
        minute = min;
        second = sec;
    }

    public int convert(){
        int hrToMin = hour * HR_TO_MIN;
        int totalMin = hrToMin + minute;
        int minToSec = totalMin * MIN_TO_SEC;
        int totalSec = minToSec + second;
        return totalSec;
    }
    public int remainingSec(Time midnight){
        //System.out.println("midnight to second: " + midnight.convert());
        difference = midnight.convert() - this.convert();
        return difference;
    }

    public float percentage(Time midnight){
        per = this.convert() * PERCENT / midnight.convert();
        return per;
    }

    public int elapsed(Time now){
        elapsedTime = this.convert() - now.convert();
        return elapsedTime;
    }

    public int convertBack(Time hrToSec, int givenSeconds){
        hr3 = givenSeconds / hrToSec.convert();
        System.out.println("hour: " + hr3);
        sec3 = givenSeconds % hrToSec.convert();

        min3 = sec3 / MIN_TO_SEC;
        System.out.println("Minute: " + min3);
        sec3 = sec3 % MIN_TO_SEC;
        System.out.println("Second: " + sec3);
        return sec3;
    }




    public static void main(String[] args) {
        Time midnight = new Time (24, 00,00);
        Time now = new Time (4, 2, 28);

        System.out.println("\nQuestion 3");
        System.out.println("now to seconds or since to midnight: " + now.convert());

        System.out.println("\nQuestion 4");
        System.out.println("remaining sec in a day: "+ now.remainingSec(midnight));

        System.out.println("\nQuestion 5");
        System.out.println("Percentage of the day that has passed: " + now.percentage(midnight));

        System.out.println("\nQuestion 6");
        Time end = new Time(5,24,10);
        System.out.println("end to seconds: " + end.convert());
        int elapsedNoMethod = end.convert() - now.convert();
        System.out.println("time elapsed (without using method): " + elapsedNoMethod);
        System.out.println("time elapsed (using method): " + end.elapsed(now));


        Time minToSec = new Time(00, 01, 00);
        Time hrToSec = new Time (1, 00, 00);
        Time DayToSec = new Time (24, 00,00);

        System.out.println("\nSelf practice");
        System.out.println("One minute has this much Seconds: " + minToSec.convert());
        System.out.println("One hour has this much  Seconds: " + hrToSec.convert());
        System.out.println("One day has this much Seconds: " + DayToSec.convert());

        System.out.println(" ");
        int hr2 = 20000 / hrToSec.convert();
        System.out.println("hour: " + hr2);
        int remainingSec = 20000 % hrToSec.convert();
        // System.out.println("Second remaining: " + remainingSec);
        int min2 = remainingSec / MIN_TO_SEC;
        System.out.println("Minute: " + min2);
        remainingSec = remainingSec % MIN_TO_SEC;
        System.out.println("Second: " + remainingSec);

        System.out.println(" ");
        end.convertBack(hrToSec, end.elapsed(now));

        Time check = new Time(1, 21, 42);
        System.out.println("checking...: " + check.convert());

    }
}
