package com.company;

import java.util.Scanner;

public class Main {
    public static boolean search(int arr[][],int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == key) {
                    System.out.println(i+""+j);
                    return true;
                }

            }

        }
        return false;
    }
    public static int max(int arr[][]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }return max;
     }


     public static void spiral(int arr[][]) {
        int sr=0;
        int sc=0;
        int er= arr.length-1;
        int ec= arr[0].length-1;

        while (sr<=er && sc<=ec){
//            top
            for (int j = 0; j <=arr.length; j++) {
                System.out.print(arr[sr][j]);
            }

//            right
            for (int i = sr+1; i <=er ; i++) {
                System.out.print(arr[i][ec]);

            }

//            bottom
            for (int j = ec-1; j >=sc ; j--) {
                if(er==sr){
                    break;
                }
                System.out.print(arr[er][j]);

            }

//            left
            for (int i = er-1; i >=sr+1 ; i--) {
                if (sc==ec){
                    break;
                }
                System.out.print(arr[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
         System.out.println("");


    }

    public static int diagonal(int arr[][]){
        int s=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    s=s+arr[i][j];
                }

            }

        }return s;

    }

    public static int Number_7(int arr[][]){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j]==7){
                    c++;
                }

            }

        }return c;
    }
    public static int Row_2_Sum(int arr[][]){
        int s=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==1){
                    s=s+arr[i][j];
                }

            }

        }return s;
    }

    public static int Binari(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while (start<=end){
        if (arr[mid]==key){
            return mid;
        }
        if (arr[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }

    }return -1;

    }

    public static void main(String[] args){
            Scanner obj = new Scanner(System.in);
//            int arr[][] = {{1,2,3,4},
//                    {7,7,7,7},{9,10,11,12},{13,14,15,16}};
//
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j] + " ");
//
//            }
//            System.out.println("");
//        }
//          int a=Row_2_Sum(arr);
//
//        System.out.println(a);
        int arr[]={2,3,4,5,6};
        int key=5;
        int a=Binari(arr,key);
        System.out.println(a);

    }
}

