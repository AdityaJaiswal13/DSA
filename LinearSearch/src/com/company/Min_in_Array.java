package com.company;

public class Min_in_Array {
    public static void main(String[] args) {
        int[] arr = {12,13,4,5,6,7};
            System.out.println(min(arr));

        }

        static int min(int[] arr) {
             int a=arr[0];
             for (int i=0;i<arr.length;i++){
                 if (arr[i]<a){
                 a=arr[i];
             }


        }
             return a;
    }
}
