package math_utility;

public class MathUtility {
    public static void main(String[] args) {
        int result = calculate(10,'+',20);
        System.out.println(result);

        double result2 = calculate(2.5,'*',3.0);
        System.out.println(result2);

        int num= square(8);
        System.out.println(num);

        double num2= square(1.5);
        System.out.println(num2);

        int num3= cube(3);
        System.out.println(num3);

        double num4= cube(2.5);
        System.out.println(num4);
    }


    public static int calculate(int a, char c, int b){
        if (c=='+'){
            return a + b;
        } else if (c=='-') {
            return a-b;
        } else if (c=='*') {
            return a*b;
        } else if (c=='/') {
            return a/b;
        } else {
            return 0;
        }
    }

    public static double calculate(double a, char c, double b) {
        if (c == '+') {
            return a + b;
        } else if (c == '-') {
            return a - b;
        } else if (c == '*') {
            return a * b;
        } else if (c == '/') {
            return a / b;
        } else {
            return 0;
        }
    }


    public static int square(int a){
        return a*a;
    }

    public static double square(double a){
        return a*a;
    }


    public static int cube(int a){
        return a*a*a;
    }

    public static double cube(double a){
        return a*a*a;
    }
}
