package com.aniruddha.Q6;

import java.util.Scanner;

public class PrintSumofFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        fun(n,0);
        System.out.println(fun1(n));
    }
    static void fun(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        fun(i-1,sum+i);
    }
    static int fun1(int n){
        if(n==0)
            return 0;
        return n + fun1(n-1);
    }
}
