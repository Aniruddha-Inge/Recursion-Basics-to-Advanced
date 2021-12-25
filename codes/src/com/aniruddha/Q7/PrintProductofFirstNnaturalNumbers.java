package com.aniruddha.Q7;

import java.util.Scanner;

public class PrintProductofFirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fun(n));
    }
    static int fun(int n){
        int product = 1;
        if(n==1)
            return 1;
        return n*fun(n-1);
    }
}
