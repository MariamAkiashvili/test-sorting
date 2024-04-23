package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase(){
//        Assert.assertTrue(IllegalArgumentException.class.);
        Assertions.assertThrows(IllegalArgumentException.class, () -> sorting.sort(null));
    }



    @Test
    public void testEmptyCase(){
        int[] arr = new int [] {};
        sorting.sort(arr);
        Assert.assertEquals(0, arr.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[]arr = new int[] {1};
        sorting.sort(arr);
        Assertions.assertEquals(1, arr.length);
    }

    @Test
    public void testSortedArraysCase() {
        int [] arr = new int[] {1,3,1,22,9,4};
        int [] arr2 = new int[] {1,1,3,4,9,22};
        sorting.sort(arr);
        Assert.assertArrayEquals(arr2, arr);
    }

    @Test
    public void testOtherCases() {
        int[] arr = new int[] {1,2,1,4,12};
        sorting.sort(arr);
        Assert.assertNotNull(arr);
    }

}