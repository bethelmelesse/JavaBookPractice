public class Circle {

    public static double calculateArea (double radius){
        double result = Math.PI * radius * radius;
        return radius;
        //return Math.PI * radius * radius;
    }

        public static void main(String[] args){
            double diameter = 10.0;
            double area = calculateArea(diameter/2);
            System.out.println(area);
        }

}
