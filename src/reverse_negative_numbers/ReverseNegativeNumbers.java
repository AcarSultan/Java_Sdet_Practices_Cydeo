package reverse_negative_numbers;

public class ReverseNegativeNumbers {


    /*
    Write a return method that can reverse digits
    of a negative number and return it as int
    input: -35  output: -53
     */

    public static void main(String[] args) {
        System.out.println("reversed number = " + reverseNumber(-35));
        System.out.println("reversed number = " + reverseNumber(0));
        System.out.println("reversed number = " + reverseNumber(255));
        System.out.println("reversed number = " + reverseNumber(-12345));
        System.out.println("reversed number = " + reverseNumber(-187654321));
    }


    /**
     * Reversing the given number with a while loop
     *
     * @param number
     * @return
     */
    public static int reverseNumber(int number) {
        int reversedNumber = 0;

        while (number != 0 && number<0) {
            int lastDigit = number % 10;                        // Getting the last digit
            reversedNumber = reversedNumber * 10 + lastDigit;   // Build the reversed number
            number /= 10;                                       // Removing the last digit
        }

        return reversedNumber;

    }
}
