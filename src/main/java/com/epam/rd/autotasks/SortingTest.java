package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test
    public void testNullCase(){
        try {
            sorting.sort(null);
            Assert.fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Success
        }
    }



    @Test
    public void testEmptyCase(){
        int[] arr = {};
        sorting.sort(arr);
        Assert.assertEquals(0,arr.length);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[]arr = new int[] {1};
        sorting.sort(arr);
        Assert.assertEquals(1, arr[0]);
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