package com.company;

import java.util.Arrays;

public class Main {


    public static int [] Merge_sort(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left = Merge_sort(Arrays.copyOfRange(arr,0, mid));
        int[] right=Merge_sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static void Merge_sort_inplace(int arr[],int si,int ei){
        if(ei-si==1){
            return ;
        }
        int mid=si+ei/2;
        Merge_sort_inplace(arr,0,mid);
        Merge_sort_inplace(arr,mid,ei);
        Merge_inplace(arr,si,mid,ei);
    }
    public static int [] merge(int [] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int mix[]=new int[left.length + right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;

    }
    public static void Merge_inplace(int arr[] ,int si,int m,int ei){
        int i=si;
        int j=m;
        int k=0;
        int mix[]=new int[ei-si];
        while(i<si && j<ei){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<ei) {
            mix[k] =arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[si+ei]=mix[l];
        }


    }

    public static void QuickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }

        int pivinx=Partion(arr,si,ei);
        QuickSort(arr,si,pivinx-1);
        QuickSort(arr,pivinx+1,ei);
    }

    public static int Partion(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j = si; j < ei; j++) {
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }





    public static void main(String[] args) {
        int arr[]={4,1,6,7,2,3,5};
        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
