package com.alevel.cycle;

public class TestApplication {

    public static int[] bubbleSort(int[] arr) {


        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {

                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        return arr;
    }

    public static int[] FindMinMax(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return new int[]{min, max};
    }

    public static int[] MultipleNum(int[] arr, int k) {

        int countMultipleNum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {

                countMultipleNum++;
            }
        }

        int[] multipleArr = new int[countMultipleNum];
        int j = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                multipleArr[j] = arr[i];
                j++;
            }
        }

        return multipleArr;
    }


}


