package leap_year;

public class LeapYear {

    public static void main(String[] args) {


        /*
        Leap year or not
        a leap year is defined as a year that is divisible by 4.
        except for years that are divisible by 100.
        However, years that are divisible by 400 are considered leap years.
         */


        int year= 2024;

        boolean isLeapYear = (year%4==0 && year%100 !=0) || (year%400==0);

        System.out.println("Is " + year + " a leap year? " + isLeapYear);



    }
}
