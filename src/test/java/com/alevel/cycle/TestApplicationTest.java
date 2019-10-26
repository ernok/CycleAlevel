package com.alevel.cycle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TestApplicationTest {

    private static TestApplication TestApplicationInstance;

    @Before
    public void before(){

        System.out.println("Before running ...");
        TestApplicationInstance = new TestApplication();

    }

   
    @Test
    public void FindVar() {
        int [] arr = {1, 0, 38, 127};
        int [] answer = {0,127};

        int [] result = TestApplicationInstance.FindMinMax(arr);
        assertArrayEquals(answer, result);
    }

    @Test
    public void Sort() {
        int [] arr = {138, 89, -256, -3, -102};
        int [] answer = {-256, -102, -3, 89, 138};

        int [] result = TestApplicationInstance.bubbleSort(arr);
        assertArrayEquals(answer, result);
    }

    @Test
    public void Multiple() {
        int [] arr =    {138, 89, -256, -3, -102, 2, 8, 1345};
        int [] answer = {138, -256, -102, 2, 8};
        int k = 2;

        int [] result = TestApplicationInstance.MultipleNum(arr, k);
        assertArrayEquals(answer, result);
    }

}