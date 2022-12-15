package com.company;

public class Main {


    public static void decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        decreasing(n-1);
    }

    public static int facto(int n){

        if(n==0){
            return 1;
        }
        int s=facto(n-1);
        int a=n*facto(n-1);
        return a;


    }
    public static int sumn(int n){
        if(n==1){
            return 1;
        }
        int s=sumn(n-1);
        int a=n+sumn(n-1);
        return a;
    }


    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1) {
            return 1;
        }
        int s=fibo(n-1);
        int z=fibo(n-2);
        int a=s+z;
        return a ;
    }

    public static boolean issorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return issorted(arr,i+1);
    }

    public static int firstocc(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstocc(arr,key,i+1);

    }

    public static int lastocc(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        int a=lastocc(arr,key,i+1);
        if(a==-1 && arr[i]==key){
            return i;
        }
        return a;

    }


    public static int xpown(int x,int n){
       if(n==0){
           return 1;
       }
       if(n==1){
           return x;
       }
       int a=xpown(x,n-1);
       int b=x*xpown(x,n-1);
       return b;
    }

    public static int optpower(int x ,int n){
        if(n==0){
            return 1;
        }

        int h=optpower(x,n/2);
        int hh=h*h;

        if(n%2 !=0){
            hh=x*hh;
        }
        return hh;

    }

    public static void tower0fhanoi(int n,char src,char dest,char help){
        if(n==1){
            System.out.println("Move disk "+ n+ "from"+src +"to"+dest);
            return;
        }
        tower0fhanoi(n-1,src,help,dest);
        System.out.println("Move disk "+ n+ "from"+src +"to"+dest);
        tower0fhanoi(n-1,help,dest,src);

    }








    public static void main(String[] args) {
//	int n=5;
//    int a=fibo(n);
//        System.out.println( a);
//        int arr[]={1,2,3,4,2};
//        System.out.println(lastocc(arr,2,0));
//        System.out.println(optpower(2,3));
        tower0fhanoi(3,'A','C','B');
    }
}
