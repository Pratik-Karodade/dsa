package com.company;

public class BubbleSort {

    public void bubble(int[] arr){
        for(int i =arr.length-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
