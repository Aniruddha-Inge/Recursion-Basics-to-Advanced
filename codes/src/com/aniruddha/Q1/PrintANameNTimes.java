package com.aniruddha.Q1;

import java.util.Scanner;

public class PrintANameNTimes {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(1,n);
    }
    static void fun(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Aniruddha");
        fun(i+1,n);
    }

}
