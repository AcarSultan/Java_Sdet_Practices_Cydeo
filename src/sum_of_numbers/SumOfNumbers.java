package sum_of_numbers;

public class SumOfNumbers {
    public static void main(String[] args) {

        // (n*(n+1))/2 ---> adding consecutive numbers

        int a = 50;
        int i;
        int sumOfNumbers = 0;
        for ( i = 1; i < a; i++) {
            sumOfNumbers= (a*(a+1)) / 2;
        }
        System.out.println(sumOfNumbers);

    }
}
