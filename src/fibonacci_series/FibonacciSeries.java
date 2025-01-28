package fibonacci_series;

public class FibonacciSeries {

    public static void main(String[] args) {

        // input : 8
        // output :  0 1 1 2 3 5 8 13


        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < 8; i++) {

            System.out.print(num1 + " ");

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;


        }

    }
}
