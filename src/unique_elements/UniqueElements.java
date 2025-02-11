package unique_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> result = findUniqueElement(new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5)));
        System.out.println(result);

    }


    /**
     * A custom ArrayList method for finding the unique elements
     * @param list
     * @return list
     */
    public static ArrayList findUniqueElement(ArrayList<Integer> list){

        list.removeIf (p -> Collections.frequency(list,p) > 1);
        return list;

    }



}
