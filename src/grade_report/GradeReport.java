package grade_report;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = input.nextInt();
        input.close();

        if (score<=100 && score>=90){
            System.out.println("Your grade is A");
        } else if (score<90 && score>=80) {
            System.out.println("Your grade is B");
        } else if (score<80 && score>=70) {
            System.out.println("Your grade is C");
        } else if (score<70 && score>=60) {
            System.out.println("Your grade is D");
        } else if (score<60 && score>=50) {
            System.out.println("Your grade is E");
        } else if (score<50 && score>=0) {
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid Score.");
        }



    }

}
