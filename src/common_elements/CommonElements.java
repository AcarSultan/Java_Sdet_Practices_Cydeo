package common_elements;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        Set<Integer> set3 = new TreeSet<>();
        for (Integer each : set1) {
            if (set2.contains(each)){
                set3.add(each);
            }
        }
        System.out.println(set3);
    }

}
