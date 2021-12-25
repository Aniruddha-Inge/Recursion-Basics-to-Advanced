package com.aniruddha.Q5;

import java.util.Scanner;

public class PrintNto1usingBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(1,n);
    }
    static void fun(int i,int n){
        if(i>n)
            return;
        fun(i+1,n);
        System.out.println(i);
    }
}
