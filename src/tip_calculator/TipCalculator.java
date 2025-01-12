package tip_calculator;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        // Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

        Scanner scanner = new Scanner(System.in);
        System.out.println("Split or No split? (yes or no)");
        String split = scanner.next();

        System.out.println("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Enter the check amount: ");
        double amount = scanner.nextDouble();

        System.out.println("How was the service quality?");
        System.out.println("poor / fair / good / great / excellent");
        String quality = scanner.next();
        scanner.close();

        double tip = switch (quality) {
            case "poor" -> 0.05;
            case "fair" -> 0.10;
            case "good" -> 0.15;
            case "great" -> 0.20;
            case "excellent" -> 0.25;
            default -> 0.0;
        };

        double totalTip = amount*tip;
        double totalToPay = amount + totalTip;
        double tipPerPerson = totalTip/numberOfPeople;
        double totalPerPerson = (amount / numberOfPeople) + tipPerPerson;

        if (split.equals("yes")){
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay: " + totalToPay);
            System.out.println("Total tip: " + totalTip);
            System.out.println("Total per person: " + totalPerPerson);
            System.out.println("Tip per person: " + tipPerPerson);
        } else {
            System.out.println("You need to pay everything");
        }

        }
}
