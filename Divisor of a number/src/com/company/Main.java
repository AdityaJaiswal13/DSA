package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
