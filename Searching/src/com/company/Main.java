package com.company;
import java.util.*;

public class Main {
    public static int linearSearch(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int Binary_Search(int arr[],int key){
        int start=0,end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=obj.nextInt();
        System.out.println("Enter key value: ");
        int key= obj.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= obj.nextInt();
        }
//        int index=linearSearch(arr,key);
//        if (index==-1){
//            System.out.println("Not Found");
//        }
//        else{
//            System.out.println("Index is "+ index);
//      }
        int index=Binary_Search(arr,key);
        if (index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index is "+ index);
        }

    }
}
