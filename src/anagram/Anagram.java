package anagram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        if (set1.equals(set2)){
            System.out.println("True");
        } else {
            System.out.println("It's not anagram!");
        }


    }

}
