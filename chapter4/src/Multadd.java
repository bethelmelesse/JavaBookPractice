public class Multadd {
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }

    public static double expSum(double x){
        double exp = Math.exp(-x);
        //System.out.println("exp " + exp);
        double firstPart = x * exp;
        //System.out.println("first part " + firstPart);
        double in = 1 - exp;
        //System.out.println("in " + in);
        double secondPart = Math.sqrt(in);
        //System.out.println("second part " + secondPart);
        double compute = firstPart + secondPart;
        return compute;
    }

    public static void main(String[] args){
        double result = multadd(1.0, 2.0, 3.0);
        System.out.println(result);

        double calculateTrig = Math.sin(Math.PI / 4 ) + (Math.cos(Math.PI / 4) / 2);
        double calculateLog = Math.log(10) + Math.log(20);
        System.out.println(calculateTrig);
        System.out.println(calculateLog);
        System.out.println(expSum(2));
    }
}
