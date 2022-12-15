package com.company;

public class Main {

    public static void main(String[] args) {
	int arr[]={1, 1, 3, 3, 4, 3, 2, 4, 2};
    twicevalue(arr);
    }

    static void twicevalue(int arr[]){
        int c=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    c++;
                }

            }

        }System.out.println((c>=1)?"True":"False");

    }




}

