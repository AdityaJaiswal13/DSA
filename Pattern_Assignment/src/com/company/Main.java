package com.company;

public class Main {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern0(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i ==1 || i == n || j==1||j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }}
    static void pattern2(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
    static void pattern3(int n){
        int k=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
    static void pattern4(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j >=1 ; j--) {
                System.out.print(j%2);
            }
            System.out.println(" ");

        }
    }

    static void pattern5(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }}






