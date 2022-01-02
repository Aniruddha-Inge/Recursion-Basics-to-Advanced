package com.aniruddha.Q14;

import java.util.ArrayList;
import java.util.Scanner;

public class CountTheSubsequencesHavingSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(CountSubsHavingSumK(0,0,arr,sum,n));

    }
    static int CountSubsHavingSumK(int i, int s, int[] arr, int sum, int n){
        
        if(i==n){
            //condition satisfied
            if(s == sum){
                return 1;
            }
            //condition not satisfied
            else return 0;
        }

        s+=arr[i];

        int l = CountSubsHavingSumK(i + 1, s, arr, sum, n);

        s-=arr[i];


        //not pick case
        int r = CountSubsHavingSumK(i + 1, s, arr, sum, n);

        return l+r;
    }
}
