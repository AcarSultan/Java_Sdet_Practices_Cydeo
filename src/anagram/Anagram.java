package anagram;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(findAnagram("abcd", "ccddabaa"));
        System.out.println(findAnagram("ananas", "monopoly"));
        System.out.println(findAnagram("dusty", "stu dy"));

    }

    /**
     * A custom method for finding the anagrams
     * @param str1
     * @param str2
     * @return set1.equals(set2)
     */
    public static boolean findAnagram(String str1, String str2){

        // Remove spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        Set<String> set1 = new TreeSet<>(Arrays.asList(str1.split("")));
        Set<String> set2 = new TreeSet<>(Arrays.asList(str2.split("")));

        return set1.equals(set2);


    }







}
