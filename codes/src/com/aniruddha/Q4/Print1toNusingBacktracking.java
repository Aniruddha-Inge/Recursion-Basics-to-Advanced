package com.aniruddha.Q4;

import java.util.Scanner;

public class Print1toNusingBacktracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fun(n,n);
    }
    static void fun(int i,int n){
        if(i<1)
            return;
        fun(i-1,n);
        System.out.println(i);
    }
}
