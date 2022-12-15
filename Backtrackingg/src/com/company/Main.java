package com.company;

public class Main {
    public static void Subset(String a,String b,int i){
        if(i==a.length()){
            if(b.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(b);
            }
            return;

        }
        Subset(a,b+a.charAt(i),i+1);
        Subset(a,b,i+1);
    }

    public static  void Permutations(String a,String b){
        if(a.length()==0){
            System.out.println(b);
            return;
        }
        for (int j = 0; j < a.length(); j++) {
            char curr=a.charAt(j);
            String newa=a.substring(0,j)+a.substring(j+1);
            Permutations(newa,b+curr);
        }

    }

    public static void main(String[] args) {
        String a="abc";
        String b="";
        Permutations(a,b);

    }
}
