package move_the_zeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveTheZeros{
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> newList= new ArrayList<>();

        int numOfZeroes= Collections.frequency(list,0);
        list.removeAll(Arrays.asList(0));


        for (int i=0; i<numOfZeroes; i++){
            list.add(0);
        }

        System.out.println(list);



    }
}

