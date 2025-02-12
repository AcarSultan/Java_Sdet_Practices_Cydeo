package upper_case_lower_case;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        countingUpperLowerCases("JAVA java");
        countingUpperLowerCases("programming LANGUAGE");

    }

    /**
     * A void method for counting upper and lower cases and determining the equality
     * @param str
     */
    public static void countingUpperLowerCases(String str){
        int totalUpperCase = 0;
        int totalLowerCase = 0;

        for (char ch: str.toCharArray()){
            if (Character.isUpperCase(ch)){
                totalUpperCase++;
            }else if (Character.isLowerCase(ch)){
                totalLowerCase++;
            }
        }

        if (totalUpperCase==totalLowerCase){
            System.out.println("Total UpperCase is equal to total LowerCase: " + true);
        } else{
            System.out.println("Total UpperCase is equal to total LowerCase: " + false);
        }

    }




}
