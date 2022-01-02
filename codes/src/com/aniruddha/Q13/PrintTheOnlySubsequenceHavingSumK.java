package com.aniruddha.Q13;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintTheOnlySubsequenceHavingSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        printSubsHavingSumK(0,list,0,arr,sum,n);
    }
    static boolean printSubsHavingSumK(int i, ArrayList<Integer> list, int s, int[] arr, int sum, int n){
        if(i==n){
            //condition satisfied
            if(s == sum){
                for (int x: list) {
                    System.out.print(x + " ");
                }
                System.out.println();
                return true;
            }
            //condition not satisfied
            return false;
        }
        list.add(arr[i]);
        s+=arr[i];

        if(printSubsHavingSumK(i + 1, list, s, arr, sum, n)) return true;

        s-=arr[i];
        list.remove(list.size()-1);

        //not pick case
        if(printSubsHavingSumK(i + 1, list, s, arr, sum, n)) return true;

        return false;
    }
}
