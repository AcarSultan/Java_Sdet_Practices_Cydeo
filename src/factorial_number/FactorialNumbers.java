package factorial_number;

public class FactorialNumbers {
    public static void main(String[] args) {

        // 5!= 5*4*3*2*1 ---> 120
        int num= 5;
        int factorialNumber= 1;

        for (int i = 1; i <=num ; i++) {
            factorialNumber= i * factorialNumber;
        }

        System.out.print(factorialNumber);

    }
}
