package upper_case_lower_case;

public class UpperCaseLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
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
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }
}
