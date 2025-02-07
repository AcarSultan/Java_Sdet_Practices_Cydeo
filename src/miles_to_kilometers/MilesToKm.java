package miles_to_kilometers;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {

        System.out.println(calculatingMilesToKilometer(5));

    }

    /**
     * A custom method for calculating miles to kilometer
     * @param miles double
     * @return (miles + " miles is equal to " + km + " kilometers.")
     */
    public static String calculatingMilesToKilometer(double miles) {

        System.out.println("Miles to kilometers calculating..");

        // 1 miles = 1.609344 km
        double km = miles * 1.609344;
        return (miles + " miles is equal to " + km + " kilometers.");

    }
}
