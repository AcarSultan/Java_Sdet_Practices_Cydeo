package finra_pattern;

public class FinraPattern {
    public static void main(String[] args) {

        int r=20;
        int number=1;

        do {

            if (number%3==0 && number%5==0){
                System.out.print("FINRA ");
            } else if (number%5==0) {
                System.out.print("RA ");
            } else if (number%3==0) {
                System.out.print("FIN ");
            } else {
                System.out.print(number + " ");
            }

            number++;

        } while (number<=r);





    }
}
