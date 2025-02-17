package common_elements;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {

    public static void main(String[] args) {

        TreeSet<Integer> set1 = new TreeSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        System.out.println(findingCommonElements(set1, set2));

    }


    /**
     * Custom method for finding common elements between 2 TreeSets
     * @param set1 TreeSet
     * @param set2 TreeSet
     * @return set3
     */
    public static TreeSet findingCommonElements(TreeSet set1, TreeSet set2){

        TreeSet<Integer> set3 = new TreeSet<>();

        for (Object each : set1) {
            if (set2.contains(each)){
                set3.add((Integer) each);
            }
        }
        return set3;

    }


}
