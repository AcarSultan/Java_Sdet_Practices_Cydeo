package circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        /*
        The circumference and area of a circle were calculated
        using a custom String method. Also, the Scanner
        class was used to get data from the user.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        circleCalculation(radius);

    }


    /**
     * custom method for calculating the area and perimeter of a circle
     *
     * @param radius double data type of the circle
     * @return String
     */
    public static String circleCalculation(double radius){

        // A= pi*r^2 --> area of a circle
        // P= 2*p*r  --> perimeter of a circle
        // pi= 3.14

        double areaOfCircle = 3.14 * radius * radius;
        double perimeterOfCircle = 2 * 3.14 * radius;

        System.out.println("The area of the Circle is " + areaOfCircle);
        System.out.println("The perimeter of the Circle is " + perimeterOfCircle);

        return "The area of the Circle is " + areaOfCircle + "\n" +
                 "The perimeter of the Circle is " + perimeterOfCircle;

    }
}
