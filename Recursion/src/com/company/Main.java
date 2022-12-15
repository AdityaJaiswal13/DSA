package com.company;

public class Main {


    public static void Printnto1(int n){
        if(n==1){
            System.out.print(1);
        }
        System.out.println(n);
        Printnto1(n-1);

    }


    public static void main(String[] args) {
        int n=10;
        Printnto1(n);


    }
}
