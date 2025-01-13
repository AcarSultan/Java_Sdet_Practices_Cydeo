package odd_and_even;

public class OddAndEven {
    public static void main(String[] args) {


        boolean result = isOdd(100);
        System.out.println("result = " + result);


        boolean result2 = isEven(100);
        System.out.println("result2 = " + result2);
    }

    public static boolean isOdd(int a){
        return a%2 ==1;
    }


    public static boolean isEven(int a){
        if (a%2 ==0){
            return true;
        } else {
            return false;
        }
    }



}
