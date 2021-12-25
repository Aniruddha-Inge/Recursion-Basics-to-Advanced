package com.aniruddha.Q9;

import java.util.Scanner;

public class CheckIfTheGivenStringIsAPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str,0));
    }
    static boolean isPalindrome(String s, int i){
        int n = s.length();
        if(i>=n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return isPalindrome(s,i+1);
    }
}
