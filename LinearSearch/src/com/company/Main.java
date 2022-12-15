package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums={23,45,16,17,18,19,13,12};
        int target=17;
        int ans=linearsearch(nums,target);
        System.out.println(ans);

    }

    static int linearsearch(int arr[],int target){
        if (arr.length==0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            int element=arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}



