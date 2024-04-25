package com.epam.rd.autotasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


//public class SortingTest {
//
//    Sorting sorting = new Sorting();
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSortNullArray() {
//
//        sorting.sort(null);
//    }
//
//
//
//    @Test
//    public void testEmptyCase(){
//        int[] arr =  {};
//        sorting.sort(arr);
//        Assert.assertEquals(0, arr.length);
//    }
//
//    @Test
//    public void testSingleElementArrayCase() {
//        int[]arr = new int[] {1};
//        sorting.sort(arr);
//        Assert.assertEquals(1, arr[0]);
//    }
//
//    @Test
//    public void testSortedArraysCase() {
//        int [] arr2 = new int[] {1,1,3,4,9,22};
//        sorting.sort(arr2);
//        Assert.assertEquals(1, arr2[0]);
//    }
//
//    @Test
//    public void testReversedSorted() {
//        int[] arr = new int[] {2,2,1,4,12};
//
//        sorting.sort(arr);
//        Assert.assertEquals(1, arr[0]);
//    }
//
//
//
//}
//
//
//
//


public class SortingTest {

    Sorting sorting = new Sorting();

    @Test (expected = IllegalArgumentException.class)
    public void testNullCase(){
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase(){
        int [] arr = new int[]{};
        sorting.sort(arr);
//        Assert.assertArrayEquals(new int[] {}, arr);
        Assert.assertEquals(0, arr.length);

    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr = new int[]{4};
        sorting.sort(arr);
        Assert.assertEquals(4, arr[0]);
    }

    @Test
    public void testSortedArraysCase() {
        int[] arr = new int[]{1,2,3,4,5};
        sorting.sort(arr);
        Assert.assertArrayEquals(new int[]{1,2,3,4,5}, arr);
//        Assert.assertNotNull(arr);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testOtherCases() {

        int[] arr2 = new int[100000];
        sorting.sort(arr2);

        Assert.assertEquals(0, arr2[0]);

    }



}
