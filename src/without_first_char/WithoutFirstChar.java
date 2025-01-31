package without_first_char;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        // Print the first word without its first character,
        // then print the second word without its first character.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String firstWord= scanner.next();

        System.out.println("Please enter the second word: ");
        String secondWord= scanner.next();

        scanner.close();

        firstWord= firstWord.substring(1);
        secondWord= secondWord.substring(1);

        System.out.println(firstWord+secondWord);

    }
}
