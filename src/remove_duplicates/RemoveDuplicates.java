package remove_duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        for (int i=0; i<list.size(); i++){
            if (Collections.frequency(list,i)>1){
                list.remove(i);
            }
        }
        System.out.println(list);





    }
}
