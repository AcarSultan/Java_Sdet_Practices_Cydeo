package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList list = removeDuplicates(new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7)));
        System.out.println("list = " + list);

    }


    /**
     * An ArrayList method for finding the duplicates and then remove it
     * @param list ArrayList<Integer>
     * @return list
     */
    public static ArrayList removeDuplicates(ArrayList<Integer> list){

        for (int i=0; i<list.size(); i++){
            if (Collections.frequency(list,i)>1){
                list.remove(i);
            }
        }
        return list;
    }





}
