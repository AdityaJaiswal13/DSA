package com.company;

public class Main {

    public static void main(String[] args) {
            pattern21(5);

        }
        static void pattern8(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }System.out.println();
            }

        }
        static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j);
            }System.out.println();
        }
        }
        static void pattern10(int n) {
        for(int i=0;i<=n;i++){
            for (int k=0;k<=n-i;k++){
                System.out.print(" ");

            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");

            }
            for(int i=0;i<=n;i++){
                for (int k=0;k<=n-i;k++){
                    System.out.print(" ");

                }
                for(int j=0;j<2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println("");

        }}
        static void pattern11(int n){
            for(int i=5;i>=0;--i) {
                for (int k = 0; k < n-i; k++) {
                    System.out.print(" ");

                }for (int j = 0; j < 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        static void pattern12(int n){
            for(int i=0;i<=n;i++){
                for (int k=0;k<n-i;k++){
                    System.out.print(" ");

                }
                for(int j=0;j<2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=5;i>=0;--i) {
                for (int k = 0; k < n-i; k++) {
                    System.out.print(" ");

                }for (int j = 0; j < 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }


        }
        static void pattern13(int n){
            for(int i=1;i<=n;i++) {
                for (int j =1;j<=i; j++){
                    System.out.print("*");}
                for (int k =1; k <= n-i; k++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            for(int i=n;i>0;i--){
                for (int j=0;j<i-1;j++){
                    System.out.print("*");
                }
                System.out.println("");

            }}
        static void pattern14(int n){
            for(int i=1;i<=n;i++){
                for(int j=i;j>=1;j--){
                    System.out.print(j%2);
                    }System.out.println();
            }}
        static void pattern15(int n){
          int s=(2*n)-2;

            for(int i=1;i<=n;i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int k = 1; k <= s; k++) {
                    System.out.print(" ");
                }
                for (int l = i; l >= 1; l--) {
                    System.out.print(l);
                }
                System.out.println();
                s=s-2;
            }}




        static void pattern16(int n){
        int a=1;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(a+" ");
                    a+=1;
                }System.out.println();
            }

        }
        static void pattern17(int n){
            for (int i = 1; i <=n ; i++) {
                char a='A';
                for (int j = 1; j <=i ; j++){
                    System.out.print(a);
                    a++;

                }
                System.out.println();
            }
        }
        static void pattern18(int n){
            for (int i = 5; i>=1 ; i--) {
                char a='A';
                for (int j = 1; j <=i ; j++) {
                    System.out.print(a);
                    a++;
                }

                System.out.println(" ");
                
            }
        }
        static void pattern19(int n){
        char a='A';
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(a);
                }
                System.out.println(" ");
                a++;
            }
        }
        static void pattern20(int n){

            for (int i = 1; i <=5 ; i++) {
                char a='A';
                for (int j = 1; j <=n-i ; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <i ; k++){

                    System.out.print(a);
                    a++;
                }

                for(int l = i-1; l>= 0; l--){
                    System.out.print((char)('A'+l));
                }

                System.out.println(" ");
            }

       }
       static void pattern21(int n){
           for (int i =1; i <=n ; i++) {
               for (int j=i-1; j>=0 ; j--) {
                   System.out.print((char)('E'-j));


               }
               System.out.println(" ");

           }
       }








}









