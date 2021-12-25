package com.aniruddha.Q8;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr,0,n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse(int[] x, int i, int j){
        if(i<j){//Swap
            int tmp = x[i];
            x[i] = x[j];
            x[j] = tmp;
            reverse(x, ++i, --j);//Recursive
        }
    }
}
