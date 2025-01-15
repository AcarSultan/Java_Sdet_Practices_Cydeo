package circle;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius:");

        double radius = input.nextDouble();

        // A= pi*r^2 --> area of a circle
        // P= 2*p*r  --> perimeter of a circle
        // pi= 3.14

        double areaOfCircle = 3.14 * radius * radius;
        double perimeterOfCircle = 2 * 3.14 * radius;

        System.out.println("The area of the Circle is " + areaOfCircle);
        System.out.println("The perimeter of the Circle is " + perimeterOfCircle);


    }
}
