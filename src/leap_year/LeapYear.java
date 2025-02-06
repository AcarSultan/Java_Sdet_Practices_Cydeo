package leap_year;

public class LeapYear {

    public static void main(String[] args) {


        /*
        Leap year or not
        a leap year is defined as a year that is divisible by 4.
        except for years that are divisible by 100.
        However, years that are divisible by 400 are considered leap years.
         */


        System.out.println(calculatingLeapYear(2025));
        System.out.println(calculatingLeapYear(1988));
        System.out.println(calculatingLeapYear(1853));

    }

    /**
     * a custom method for calculating the leap year
     * @param number
     * @return ("Is " + number + " a leap year? " + "\n" + isLeapYear)
     */
    public static String calculatingLeapYear(long number){

        boolean isLeapYear = (number%4==0 && number%100 !=0) || (number%400==0);

        return ("Is " + number + " a leap year? " + "\n" + isLeapYear);

    }




}
