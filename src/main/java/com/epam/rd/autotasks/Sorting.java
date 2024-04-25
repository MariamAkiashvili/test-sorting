package com.epam.rd.autotasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public void sort(int[] array){


        if(array == null){
            throw new IllegalArgumentException("Unexpected exception");
        }
        if (array.length > 0){
            Arrays.sort(array);
        }
        if(array.length > 10000000){
            throw new IllegalArgumentException("Too many element in array");
        }

    }
}
