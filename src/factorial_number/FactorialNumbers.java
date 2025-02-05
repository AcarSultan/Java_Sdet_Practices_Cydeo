package factorial_number;

public class FactorialNumbers {
    public static void main(String[] args) {


        System.out.println(calculatingFactorial(0));
        System.out.println(calculatingFactorial(5));
        System.out.println(calculatingFactorial(8));
        System.out.println(calculatingFactorial(12));

    }

    /**
     * Custom int method for calculating factorial numbers
     * @param number
     * @return factorialNumber
     */
    public static int calculatingFactorial(int number) {

        // An example how factorial numbers work : 5!= 5*4*3*2*1 ---> 120

        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            factorialNumber = i * factorialNumber;
        }
        return factorialNumber;
    }




}
