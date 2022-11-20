package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int Max_Value(int arr[]){
        int l=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > l) {
                l = arr[i];
            }


        }return l;
    }
    public static void Reverse_Array(int arr[]){
       int end= arr.length-1;
       int s=0;
       while (s<end){
           int temp=arr[s];
           arr[s]=arr[end];
           arr[end]=temp;
           s=s+1;
           end=end-1;

       }
    }
    public static void pair_in_array(int arr[]){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
            System.out.println("");
        }
        System.out.println("Total Pairs= "+ tp);
    }

    public static void SubArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(arr[k]+" ");
                } System.out.println("");
            } System.out.println("");
        }
    }


    public static void Max_Sum_SubArray(int arr[]){

        int Sum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int s = 0;
                for (int k = i; k <= j; k++) {
                    s = s + arr[k];
                    if (s > Sum) {
                        Sum = s;
                    }
                }
            }
        }
        System.out.println(Sum);

    }

    public static int WaterTraped(int arr[]){
        int n= arr.length;

        //Calculate left boundary
        int left[]=new int[arr.length];
        left[0]=arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        //Calculate right boundary
        int right[]=new int[arr.length];
        right[n-1]=arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            right[i]=Math.max(right[i+1],arr[i]);

        }
        //waterlevel
        int trappedwater=0;
        for (int i = 0; i < arr.length; i++) {
            int waterlevel=Math.min(left[i],right[i]);
            trappedwater=trappedwater+(waterlevel-arr[i]);
        }

        return trappedwater;
    }

    public static int Stocks(int arr[]){
        int n= arr.length;
        int buy=Integer.MAX_VALUE;
        int Maxprofit=0;


        for (int i = 0; i <n ; i++) {
            if (buy <arr[i]) {
                int profit = arr[i]-buy;
                Maxprofit=Math.max(profit,Maxprofit);
                }
            else{
                buy=arr[i];
            }
        }return Maxprofit;
    }




    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in) ;
       int n= obj.nextInt();
       int arr[]=new int[n];
       for (int i = 0; i <=arr.length; i++) {
            arr[i]= obj.nextInt();
       }
//       int max=Max_Value(arr);
//        System.out.println(max);
//        Reverse_Array(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+" ");
        System.out.println(Stocks(arr));
        }




    }

