package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int b=n;
        int c=0;
        while (n>0){
            int a=n%10;
            c=(c*10)+a;
            n=n/10;

        }
        if(b==c){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        }
    }

