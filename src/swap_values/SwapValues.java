package swap_values;

public class SwapValues {

    public static void main(String[] args) {



        int num1 = 5;
        int num2 = 10;
        int temp = 0;


        temp = num1;
        num1=num2;
        num2=temp;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("-------------------------------------------");

        int num3 = 5;
        int num4 = 10;

        num3 = num3 + num4;
        num4 = num3 - num4;
        num3 = num3 - num4;

        System.out.println(num3);
        System.out.println(num4);



    }
}
