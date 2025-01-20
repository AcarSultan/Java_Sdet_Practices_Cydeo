package miles_to_kilometers;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the miles: ");

        double miles = input.nextDouble();
        // 1 miles = 1.609344 km

        double km = miles * 1.609344;

        System.out.println(miles + " miles is equal to " + km + " kilometers.");


    }
}
