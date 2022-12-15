package com.company;

public class pattern7 {
    public static void main(String[] args) {
        pattern8(5);

    }
    static void pattern8(int n){
        for(int i=1;i>=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

}
