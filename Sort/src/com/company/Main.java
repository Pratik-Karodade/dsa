package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{3,4,5,2,1};
        bubbleSort.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
