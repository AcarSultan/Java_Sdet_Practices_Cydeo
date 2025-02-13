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

        System.out.println(removingFirstChars(firstWord, secondWord));
        scanner.close();



    }

    /**
     * A String method for removing first characters
     * @param str1
     * @param str2
     * @return (str1+ "" +str2)
     */
    public static String removingFirstChars(String str1, String str2){

        str1= str1.substring(1);
        str2= str2.substring(1);

        return (str1+ "" +str2);

    }




}
