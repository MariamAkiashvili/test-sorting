package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testSortNullArray() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> sorting.sort(null));
    }



    @Test
    public void testEmptyCase(){
        int[] arr =  {};
        sorting.sort(arr);
        Assert.assertEquals(0, arr.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[]arr = new int[] {1};
        sorting.sort(arr);
        Assertions.assertEquals(1, arr[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int [] arr2 = new int[] {1,1,3,4,9,22};
        sorting.sort(arr2);
        Assert.assertEquals(1, arr2[0]);
    }

    @Test
    public void testOtherCases() {
        int[] arr = new int[] {2,2,1,4,12};
        sorting.sort(arr);
        Assert.assertEquals(1, arr[0]);
    }

}