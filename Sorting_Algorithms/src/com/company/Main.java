package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        SelectionSort(arr);
        Print(arr);
    }
    public static void Bubblesort(int arr[]){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <(n-i-1) ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void InsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }
    }


    public static void SelectionSort(int arr[]){
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int minpos=i;
            for (int j = i+1; j <=n-1 ; j++) {
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
    }








    public static void Print(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }






}
