package com.epam.rd.autotasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {
    public void sort(int[] array){


        if(array == null){
            throw new IllegalArgumentException("Unexpected exception");
        }
        if (array.length > 0){
            Arrays.sort(array);
        }

    }
}
