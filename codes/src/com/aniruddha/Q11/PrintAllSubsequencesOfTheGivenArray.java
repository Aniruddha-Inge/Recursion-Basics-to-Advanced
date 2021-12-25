package com.aniruddha.Q11;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubsequencesOfTheGivenArray {
    public static void main(String[] args) {
        //Subsequences - A contiguous or a non-contiguous sequence which follows the order
        //T = O((2^n)*n)
        //S = O(n)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        printAllSubsequences(0,list,arr,n);
    }
    static void printAllSubsequences(int i, ArrayList<Integer> list,int[] arr, int n){
        if(i == n){
            for (int nums: list) {
                System.out.print(nums + " ");
            }
            if(list.size() == 0)
                System.out.print("{}");
            System.out.println();
            return;
        }

        //not pick or not take condition, this element is not added to your subsequences
        printAllSubsequences(i+1,list,arr,n);

        //pick or take the particular index into the subsequence
        list.add(arr[i]);
        printAllSubsequences(i+1,list,arr,n);
        list.remove(list.size()-1);
    }
}
