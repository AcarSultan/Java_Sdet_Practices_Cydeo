package fibonacci_series;

public class FibonacciSeries {

    public static void main(String[] args) {


        fibonacciCalculating(8);


    }


    /**
     * A custom method for Fibonacci sequence calculating
     * @param number
     * @return sum
     */
    public static int fibonacciCalculating(int number){

        //The Fibonacci sequence is a series of numbers where each number
        //is the sum of the two preceding ones, usually starting with 0 and 1.
        // input : 8
        // output :  0, 1, 1, 2, 3, 5, 8, 13, and so on.

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

        for (int i = 0; i < number; i++) {

            System.out.print(num1 + " ");

            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        return sum;

    }




}
